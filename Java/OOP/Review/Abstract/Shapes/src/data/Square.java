package data;

public class Square extends Rectangle {

    public double edge;

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
        this.edge = edge;
    }

    @Override
    public double getPerimeter() {
        return edge * 4;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void display() {
        System.out.printf("|SQUARE|OWNER: %-10s|COLOR: %-15s|BORDER COLOR: %-15s|S: %-5.1f|P: %5.1f|\n", owner, color, borderColor, getArea(), getPerimeter());
    }
}
