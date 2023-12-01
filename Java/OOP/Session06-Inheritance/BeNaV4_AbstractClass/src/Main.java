import data.Disk;
import data.Rectangle;
import data.Shape;

public class Main {
    public static void main(String[] args) {

        playWithShapres();

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
