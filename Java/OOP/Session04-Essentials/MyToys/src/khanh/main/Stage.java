package khanh.main;

import khanh.util.MyToys;

public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);

//        int n = MyToys.getAnInteger();
//        System.out.println("Your number have input: " + n);

        int choice = MyToys.getAnInteger("Mời nhập lựa chọn của bạn (1...7): ");
        System.out.println("Sự lựa chọn của bạn là (your choice): " + choice);
    }
}
