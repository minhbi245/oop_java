package data;

public class Rectangle {

    private String owner;
    private String color;
    private double width;   // ___________
    private double length;  // ___________

//    private double area;    // ___________ = width * length
    // Đôi khi trong các khuôn/class thì có những đặc tính được tính toán bởi các đặc tính khác
    // -> đặc tính area được tính toán bởi đặc tính khác trong khuôn Rectangle
    // -> area ở đây đuược gọi là derived attribute/field
    //  -> area còn được gọi là đặc tính dẫn xuất -> được tính bởi đặc tính khác
    // thành tiền = số lượng * đơn giá
    // age = currentYear(2023) - yob;
    /*
        * Lưu ý khi chơi với attributes dẫn xuất, coi chừng tính bất đồng bộ, inconssistency
        * Còn lại là không nhất quán:
        * Ví dụ đổ qua phếu: width = 5, length = 10, area = 300 -> sai rồi
        * Ko chời đổ từ phễu, ghi area = width * length; gán luôn công thức lúc khai báo, tự tin chưa?
        * nhưng nếu t setWidth(cạnh có giá trị mới)
        * mà quên cập nhật lại giá trị của area -> TOANG
     */

    // BẢN CHẤT: area là liên quan đến tính toán, ko có sẵn giá trị
    //          tức là nó là hàm xử lí data, vậy hàm phải thuộc về object phù hợp
    // Việc tính S() là hàm cảu Rectangle hoàn toàn hợp lí: ai có nhiều thông tin/info thì kẻ đó sẽ nên đi xử lí
    // Nếu ta xem S/Diện tích/area là đặc điểm của miếng đất Hình Chữ Nhật, ko sai nhưng...
    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public void paint() {
        System.out.printf("|RECTANGLE |%-15s|%10s|%4.1f|%4.1f|%7.2f|\n", owner, color, width, length, getArea());
    }

    // Hàm soái ca/ loại 4, return để có thể reuse sử dụng lại ở các lệnh khác nha
    public double getArea() {

        return width * length;
    }

}
