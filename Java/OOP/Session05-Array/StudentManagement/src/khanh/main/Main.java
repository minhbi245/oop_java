package khanh.main;

import khanh.data.Shelf;
import khanh.util.MyToys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Chơi menu: 1. Add...; 2. Print...; 3. Search...; 4...; 5...; 6.Quit
            Chờ người chơi chọn món 1 2 3 4 5 6 Ahihi - try-catch-do-while MyToys

            if chọn 1 thì tu.add()  2 thì tu.print()    3 thì ...
            Chư xỉn chưa về, chưa muốn dừng cuộc chơi, éo cho thoát -> do/wile
         */
        Shelf tuSE = new Shelf("Blue", "SE");
        Scanner sc = new Scanner(System.in);
        int choice; // lưu option gõ menu từ bàn phím

        do {
            printMenu();
            choice = MyToys.getAnInteger("Vui lòng nhập từ 1 ... 6 ", "Chỉ nhập từ 1 đến 6, vui lòng nhập lại", 1, 6);

            switch (choice) {
                case 1:
                    tuSE.inputAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye see you next time");
                    break;

                default:
                    System.out.println("Please choose 1 to 6 plz!!!");
                    break;
            }
        } while (choice != 6);      // Còn chưa chọn 6 thì còn lặp lại
                                    // Còn đúng thì còn làm/do
                                    // Còn đúng tức là chưa == 6 thì còn làm/do
                                    // Chưa bằng 6 hả, đúng ko? làm tiếp đi mài
    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by ID");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student");  // REMOVE Ở ĐÂY HẾT SỨC CẨN THẬN NHÉ
        // XÓA CHƯA CHẮC LÀ XÓA, MÀ LÀ CHỈ ẨN ĐI THÔI
        System.out.println("6. Quit");

    }

    public static void menuCaiTu() {
        Shelf svFPT = new Shelf("RED", "FPT");
        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR"); // 2 CÁI TỦ ĐỘC LẬP
        // 2 TỦ 2 GÓC PHÒNG
        // 2 VÙNG RAM KHÁC NHAU
        svFPT.inputAStudent();
        svFPT.inputAStudent();    // Giả bộ gọi menu add student lần 2
        tuGD.inputAStudent();

        svFPT.printStudentList();   // gọi menu in danh sách đã nhập
        tuGD.printStudentList();

    }
}
