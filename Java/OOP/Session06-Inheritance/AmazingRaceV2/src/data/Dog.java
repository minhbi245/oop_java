package data;

import java.util.Random;

public class Dog extends Pet {

    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        Random mayNgauNhien = new Random();
        return mayNgauNhien.nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void getSpeedRun() {
        this.speed = new Random().nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "DOG", name, yob, weight, getSpeed() );
    }
}
