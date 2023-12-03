package data;

/*
    CÁC BƯỚC ĐỂ KẾ THƯỪA
    1. PHÁT HIỆN IS A THÌ EXTENDS
    2. KHAI BÁO ĐẶC ĐIỂM CỦA CON
        2.1 NẾU CON TRÙNG VỚI CHA VEỀ ĐẶC ĐIỂM THÌ TA KO CẦN KHAI BÁO, KO CẦN LÀM, CHA LO
        2.2 CON THÌ CÓ QUYỀN DỊ BIỆT(CÓ NHỮNG ĐẶC ĐIỂM HOẶC HÀNH VI KHÁC CHA) DỊ BIỆT THÌ HÀNH ĐỘNG LUÔN (KO CẦN @OVERRIDE LẠI)
    3. TẠO PHỄU CHO CON, NHƯNG PHẢI GIỮ BẢN SẮC CỦA CON
 */
public class Rectangle extends Shape {
    // 1. IS A          extends
    // 2. Đặc điểm: con trùng cha thì gửi cha giữ hết khỏi làm gì
    //              Con dị biệt, làm như bình thường
    // 3. Phễu, nhớ thỏa hiệp nếu cần, đôổi thứ tự biến cho thuận chiiều đọc
    // 4. Hàm của con: có quyền làm dị biệt như bình thưường (ảnh hưởng đến tổ lái con trỏ)

    /*
        CLASS RECTANGLE CON THỪA KẾ TỪ CHA SHAPE, CHA NÀY LÀ ABSTRACT, CHO NÊN CON CHỈ CÓ 2 LỰA CHỌN DUY NHẤT
        4.1 Con làm biếng, ko thèm làm điều cha nói, ko thèm viết code cho hàm abstract từ Cha
            Nếu class chừa hàm abstract thì mày chỉ là khái niệm, mày ko hoàn hảo, do đó nó KHÔNG THỂ NEW ĐỂ TẠO ĐƯỢC OBJECT
            Cha, ko thể new vì chưa hoàn hảo, Con cũng thế, ko new được, nói vui là DÒNG HỌ VÔ SINH -> KO ĐÚC RA ĐƯỢC OBJECT

         4.2 Vì bài này là Hình Chũ Nhật là rõ ràng có 2 cạnh rất cụ thể, tính được ngay Diện tích/S, chu vi/P sợ gì mà ko viiết code cho function abstract
         -> CON/RECTANGLE có trách nhiệm hoàn tất điều Cha/Shape nói (getArea, getPermitive), viết code thực thi cho hàm abstract có ở Cha/Shape
         vì nếu ko làm thì nó VÔ SINH, nó ko new được vì do ko hoàn hảo đó
         new/đúc ra được object rồi thì chấm getArea() làm gì có code mà chạy
         Con nếu ko muốn vô sinh/tức là ko new được, thì PHẢI VIẾT CODE CHO TẤT CẢ CÁC HÀM ABSTRACT CỦA CHA
         IMPLEMENT ALL OF PARENT'S ABSTRACT METHODS
         implement the body of a funtion, the body of parent's abstract methods
         @Override
         // TA KO ĐEM BÁN ĐƯỢC, VÌ CHƯÂ HOÀN HẢO ĐÓ
     */
    protected double a, b; // a: width, b: length

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    /*
        PHẦN DỊ BIỆT CON PHẢI LÀM
        CÁC VUA HUNG ĐÃ CÓ CÔNG.... BÁC CHÁU TA .... CHỖ NÀY ĐÂY
        CHA: TAO CHỈ NÓI VẬY, MÀY MUỐN LÀM SAO THÌ LÀM
     */
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) / 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner, color, borderColor, a, b, getArea());
    }
}
