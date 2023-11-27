import data.Disk;
import data.Rectangle;
import data.Square;

public class Main {
    public static void main(String[] args) {
//        cutShapes();
        sortShapes();
    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("MY SQUARE", "YELLOW", 3.0);
        s1.paint();

        Disk d1 = new Disk("MY DISK", "GREEN", ":)", 2.0);
        d1.paint();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("MY RECTANGLE", "BLUE", 2.0, 3.0);

        Rectangle[] rectangles = new Rectangle[9];
        // Có 9 biến object Rectangle, bàn có 9 chỗ ngồi, tuy nhiên chưa có ai ghé/vào, chưa có object cụ thể
        // rectangles[0], [i] là những biến object có khuôn/class Rectangle, con trỏ đấy
        //                  = trỏ vào vùng new Rectangle(), tọa độ vùng new clone
        //                      chỉ cần có vùng new Rectangle() là được
        rectangles[0] = r1; // Ở đây là 2 chàng 1 nàng, cả 2 con trỏ đang trỏ cùng lúc tới 1 địa chỉ vùng nhớ được new/malloc()
//        rectangles[0].paint();
//        rectangles[0].setColor("TÍA YÊU");
//        r1.paint();
        rectangles[1] = new Rectangle("MÁ", "YELLOW", 5.0, 3.0);
        rectangles[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 2.0);
        rectangles[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);

        // Mảng là khai báo danh sách các biến cùng kiểu dữ liệu/data type, Square và Rectangle khác kiểu, ko cửa nào vào chung 1 mảng được
        // Square chơi mảng Square, Rectangle chơi mảng Rectangle, Disk chơi maảng Disk
        // Về lí thuyết: chỉ sort Square, Rectangle, Disk riêng, ko sort chung được
        // -> vì khác kiểu dữ liệu/data type, ko chung mảng, ko for chung được

        /*
         *  Vậy giả sử
         * ??? arr[] = new ???[9];
         * arr[0] = new Square(...);
         * arr[1] = new Rectangle(...);
         * dư sức for ???
         * Square, Rectangle chung mảng của ai???
         */

        System.out.println("Before sorting");
        // KHÔNG ĐƯỢC FOREACH NẾU MẢNG KO FULL, VÌ NẾU KO SẼ TRỎ ĐÊN ĐÁY RAM, NƠI CHƯA NULL 8 CON SỐ 0 -> NULL POINTER
//        for (Rectangle x: rectangles) {
//            x.paint();
//        }
        // CHỈ FOR ĐẾN COUNT THÔI, HOẶC BIẾT CÓ BAO NHIÊU GIÁ TRỊ ĐÃ ĐƯỢC TẠO THÌ FOR ĐẾN ĐÓ
        for (int i = 0; i < 3; i++) {
            rectangles[i].paint();
        }
        System.out.println("After sorting ascending by area/S");
        for (int i = 0; i < (3 - 1); i++) {
            for (int j = i + 1; j < 3; j++) {
                if(rectangles[i].getArea() > rectangles[j].getArea()) {
                    Rectangle tmp = rectangles[i];
                    rectangles[i] = rectangles[j];
                    rectangles[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            rectangles[i].paint();
        }
    }
}