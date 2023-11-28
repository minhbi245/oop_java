import data.RightTriangle;
import data.Triangle;

public class Main {
    public static void main(String[] args) {
        playWithTriangle();
    }

    public static void playWithTriangle() {

        // 1. Cha     new Cha (chú ý với trường hợp cụ thể - concrete class) đối nghịch với concrete class là abstract class - class trừu tượng
        // gọi đúng chuẩn: Triangle là Triangle
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint();

        // 2. Con           new Con gọi tên đúng chuẩn, đúng là nó -> RightTriangle là Triangle
        RightTriangle rt1 = new RightTriangle("MÁ", "PINK", 6, 8);
        rt1.paint();

        // 3. Cha      new  Con, đọc kiểu IS A. Dùng 2 danh nghĩa, Con là phiên bản của Cha
        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6, 8);
        // Tam giác  <---------  Tam giác vuông, nó vẫn là TGV như câu lệnh trên
        rt2.paint();    // HÀNH XỬ NHƯ cha
                        // NHƯNG LÚC CHẠY THÌ HÀNH XỬ NHƯ CON, NẾU CON TRÙNG TÊN HÀM VỚI CHA
                        // CHA NGỒI IM ĐỂ CON LO/LÀM/CON HÀNH XỬ, OVERRIDE QUA MẶT CHA

        // KHAI BÁO GÌ THÌ PHẢI HÀNH XỬ NHƯ THẾ, VÌ MÌNH SẼ ĐẶT TÊN CHO OBJECT THEO
        // DATA TYPE. OBJECT SẼ NEW THUỘC NHÓM GÌ/KHUÔN/CLASS, THEO KHUÔN/CLASS MÀ NHÌN HÀM/ NHÌN HÀNH XỬ
        // NHÌN HÀM
    }
}