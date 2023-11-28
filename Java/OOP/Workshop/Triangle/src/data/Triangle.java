package data;

public class Triangle {
    protected double a;
    protected double b;
    protected double c;

    protected String color;

    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    protected double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void showProfile() {
        System.out.printf("|Triangle|%-15s|%4.1f|%4.1f|%4.1f|%4.2f|\n", color, a, b, c, getArea());
    }
}
