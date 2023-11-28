package data;

public class RightTriangle extends Triangle {

    public RightTriangle(double a, double b, String color) {
        super(a, b, b, color);
    }

    @Override
    public void showProfile() {
        System.out.printf("|Right Triangle|%-15s|%4.1f|%4.1f|%4.2f|\n", color, a, b, getArea());
    }
}
