//import data.Rectangle;
//import data.Shape;
//import data.Square; // Mượn đồ để xài

import data.*;   // .* tức là import hết tất cả các Khuôn có trong ngăn tủ
import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
//        sortShapes();
        playWithAnonymousClass();
    }


    // Kĩ thuật tạo object/vùng new ma à ko cần Khuôn cụ thể
    // Dành cho những object vô định hình, ko có công thưcức để tính toán và nhân bản, ko có Khuôn cố định, cắt hình ngẫu nhiên, nhưng vẫn là hình
    // ÉO BIẾT NHÓM CON NÀO CẢ
    // NHƯNG VẪN CHẮC CHẮN LÀ HÌNH: CÓ ĐƯỜNG NÉT, MÀU, CẠNH, BỀ MẶT
    // ÉO CÓ CÔNG THỨC TÍNH CHUNG, ÉO NHÂN BẢN LẠI ĐƯỢC NHANH CHÒNG
    // HCN CẮT NHANH CHÓNG, HÌNH ELIPSE NHANH, HBH NHANH
    // HÌNH CẮT GẤP KHÚC, MỖI HÌNH LÀ DUY NHẤT, KO CẮT NHANH ĐƯỢC, KO CÓ KHUÔN
    // OBJECT VÃNG LAI, KO THƯỜNG XUYÊN SỬ DỤNG/LÀM/GẶP
    // DÙ LÀ HÌNH KIỂU GÌ, CÔNG THỨC CHUNG: NEW CHA/SUPER CHA + @OVERRIDE
    public static  void playWithAnonymousClass() {

        // Shape noName = new NoName(...); // Bên trong phải full code cho Cha Shape
        // Shape x      = new Rectangle(...);//                 //
        // CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO NHIÊU CẠNH MÀ ĐƯA VÀO???
        // CHỈ ĐƯA ĐƯỢC MÀU, TẶNG AI
        // NẾU MUỐN RÕ RÀNG THÌ CẮT VƯƠNG, TRÒN, CHỮ NHẬT, HBH, MŨI TÊN
        Shape vangLai = new Shape("HÌNH NGẪU NHIÊN/CHÍNH MÌNH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
                return 50;  // Vì hinh cụ thể, ko theo hình dạng nào, ta tự đo
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|\n", "NGẪU NHIÊN", owner, color, borderColor, getArea());
            }
        };  // VIP
            // mày là 1 hình, thoải mái vào mảng Shape sort nếu muốn
            // Mày vẫn là Shape, kiểu Shape, có dđủ code cho hàm Cha/Khuôn Class
            // Kĩ thuật mượn gió bẻ măng, mượn cha taạo Con, mượn Shape new Con
            // NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRRIDE
            // THỎA CÔNG THỨC CON = NEW CHA + @OVERRIDE
            // CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIẾN
            // LÀM KHUÔN CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN

        vangLai.paint();
    }

    public static void sortShapes() {
        // sort thì đương nhiên cần mảng, mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0);

        // Khai báo mảng để sắp xếp
        // Trong mảng chứa địa chỉ vùng new, chứa tọa độ vùng new
        // Mảng Object, mảng Shape, Mảng Studen chỉ là chứa tọa độ tham chiếu đến thôi
//        Shape[] box = new Shape[7];
//        box[0] = new 1 hình cụ thể nào đó, new Rectangle(...), new Disk(...)
        // Cần lắm luôn [i] lưu toọa độ vùng new()
        // [i] i tham chiếu vùng new, trỏ vùng new, lưu địa chỉ vùng new()
        // Vùng new() nằm đaâu trong HEAP kệ nó
//        Shape[] arr = new Shape[7];
//        arr[0] = r1;    // Hài chàng trỏ một nàng
////        arr[0].paint();
//        arr[1] = arr[0];    // 3 chàng trỏ một nàng luôn, này ko ai cấm, vì cơ bản chỉ là truyền điịa chỉ thôi
//        arr[2] = d2;    // Tao cần tọa độ vùng new Hình nào đó()

        // Shape[] arr = new Shape[]{ các tọa độ vùng new() đưa vô};
        //                          [i] =
        Shape[] arr = new Shape[] {r1, r2, s1, s2, s3, d1, d2};
        //                      arr[0]
        // Shape[] arr = new Shape[] {new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2.0),
        //                            new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1.0)};

        System.out.println("The list of shapes");
        for (Shape x: arr) {
            //  x = arr[1], x = arr[1], x = arr[2], x = arr[i]...
            x.paint();  // Tính đa hình/polymorphism
            // GỌI HÀM PAINT CỦA CHA, NHƯNG 3 ĐƯA CON TỰ DĐỘNG QUA MẶT
            // CHÚT LO LẮNG: PAINT() CỦA CHA ÉO CÓ CODE THỰC THI VÌ ĐANG LÀ ABSTRACT
            // NHƯNG ĐỪNG LO VÌ LÁT HỒI MẤY ĐỨA CON CỦA SHAPE NHƯ TRIANGE, DISK, RECTANGLE, SQUARE NÓ LO, DO MÌNH NEW CON KO HÀ
            // NEW CON CON ĐÃ VIẾT CODE RỒI, CHA NGỒI IM CON LO CHO
            // CON SẼ GIẢI QUYẾT CHUYỆN HOÀN HẢO CHO CHA
            // TỪ HÀM CHA GỌI, CON HƯỞNG ỨNG, N CON HƯỞNG ỨNG
            // TỪ 1 ÁNH XẠ RA NHIỀU CÁCH THỨC, TA GỌI LÀ TÍNH ĐA XẠ ĐA HÌNH, 50 SẮC THẮI -> POLYMORPHISM
        }

        // Sắp xếp tăng dần theo Diện tích/S
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape tmp = arr[i]; // đa hình nè: getArea() là của Cha
                    arr[i] = arr[j];    // abstract, đừng lo, con sẽ lo
                    arr[j] = tmp;       // vì [i] luôn trỏ 1 hình cụ thể
                }                       // getArea() là cụ thể của Con
            }
            // tâo arr[i] đang trỏ 1 hình có Diện tích/S là?
            // tao arr[j] đang trỏ 1 hình có Diện tích/S là?
            // So sách 2 diện tích có ổn ko? ko ổn thì đổi việc trỏ
            // thằng arr[i] phải trỏ vào thằng hình mà arr[j] đang trỏ
            // mày trỏ vào S mà ko đúng thứ tự, thì phải đổi vị trí trỏ thôi
        }

        System.out.println("The list of shapes sorting ascending by area ");
        for (Shape x: arr) {
            x.paint();
        }
    }
}