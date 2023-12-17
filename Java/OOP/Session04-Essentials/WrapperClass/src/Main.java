public class Main {
    public static void main(String[] args) {
        playWithIntegers();
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