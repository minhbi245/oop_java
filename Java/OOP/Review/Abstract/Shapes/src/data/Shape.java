package data;

// là khái niệm chung cho mọi loại hình học
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;

    protected Shape(String owner, String color, String borderColor) {
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


    /*
        Các hàm như getArea(), getPerimeter() và display() thì chỉ là khái niệm
        Vì hình học chỉ là khái niệm, còn cụ thể là hình vuông hay hình tròn, hình tam giác, hình chữ nhật
        là các hình cụ thể, và mỗi hình cụ thể thì ta lại có cách tính diện tích và chu vi lẫn hiển thị hình dạng cũng khác nhau
        -> vì thế cho nên các hàm này ta chỉ nói lên khái niệm, chung chung, không cần cụ thể, phần còn lại để cho
        các con hay là các hình cụ thể khi extends cha là Shape sẽ thực hiện từng chi tiết cụ thể tương ứng với từng hình cụ thể
     */
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void display();
}
