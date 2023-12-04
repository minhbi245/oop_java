package data;

import java.util.Random;

public class Cat extends Pet {

    public static final double MAX_SPEED = 50;

    private String ribbon; // Ruy-băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);   // Mèo chính là 1 Pet
        this.ribbon = ribbon;       // Cha sẽ là cánh chim đưa con bay thaật xa
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        // Trong cuộc sống có những "thứ-object" sinh ra cho mình mấy cái trò ngẫu nhiên
        // Như vậy chúng thuộc Nhóm/Khuôn Ngẫu nhiên, class Ngẫu Nhiên xuất hiện
        // JDK có sẵn có khuôn này rồi, tên là Random ~~~ Scanner ~~~ Math
        Random mayNgauNhien = new Random();
        return mayNgauNhien.nextDouble() * MAX_SPEED; // = gần 50 -> trả về tốc độ gần 50, hên xui random
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|%4s|\n", "CAT", name, yob, weight, run(), ribbon);
    }
}
