package data;

public class Rectangle extends Shape {

    public double width, height;

    public Rectangle(String owner, String color, String borderColor, double width, double height) {
        super(owner, color, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public void display() {
        System.out.printf("|RECTANGLE|OWNER: %-10s|COLOR: %-15s|BORDER COLOR: %-15s|S: %-5.1f|P: %5.1f|\n", owner, color, borderColor, getArea(), getPerimeter());
    }
}
