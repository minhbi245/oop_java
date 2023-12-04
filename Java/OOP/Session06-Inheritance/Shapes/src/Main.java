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

    }
}