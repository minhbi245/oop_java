import data.Student; // Mượn đồ để dùng, tìm nơi cất
                    // ~ #include <stdio.h>
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        saveStudents();
//        saveAStudent();
//        inputAStudent();
    }

    // Nhập từ bàn phím thì cần Scanner object bàn phím. OOP cái gì cũng object, class
    // Máy Cam, Scanner tiệm photo. bàn phím cơ, touchpad -> nhóm quét dữ iệu đưa vào máy tính
    // Class Scanner xuất hiện. Xài phải new để nó hành xử từ bàn phím đi vào RAM, do đó phải có biến hứng value
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.println("Input yob: ");
        yob = sc.nextInt();

        System.out.println("Input gpa: ");
        gpa = sc.nextDouble();

        Student myStudent = new Student(id, name, yob, gpa);
        myStudent.showProfile();
        System.out.println("My student's age is: " + myStudent.getAge());
        // myStudent.setId(id); Nguy hiểm ko nên
    }
    public static void saveAStudent() {
        Student an = new Student("PS00097", "KhanhNVM", 1993, 3.5);
        an.showProfile();
    }

    public static void saveStudents() {
        Student khanh = new Student("SE00097", "Khanh An", 1993, 3.1);
        Student vinh = new Student("SE00112", "Thuy Vinh", 1993, 3.5);

        khanh.showProfile();
        vinh.showProfile();

        // Chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("Khanh name (directly): " + khanh.name);
        System.out.println("Khanh name (get by method): " + khanh.getName());

        // Vì sờ trực tiếp cái name/biến/instance variable, ta có thể get() và set() trực tiếp
        khanh.name = "KHÔNG HỌC BÀI";

        System.out.println("Thuy Vinh name (directly instance variable: " + vinh.name);
        vinh.showProfile();
        System.out.println("Khanh name after set directly instance variable: " + khanh.name);
        khanh.showProfile();
    }
}