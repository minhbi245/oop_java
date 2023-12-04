package data;

// Vuông trọn vẹn giống HCN, ko dị biệt về đặc tính
public class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    // Ta muốn in theo cách của mình về hàm paint();
    // Duy nhất hàm Paint thôi, ko cần những hàm như getArea hay getPerimeter()

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%10s|%-10s|%4.1f|%7.2f|\n", "Square", owner, color,borderColor, a, getArea());
    }
}
