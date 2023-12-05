//import data.Rectangle;
//import data.Shape;
//import data.Square; // Mượn đồ để xài

import data.*;   // .* tức là import hết tất cả các Khuôn có trong ngăn tủ
import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        sortShapes();
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