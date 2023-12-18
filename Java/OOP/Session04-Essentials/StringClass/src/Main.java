public class Main {
    public static void main(String[] args) {
        playWithString();
    }

    public static void playWithString() {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");

        String s3 = "HELLO";
        String s4 = "HELLO";

        // hỏi:
        // s1 có bằng s2 ko
        boolean result = s1 == s2;
        System.out.println("s1 vs s2?: " + result);

        // s2 có bằng s3 ko?
        System.out.println("s2 vs s3?: " + (s2 == s3));

        // s3 có bằng s4 ko?
        System.out.println("s3 vs s4?: " + (s3 == s4));

        // CHUỖI NEW NGẦM LÀ POOL
        // POOL CHẢNH LẮM À NGHE, PHÂN BIỆT HOA VÀ THƯỜNG
        String s5 = "Hello";
        //s4 có bằng s5 ko?
        System.out.println("s4 vs s5?: " + (s4 == s5));

        // CHO NÊN CÙNG 1 KẾT QUẢ: ÉO CHO SO SÁNH 2 CHUỖI QUA TOÁN TỬ BẰNG BẰNG
        // VÌ LÚC ĐÚNG LÚC SAI DO CHUNG POOL HAY KO
        // SO SÁNH 2 BIẾN OBJECT LÀ VÔ NGHĨA
        // BẮT BUỘC VÀO VÙNG NEW MÀ SO SÁNH, LÀ PHẢI CHẤM ĐỂ MÀ SO SÁNH
        // .comapareTo(), .equals()

        // MỌI OBJECT MÌNH TẠO RA HAY NGƯỜI TA TẠO RA SẴN THÌ LUÔN NÊN CÓ 2 HÀM ỨNG VỚI 2 LOẠI CÂU HỎI:
        // TAO BẰNG MÀY KO?
        // TAO SO VỚI MÀY THẾ NÀO?
        // equals(MÀY)      compareTo(MÀY)
        // CHẤM ĐỂ LẤY VALUE MÀ SO BÊN TRONG
        // HÀM Ở CHỖ CÓ DATA THÌ TIỆN XỬ LÍ

        System.out.println("s4 vs s5 (core)?: " + s4.equals(s5));

    }
}