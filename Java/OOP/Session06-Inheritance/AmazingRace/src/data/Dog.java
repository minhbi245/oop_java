package data;

import java.util.Random;

public class Dog extends Pet {
    public static final double MAX_SPEED = 40;
    // Ko có dị biệt, muốn thì làm giống mèo
    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }


    @Override
    public double run() {
        // Random rd = new Random()
        return new Random().nextDouble() * MAX_SPEED;   // Nhắc lại về bài 7 viên ngọc rồng
                                                        // Về Anonymous Class, new chấm luôn method của nó
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n","DOG", name, yob, weight, run());

    }
}
