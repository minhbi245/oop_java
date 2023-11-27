package data;

// Ta phát hiiện điều thú vị là: SQUARE/HÌNH VUÔNG IS A (KIND OF)/A SPECIAL CASE/ A VERSION OF RECTANGLE/HÌNH CHŨ NHẬT
// Nói ngắn gọn: HV là HCN, luôn đúng, đọc 1 chiều thoy hen
//                  vậy Square dư sức tham dự vào mảng của Rectangle
// độ lại Khuôn/Class mới từ Khuôn/Class cũ, mới có được câu Square là phiên bản mới từ Rectangle
// Rectangle/Hình Vuông là Rectangle/Hình chữ nhật, KHUÔN SQUARE rõ ràng là 1 dạng khuôn RECTANGLE
// SQUARE và RECTANGLE cùng nhà, và chung mảng, thì FOR SẮP XẾP ĐƯỢC
// Cách tiếp cận sự tương đồng giữa các khuôn, sự kế thừa giữa các khuôn, dùng lại
//                                                          => INHERIT/INHERITANCE
// Nếu viết theo cách cũ thì 2 khuôn độc lập nhau, mà 2 khuôn độc lập thì ko chung mảng được
// Còn viết theo cách kế thừa/inherit, 2 anh em chung 1 nhà -> thì chung mảng và sắp xếp dđược
// Việc kế thừa dành cho những gì tương đương nhau, series phiên bản
// Vậy RECTANGLE/HÌNH CHỮ NHẬT CÒN GỌI LÀ KHUÔN/CLASS CHA, PARENT, SUPER, BASE, PHIÊN BẢN GỐC
// SQUARE/HÌNH VUÔNG CÒN GỌI LÀ CLASS/KHUÔN CON, CHILD, BUB, DERIVED CLASS/ CLASS TRÍCH XUẤT/DẪN XUẤT TỪ CLASS CHA
// SQUARE LÀ RECTANGLE, CHO NÊN SQUARE SẼ CÓ TẤT CẢ MỌI THỨ MÀ RECTANGLE CÓ, KO CẦN PHẢI VIẾT LẠI, COPY PASTE LẠI CODE
// SQUARE LÀ RECTANGLE, NÓ PHẢI HÀNH XƯỬ NHƯ RECTANGLE, HÀM XÀI LẠI LUÔN CỦA RECTANGLE
// KẾT THỪA KO PHẢI LÀ COPY/PASTE NHƯ HỒI NAÃY, COPY/PASTE LÀ CÁCH LƯỜI GÕ CODE
// KẾ THỪA LÀ XÀI LẠI 100% MÀ KO CẦN GÕ LẠI CODE - ĐÚNG Ở NGOÀI ĐỜI LUÔN

/**
 * Lưu ý khi chơi với kế thừa:
 * 1. Khi chơi với kế thừa, phải tôn trọng phễu/constructor gốc của CON
 *      SQUARE trươước khi chơi với RECTANGLE, SQUARE vẫn là SQUARE, phễu/constructor có 3 tham số
 *      Để đúc 1 SQUARE: owner, color, edge
 *      phễu/constructor SQUARE vẫn cần có phễu/constructor nhận vật liệu
 *                                          phễu chảy thẳng lên RECTANGLE, vì SQUARE là RECTANGLE
 *                                          dữ liệu của SQUARE chính là dữ liệu RECTANGLE
 *      CHO NÊN PHẢI TÔN TRỌNG CONSTRUCTOR/PHUỄ CỦA CON, ĐỘ LẠI 1 TÍ PHỄU CỦA CON
 */
public class Square extends Rectangle {

    // SQUARE là RECTANGLE, ko cần làm lại những gì RECTANGLE đã làm, ko cần field/property/attributes, RECTANGLE đã có sẵn rồi
//    public Square(String owner, String color, double width, double length) {
//        super(owner, color, width, length);
//    }   // super(owner, color, width, length); ~~~ new Rectangle(owner, color, width, lenght);
        // Đẩy/Đổ vật liệu cho Cha/Rectangle giữ dùm, vì ko cần làm lại
        // new Square() -> cắt Hình Vuông, tạo ra Hình Vuông/Square, hoặc có thể hiểu xa hơn là cắt ra Rectangle/Hình chữ nhật
        // new Square() chính là new Rectangle(), cắt Hình Vuông/Square -> chính là cắt Rectangle/Hình chữ nhật


    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        // DUNG HÒA CHA CON, ĐỌC HAY LẮM LUÔN NHA
        // SQUARE CÓ CẠNH EDGE CHÍNH LÀ RECTANGLE CÓ CẠNH EDGE(WIDTH), EDGE(LENGTH) -> HAI CẠNH BẰNG NHAU
    }

    // Con có hàm trùng tên 100% tên với hàm Cha
    // Con qua mặt Cha, phủ quyết, vờ như không thấy hàm Cha
    // Đặc trưng cho 1 thứ gọi là tính đa hình, đã xạ, đa ánh xạ, đa nhân cách/50 sắc thái/transformer/POLYMORPHISM
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-15s|%10s|%4.1f|%7.2f|\n", owner, color, width, getArea());
    }
}
