public class Main {
    public static void main(String[] args) {
        // playWithIntegers();
        // playWithPointers();
        playWithPool();
    }

    /*
        Pool là 1 vùng ram chứa các vùng new của Wrapper và String, giống hồ bơi ngoài đời
        nhiều object tắm chung
        chỉ áp dụng kĩ thuật hồ bơi cho một số tình huống đặc biệt thôi
        ko được nhầm với static
     */
    public static void playWithPool() {
        Integer n1 = new Integer("2000");
        Integer n2 = new Integer(2000); // ít dùng từ JDK 10 trở đi nên ko nên khai báo cách này
        Integer n3 = 2000;
        Integer n4 = 2000;

        // Hỏi n3 có bằng n4 hay ko??
        boolean result = n3 == n4;  // hỏi con trỏ hoy, so sánh địa chỉ hoy
        System.out.println("n3 == n4?: " + (n3 == n4));  // 2 vùng new khác nhau
        System.out.println("n3 == n4? (core): " + n3.equals(n4));  // 2 vùng new khác nhau
        // value lõi bằng nhau -> true
        // nó ko bằng về con trỏ, nhưng nó bằng về value lõi bên trong, vào bên tỏng mà so

        // n2 vs n3: n2 có bằng n3 ko, n1 với n2 có bằng nhau hem
        // 4 thằng kko bằng nhau vì đều là biến con trỏ, value của card, thẻ bài, mỗi thằng
        // là thẻ bài, ghi địa chỉ vùng new, mà trỏ new thì khác nhau mà
        // ÉO BẰNG VỀ CON TRỎ, ÉO TRỎ CHUNG
        // CHỈ BẰNG BÊN TRONG LÕI THÔI
        System.out.println("n1 == n2?: " + (n1 == n2)); // ÉO
        System.out.println("n2 == n3?: " + (n2 == n3)); // ÉO

        // MÀ GÁN MỚI LÀ TRỎ MỚI VÌ CHỈ READ-ONLY, IMMUTABLE CLASS

        // VI DIỆU:
        Integer n5 = 127;
        Integer n6 = 127;
        // n5 bằng n6 hok? SO CON TRỎ HOY, LÕI THÌ BẰNG NHAU RỒI

        //  -129-false, -128-true   ... TRUE ...   127-true, 128-false
        //                          TRUE {-128, ..., 0, ...., 127}
        // CHƠI NEW NGẦM TRONG ĐOẠN TỪ -128 ĐẾN 127 THÌ XÀI POOL

        // n5 = 127 -> ~~~ new ngầm Integer(127)
        // n6 = 127 -> no ko new ngầm nữa mà xài ké 127 ở trên: 2 chàng trỏ 1 nàng
        // n7 = 127 -> mình tắm chung luôn 3 chàng 1 nàng
        System.out.println("n5 == n6?: " + (n5 == n6));
        Integer n7 = 127;
        System.out.println("n5 == n7?: " + (n5 == n7));

        // có 256 vùng new [-128 .... 127] dùng chung cho n biến Integer
        // nhung nếu xài kiểu BOXING NEW NGẦM

        Integer n8 = new Integer(127);

        // hỏi n7 và n8 có bằng nhau ko
        System.out.println("n7 == n8?: " + (n7 == n8));

        Integer n9 = new Integer("127");
        // hỏi n8 và n9 có bằng nhau ko?
        System.out.println("n8 == n9?: " + (n8 == n9));
        // éo xài pool, tọa độ khác òi

        // CHỐT HẠ: CẤM TUYỆT ĐỐI SO SÁNH 2 BIẾN OBJECT QUA TOÁN TỬ ==
        // VÌ SO SÁNH 2 ĐỊA CHỈ, LÚC BẰNG LÚC KO DO CÓ POOL HAY KO
        // CHÍNH XÁC PHẢI SO SÁNH 2 OBJECT QUA DẤU CHẤM, VÀO BÊN TRONG MÀ LẤY DATA/VALUE MÀ SO
        // CHẤM ĐỂ SO SÁNH OBJECT!!!!!!!!!!
    }

    public static void playWithPointers() {
        int n0 = 2003;
        int n00 = 2003;

        /*
            Hỏi: n0 có bằng n00 ko?
            Ví hai biến trên đều là primitive nên tất nhiên lấy giá trị ra so sánh nên bằng nhau
         */

        if (n0 == n00) {
            System.out.println("2 thằng này n0 và n00 bằng nhau");
        } else {
            System.out.println("2 thằng này n0 và n00 KO bằng nhau");
        }

        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003); // ko khuyến dùng cách khai báo này
        Integer n3 = 2003;
        Integer n4 = 2005;

        /*
            Hỏi: n3 có bằng n4 ko?
            so sánh 2 tọa độ, 2 địa chỉ vùng new khác nhau
            là ta đang đi so sánh 2 biến object, biến con trỏ
            ĐI SO SANH SỐ NHÀ LÀM ÉO GÌ MÀ SO SÁNH ĐƯỢC
            NHƯNG BẢN CHẤT LÕI LÀ BẰNG NHAU VÌ CÙNG 2003
            CHỐT HẠ: CẤM TUYỆT ĐỐI KO SO DÙNG TOÁN TỬ SO SÁNH TRUYỀN THỐNG
            > >= < <= == KHI ĐEM ĐI SO SÁNH 2 BIÊN OBJECT/BIẾN THAM CHIẾU/BIÊN CON TRỎ
            MUỐN SO SÁNH 2 BIẾN, KO NÊN, MÀ PHẢI ĐI VÀO BÊN TRONG VÙNG TRỎ ĐÓ
            COI COI CÓ VALUE GÌ ĐỂ MÀ ĐEM ĐI SO SÁNH THÌ MỚI HỢP LÍ
         */

        // n3 ơi mày có value gì vậy, tao muốn so sánh với value của n4
        // đi vào vùng new mà SO SÁNH
        // SO BÊN TRONG VÙNG NEW ỚI LÀ ĐÚNG, VÌ SO SÁNH ĐẶC ĐIỂM, CHỨ AI ĐI SO SÁNH NICK NAME

        // ĐI VÀO VÙNG NEW TỨC LÀ CHẤM . LẤY VALUE LÕI, CÂU HỎI EQUALS COMPARE TO
        // N3. N4.
        // VIỆC SO SÁNH DIỄN RA Ở ĐÂU - HÀM SO SÁNH() ĐẶT Ở ĐÂU???
        System.out.println("n3 vs n4 (core) " + n3.equals(n4));
        System.out.println("n3 vs n4 (core) " + n3.compareTo(n4));


        if (n3 == n4) {
            System.out.println("2 thằng này n3 và n4 bằng nhau");
        } else {
            System.out.println("2 thằng này n3 và n4 ÉO bằng nhau");
        }
    }

    public static void playWithIntegers() {
        int num1 = 2003;    // 4 byte hoy
        Integer num2 = new Integer("2003"); // tốn 2 vùng ram đó heng
        Integer num3 = new Integer(2003);   //  2 vùng ram
        Integer num4 = 2003;    // cách tự nhiên hơn nhưng new ngầm đó nhen, vẫn phải new ngầm nghen
        // n2, n3, n4 trỏ 3 vùng ram mà cái lõi/core của vùng ram là new Integer, lõi vùng new là int 2003

        // in ra thì sao??
        System.out.println("n1: " + num1);  // print xài luôn value
        System.out.println("n2: " + num2);  //  gọi con trỏ, trỏ tới vùng RAM dùng luôn giá trị, gọi thầm tên em, in biến con trỏ
        System.out.println("n3: " + num3.toString());  //
        System.out.println("n4: " + num4.intValue());

        // Integer num4 = 2003;
        Integer num5 = num1;    // CPU xử lí giống nhau, new ngầm Integer()
                                // nhét vào trong lõi Integer vùng new á, con số
                                // in 2003 core/lõi
        // CƠ CHẾ BOXING/ĐÓNG HỘP/WRAPPING: KHI TA GÓI CÁI PRIMITIVE -> OBJECT
        System.out.println("n5: " + num5);   // gọi thầm tên em

        // int num6 = 2001; đây là primitive, quen quá rồi
        int num6 = num5;    // á đù, chuyền gì xảy ra? -> MỞ HỘP QUÀ
                            // UNBOXING: KHI TA MỞ HỘP, LẤY VALUE LÕI -> GÁN RA PRIMITIVE
                            // VẪN TƯƠNG THÍCH, PHÙ HỢP
                            // UNBOXING: OBJECT -> PRIMITIVE
        System.out.println("n6: " + num6);

        num5 = 2000;  // điều gì diễn ra trong RAM?
        // vùng new mới Integer(lõi là 2000)
        // éo quan tâm vùng new Cũ (2003)
        // VẬY THÌ INTEGER KO CÓ KHÁI NIỆM SET(), TỨC LÀ MỖI LẦN GÁN VALUE LÀ 1 LẦN NEW MỚI, KO XÀI LẠI VÙNG NEW CŨ
        // KO CÓ CƠ CHẾ SET() LẠI CÁI GÌ ĐÃ ĐỖ LÚC NEW. KO CHO PHÉP THAY ĐỔI VALUE LÕI, TỨC LÀ READ-ONLY, CHỈ ĐỌC THÔI
        // KO CHO GHI/KO CHO CHỈNH SỬA
        // INTEGER CHỈ CÓ HÀM GET() KO CÓ HÀM SET()
        // KO HÀM CHO THAY ĐỔI BÊN TRONG, NGOẠI TRỪ LÚC ĐÚC
        // CLASS CHỈ READ-ONLY ĐẶC ĐIỂM
        // THÌ CLASS NÀY ĐƯỢC GỌI LÀ IMMUTABLE CLASS

        // CLASS NÀO MÀ CHO PHÉP THAY ĐỔI VALUE ĐÃ ĐƯỢC ĐÚC, THÌ GỌI LÀ MUTABLE CLASS

        // CÓ TỔNG CỘNG 8 CÁI WRAPPER CLASS/TRAI BAO CLASS TƯƠNG ỨNG VỚI 8 PRIMITIVE
        // Byte     Short       Integer     Long        Float       Double      Boolean     Character
        // byte     short       int         long        float        double      boolean     char

    }
}