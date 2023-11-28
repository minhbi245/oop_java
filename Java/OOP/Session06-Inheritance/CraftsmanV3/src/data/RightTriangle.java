package data;

/**
 *  1. Phát hiện ddược IS A đọc 1 chiều, lập tức tiếp cận làm Khuôn/Class mới kiểu mới
 *  gõ extends Khuôn/Class Cha
 *
 *  2. Khai báo các đặc tính cho Con, nếu trùng lại với Cha, tương đồng với Cha, thì để Cha giữ, Cha lo
 *  ko cần khai báo lại đặc tính Con nếu Cha có tương đương
 *
 *  3. Làm phễu cho Con, nhớ là phải giữ bản sắc của Con, tôn trọng phễu, đầu vào của Con
 *  sự khác biệt góc nhìn Cha và Con, Cha cần 3 cạnh, Con chỉ cẩn 2 cạnh vuông
 */
public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt((a * b) + (b * b)));   // Vì new Con chính là new Cha, cắt RightTriangle chính là cắt một Triangle
                                        // new Con chính là new 1 phiên bản Cha
    }

    @Override
    public void paint() {
        System.out.printf("R.TRIANGLE|%-15s|%10s|%4.1f|%4.1f|  - |%7.2f|\n", owner, color, a, b, getArea());
    }
}

/**
 * LIÊN QUAN ĐẾN KẾ THỪA SẼ CÓ 2 ĐIỀU CẦN LƯU Ý
 * 1. DI TRUYỀN:
 *  CHA CÓ GÌ CON XÀY NẤY, CHA CÓ THÊM GÌ, CON CÓ THÊM NHƯ CHA, CHA BỚT ĐI CÁI GÌ, CON CŨNG BỊ BỚT
 *
 *  2. BIẾN DỊ:
 *  CON KHÁC CHA À NGHE, ĐIỀU GÌ XẢY RA - KĨ THUẬT DRIFT, RẼ BÁNH
 */
