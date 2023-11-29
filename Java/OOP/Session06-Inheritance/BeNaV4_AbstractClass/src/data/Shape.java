package data;

/**
 * TA PHÁT HIỆN ĐƯỢC 1 MỐI QUAN HỆ ĐẶC BIỆT GIỮA NHIỀU KHUÔN "KHÁC BIỆT" NHƯNG LẠI TƯƠNG ĐỒNG
 * ví dụ, anh em trong nhà, trai gái, cao thấp, ngâm ngâm, ít ngâm ngâm
 * tương đồng: Con của Ba/Má
 * ta đang nói về cái Khuôn/Class Tổ mà sinh ra nhiều Khuôn khác
 * Shape đại diện, Cha của đám Hình Vuông, Tròn, Chuữ Nhật, Tam Giác -> đọc một chiều thôi nhé
 */
public abstract class Shape {
    // Đặc tính của Cha, của Shape/Hình học là gì???

    protected String owner;
    protected String color;

    //    protected double a, b, c, radius; // ... Còn nhiều loại cạnh khác nữa, nhưng bốc mùi lắm
    // Giả sử thằng con Hình Tròn/Disk kế thừa Shape, thê sthif nó có cạnh
    // Lúc get() set() nó xổ ra 1 đống cạnh
    // Con được xài tất cả những gì của Cha
    // Phía khác Hình chứ nhật/Rectangle mà lại có radius/bán kính
    // Cha có nhiều Con, Cha là nhân tử chung của các Con/Child
    // Chung cho các con kế thừa, phần dị biệt của mỗi đứa thì mỗi đứa giữ, mỗi đứa phải lo
    // TUYỆT ĐỐI KO ĐỂ DỊ BIỆT LÊN CHA/TỔ, DỊ BIỆT CỦA TỪNG ĐỨA CON MÀ


    public Shape(String owner, String color) {
        this.owner = owner;
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Hành động tiếp theo, hàm của tui???
    // Tính diện tích, chu vi???
    // Hàm xử lí data!!!!, ai có nhiều thông tin/info thì kẻ đó sẽ phải xử lí!!!!
    // Nhưng mà ở Khuôn/class không có data nhiều để tính toán, vì data thuộc về dị biệt rồi
    // KO CẦN HÀM getS() getP() được ko thầy???
    // KO NHA, CẤM BỎ HÀM TÍNH S(), P() VÌ LOGIC VỀ HÌNH HỌC, TƯ DUY VỀ HÌNH HỌC LÀ GÌ?
    // HÌNH HỌC CÓ ĐƯỜNG NÉT, CÓ BỀ MẶT, RÕ RÀNG LÀ TÍNH ĐƯỢC DIỆN TÍCH/S VÀ CHU VI/P (TÍCH PHÂN HÌNH HỌC NẾU GẶP BÀI TOÁN PHỨC TẠP)
    // hành động/haành vi của 1 hình học mà nói chung chắc chắn là có Diện tích/S và chu vi/P
    // Còn tính nó là bao nhiêu, tính thế nào, thì từ từ, nhưng chắc chắn là HÌNH HỌC thì có khái niệm này nhen
    // CHỐT HẠ: HÌNH HỌC LUÔN PHẢI BÀN VỀ MÀU SẮC, CHU VI, DIỆN TÍCH/S

    public abstract double getArea(); // Tính diện tích là khái niệm heng
    public abstract  double getPerimeter();

//    public double getArea() {
//        // return ??? Éo tính được, vì thiếu cạnh, thiếu kích thước
//        // Sai nhen, ko có hình nào mà S = 0
//        // new Shape() chấm getArea() là toang mình rồi
//        // éo cho bỏ cái hàm đi vì nó là thứ đi kèm của Hình học
//        return 0;
//    }
//
//    public double getPerimeter() {  // XIN LÕI, EM CHỈ LÀ KHÁI NIỆM, Ý TƯỞNG
//        // return ???; // Đố m tính được, vì éo có cạnh nào mà tính
//
//    }

    /**
     * CHỐT HẠ: VIỆC TÍNH P, S LÀ GẮN KÈM KHÁI NIỆM HÌNH HỌC, NÓI Ý TƯỞNG RẰNG SẼ ĐO ĐƯỢC ĐƯỜNG BO, BIÊN TÍNH ĐƯỢC ĐỘ RỘNG BỀ MẶT
     * SẼ ĐO ĐƯỢC ĐƯỜNG BO, BIÊN, TÍNH ĐƯỢC ĐỘ RỘNG BỀ MẶT
     * CHỈ NÓI ĐÓ LÀ Ý TƯỞNG, KHẢI NIỆM HIÌNH HỌC THÌ CÓ S. P, CỤ THẺ RA SAO, THÌ TÙY TÌNH HÌNH MÀ TÍNH
     *
     * S và P của hình học chỉ là khái niệm nói về 1 con số đại diện cho đường biên và bề mặt
     * tuy mỗi hình sẽ tính đo khác nhau
     * -> Vì Hình học là 1 khái niệm chung chung, mà chung chung thì sao mà tính được
     * cái chung chung vẫn ở đó, nhưng ko cụ thể, chúng tôi gọi là trứu tượng => abstract đấy
     * => TRỪU TƯỢNG Ở ĐÂY DÙNG ĐỂ NÓI VỀ 1 KHÁI NIỆM VÀ 1 Ý TƯỞNG VỀ 1 ĐIỀU GÌ ĐÓ VÔ HÌNH MÀ NÓ VẪN TỒN TẠI
     * cái gì mà tồn tại mà ko chọn nắm được, chỉ mang ý nghĩa khái niệm, nói về 1 ý tưởng, cái đó hữu nhưng mà vô, có thấy nhưng ko chạm được
     * => ABSTRACT - TRỪU TƯỢNG - MA QUỶ, MÔN HỌC KHÓ NĂM BẮT - TÌNH YÊU
     * CHU VI/DIỆN TÍCH của Shape/Hình học là trừu tượng, toồn tại để nói về thứ cần đo đạc, chưa cụ thể
     * vì ngay cả Shape/Hình học cũng là 1 khái niệm chưa cụ thể, vì đã biết mẹ Hình học là hình gì cụ thể đâu?
     *
     * Vẽ Tao 1 cái hình, hỏi lại liền, hình gì???
     * Chúng là những khái niệm sẽ được nạp vào đầu mình để biết rằng sẽ có cái gì đó diễn ra tiếp theo
     * KHÁI NIỆM - ABSTRACT - TÍNH TRỪU TƯỢNG CHÍNH LÀ NÓI VỀ 1 Ý TƯỞNG
     */
}
