import data.*;

public class Main {
    public static void main(String[] args) {

//        playWithShapres();
        sortShapes();
    }

    public static void sortShapes() {
        // Sắp xếp các hình giống như Bé Na
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 5.0, 6.0);
        // Shape hết cũng okie

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "MAGENTA", "PINK", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        // Khai báo Shape hết cũng okie, vì đọc được IS A
        Square driftX = (Square) s3;
        driftX.sayHi();
        ((Square)s3).sayHi();


        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", 6.0, "<3");
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", 6.0, ":x");
        // SHAPE hết cũng okie luôn

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

        r1.paint(); // Con, new Con, chạy paint() của RECTANGLE
        r2.paint(); // Cha, new Con, paint của Shape nhưng chạy paint() của Rect, qua mặt/override Shape
        s1.paint(); // paint() của Shape, chạy paint() của Square
        s2.paint(); // paint() của Rect, chạy của con Square, qua mặt Rectangle
        s3.paint(); // paint() của Shape/Ông nội, chạy của Square/Cháu, qua mặt Shape/Ông nội
        d1.paint(); // paint() của  Con, chạy paint của Con
        d2.paint();
        t1.paint();
        t2.paint();

        // Trong mọi tình huống chấp Cha, Ông nội thế nào, luôn luôn chạy paint() được đúng ngũ cảnh
        // tui sắp xếp luôn cho mà xem
//        Shape[] arr = new Shape[9];
        // Có 9 biến Shape đặt tên là arr[0], arr[1] arr[2] ....
        // mới có 9 con trỏ, chưa có object nào
        // arr[0] arr[1] arr[i] = cần lắm luôn bằng, trỏ tọa độ của cùng new
        // new Rectangle(), new Disk(), new Triangle, new Square() new con mẹ nào đó mà là một Shape, IS A Shape, cùng họ, cùng kiểu mới chung mảng
        // Cần tọa độ new nào đó thả vào arr[i]
//        arr[0] = r1;    // 2 chàng trỏ 1 nàng
//        arr[1] = r2;
//        arr[2] = s1;
//        arr[3] = s2;
//        arr[4] = s3;
//        arr[5] = d1;
//        arr[6] = d2;
//        arr[7] = t1;
//        arr[8] = t2;

        // ĐÃ HỌC RỒI, ÉO THÈM LÀM
        Shape[] arr = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};    // value được gán
        //                          vùng new được gán vào HỌC RÒI
        //                       arr1[0]

        System.out.println("The list of shapes");
        for (Shape x: arr) {
            // x = arr[0]; x = arr[1]; x = arr[i]...
            x.paint();
        }   // GỌI ÔNG NỘI, ABSTRACT ĐÓ HENG, NHƯNG ÉO SỢ
            // VÌ TÙY CON/CHÁU LÀ AI, THÌ OVERRIDE, HỌC Ở NGAY TRÊN RỒI
            // GỌI ÔNG NỘI, NHƯNG CON/CHÁU QUA MẶT TÙY TÌNH HUỐNG CON LÀ OBJECT NÀO
        /*
                HIỆN TƯỢNG TỪ 1 HÀM PAINT() NHƯNG CÓ N CÁCH VIẾT CODE KHÁC NHAU
                Ở MÚC CON CHÁU, CÓ N CÁCH CHẠY KHÁC NHAU LÚC RUN-TIME
                TỪ 1 HÀM PAINT() MÀ CÓ ĐẾN RẤT NHIỀU CÁCH CÀI ĐẶT/ VÀ THỰC THI
                TỪ 1 BIẾN HÌNH, ĐA HÌNH DẠNG, ĐA CÁCH THỨC, ĐA NHÂN CÁCH, 50 SẮC THÁI
                BIÊN HÓA KHÔN LƯỜNG, TRANSFORMER, TỪ 1 BIẾN HÓA RA NHIỀU QUA HÌNH DẠNG OVERRIDE
                HIỆN TƯỢNG NÀY, KĨ THUẬT NÀY LÀ TÍNH ĐA ÁNH XẠ, ĐA HÌNH DẠNG
                ĐA SẮC THÁI -> POLYMORPHISM
                1 HÀM CHA/HAY LÀ ÔNG TỔ CÓ N HÀM CON @OVERRIDE, HIỆN TƯỢNG ĐA HÌNH DẠNG

                CHA LÊN TIẾNG PAINT() ĐÁM CON HƯỞNG ỨNG LIỀN
                ĐẠI CA LÊN TIẾNG, ĐÀN EM XÁCH MÃ TẤU, LẤY HÀNG LIỀN

                CÂU BÁC HỒ: AI CÓ SÚNG DÙNG SÚNG, AI CÓ GƯƠM DÙNG GƯƠM...
                                                                      ĐA DẠNG CÁCH THỨC GIẾT GIẶC CỦA NGƯỜI DÂN
                            HIỆN TƯỢNG ĐA HÌNH, VIỆC GIẾT GIẶC RẤT ĐA DẠNG, NHƯNG GỌI CHUNG LÀ GIẾT GIẶC

                OOP: ABSTRACTION, ENCAPSULATION, INHERITANCE, POLYMORPHISM
                                        X           X               X

         */

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; // Đa hình tiếp nè, gọi hàm Cha, éo có code
                    arr[i] = arr[j];    // Chạy hàm Con nè, vượt mặt cha/ông cố nội nè
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("The array of shapes after sorting ascending by area");
        for (Shape x: arr) {
            x.paint();
        }
    }

    public static void playWithShapres() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "CYAN", 6, 10);
        Shape r2 = new Rectangle("TÍA", "ORANGE", "GREEN", 6, 5);

        Disk d1 = new Disk("MÁ", "PINK", "CYAN", 4, ":))");
        Shape d2 = new Disk("MÁ", "ORANGE", "GREEN", 4, ":))");

        r1.paint(); // của ai??? Của Con, chạy của Con
        r2.paint(); // của ai??? Của Cha, chạy của Con, Con qua mặt
        d1.paint(); // của ai??? Của Con, chạy của COn
        d2.paint(); // của ai??? của Cha, nhưng lại chạy của Con, Con qua mặt Cha
        // => Cha éo có code trong hàm, tuy nhiên ko lo, vì Con qua mặt(@Override)
        // Chơi trò khai Con new Con -> ko ảnh hương
        //               Cha new Cha
        // KO LO LĂNG CHA KO HOÀN HẢO, CON CÂN HẾT
        // PAINT() Ở TRÊN CHÍNH LÀ HIỆN TƯỢNG ĐA HÌNH - POLYMORPHISM
        // KHAI CHA NEW CHA, CHUYỆN MỚI HOÀN TOÀN - KHÓ (LEVEL 3)
    }
}
