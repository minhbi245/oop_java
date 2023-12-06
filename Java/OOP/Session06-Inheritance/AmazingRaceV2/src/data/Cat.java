package data;

import java.util.Random;

public class Cat extends Pet {
    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        // Random rd = new Random();   // rd là biến con trỏ nắm tọa độ vùng new Random
                                    // trong vùng new có hàm .nextDouble() quan trọng
        // return rd.nextDouble() * Cat.MAX_SPEED;
        return new Random().nextDouble() * Cat.MAX_SPEED;   // Đây chính là Anonymous object, object hok thèm đặt tên
                                                            // Xài 1 lần rồi bỏ luôn
                                                            // CTy Môi Trường Đô Thị trong Java
                                                            // Chuyên Dọn Dẹp vùng Ram bỏ lửng ko có biến con trỏ giữ địa chỉ
                                                            // GARBAGE COLLECTOR ~ Cty Môi Trường Đô Thị Trong Java


                        // (0...1)       *  50 coi như được con số sát 50
    }

    @Override
    public void getSpeedRun() {
        this.speed = new Random().nextDouble() * Cat.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "CAT", name, yob, weight, getSpeed());
    }
}
