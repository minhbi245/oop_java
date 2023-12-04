package data;
/*
    KHI NÀO THÌ TA SẼ CẦN DÙNG STATIC???
    => KHI NHỮNG GIÁ TRỊ CẦN CÓ THỂ REUSE NHIỀU CHỖ, MÀ KHÔNG CẦN PHẢI KHAI BÁO LẠI OBJECT
    => ĐIỀU NÀY SẼ GIÚP TIẾT KIỆM BỘ NHỚ VÙNG RAM HƠN
    => VÌ STATIC SẼ ĐƯỢC TÁCH RA 1 VÙNG NHỚ STATIC CHO VIỆC DÙNG CHUNG SAU NÀY
    => GỌI TRỰC TIẾP TỪ CLASS Disk.PI;
 */
public class Disk extends Shape {
    public static final double PI = 3.14;
    private double radius;

    public Disk(String owner, String color, String borderColor, double radius) {
        super(owner, color, borderColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Disk.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%7.2f|\n", "DISK", owner, color, borderColor, radius, getArea());
    }
}
