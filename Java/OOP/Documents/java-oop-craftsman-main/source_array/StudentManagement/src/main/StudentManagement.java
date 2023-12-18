package main;

import data.Shelf;
import java.util.Scanner;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

public class StudentManagement {

    public static void main(String[] args) {
        //ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");
        do {
            printMenu();
            System.out.print("Input your choice (1..6): ");  //MyToys
            choice = Integer.parseInt(sc.nextLine());
            //if các choice thì làm gì tương ứng
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;

                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1..6 options");
                    break;
            }
        } while (choice != 6);  //còn đúng thì còn lặp lại
        //chưa chọn 6, chưa muốn kết thúc, lặp lại cuộc chơi

    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }

    public static void testShelf() {

        //OOP thinking
        Shelf tuSE = new Shelf("PINK", "SE Major");
        tuSE.addAStudent();
        tuSE.addAStudent();

        Shelf tuGD = new Shelf("RAINBOW", "GD Major");
        tuGD.addAStudent();

        System.out.println("The student list for all");
        tuSE.printStudentList();
        tuGD.printStudentList();

    }

}
