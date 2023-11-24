package khanh.data;

import java.util.Scanner;

public class Shelf {
    // đặc điểm của 1 cái tủ bất kì là gì: màu sơn:___; giá tiền:___; nhà sx:___;
    // số ngăn/không gian chứa đồ:___ các món đồ nhét vào;
    // chứa nhiều đồ/nhiều object, rõ ràng tới thời điểm này là ta cần mảng object
    // tủ sẽ chứa 1 list/mảng/danh sách caác đối tượng
    // Ứng dụng của mảng, góp phần tạo dựng nên object khác
    // OOP: tìm các object và phối hợp chúng, trộn với nhau

    private String color;
    private String label; // tủ chén, tử hồ sơ trường nào đó

    // Chứa cái gì???
    private Student[] ds = new Student[300];

    private Scanner sc = new Scanner(System.in);

    // tui có không gian chứa info, vậy tui sẽ giải quyết chuyện nhập xuất

    private int count = 0;  // Mỡi mua tủ về, hồ sơ = 0
                            // Nhét thêm 1 hồ sơ vào thì count += 1
                            // Chơi mảng chỉ for đến count

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }


    public void inputAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.println("Input id: ");                     // 1 / 300
        id = sc.nextLine();

        System.out.println("Input name: ");
        name = sc.nextLine();

        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        ds[count] = new Student(id, name, yob, gpa);
        count += 1; // SIÊU VIP PRO, THIẾU LÀ TOANG CMNR
    }

    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile(); // FOR HẾT FOR EACH LÀ TOANG CMNR
        }
    }
}
