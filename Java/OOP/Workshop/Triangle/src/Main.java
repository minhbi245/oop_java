import data.RightTriangle;
import data.Triangle;

public class Main {
    public static void main(String[] args) {
        playWithTriangle();
    }

    public static void playWithTriangle() {
        RightTriangle rt1 = new RightTriangle(5.0, 5.0, "Cyan");
        rt1.showProfile();
    }
}
