package data;

// Là khái niệm chung cho mọi loại hình nào đó: Vuông, Tròn, Hình Chữ Nhật, Tam Giác,...
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;

    // Nếu khai báo cạnh a, b, c, radius, bán kính thì rất vô duyên

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    // Hình nói chung sẽ có S/Diện tích và Chu vi/P. Vấn đề là tính thế nào? tùy tình hình mà tính
    // Ko thể nói cụ thể được lúc này
    // Diện tích và Chu vi là 1 khái niệm đề cập đặc tính và hành vi của h học nói chung
    // Nó là chung chung, ko cụ thể
    // Cụ thể để mỗi hình Tròn, Vuông, Chữ Nhật, Hình bình hành sẽ lo
    // Nói về ý tưởng gọi là abstract
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
}
