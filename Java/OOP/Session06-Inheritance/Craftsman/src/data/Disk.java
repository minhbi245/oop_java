package data;

// OOP: Object Oriented Programming/Paradigm
public class Disk {
    private String owner;
    private String color;
    private double width;   // ___________
    private double length;  // ___________

    public Disk(String owner, String color, double width, double length) {
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
        System.out.printf("|RECTANGLE |%-15s|%10s|%4.1f|%4.1f|\n", owner, color, width, length);
    }
}
