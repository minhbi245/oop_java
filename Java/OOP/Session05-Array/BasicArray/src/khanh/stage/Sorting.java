package khanh.stage;

import khanh.data.Student;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        inputStudentList();
    }

    // CHƯA OOP 100%, MỌI THỨ PHẢI THUỘC VỀ OBJECT, ĐI QUA OBJECT CHẤM!!!
    public static void inputStudentList() {
        Student[] arr;  // Chưa biết bao nhiêu sv
        // Có thể khai báo 500 sv có sẵn 500 chỗ
        // Có thể hỏi muốn bao nhiêu, thì new bấy nhiêu
        // Có 1 cách xịn sò hơn, khỏi hỏi bao nhiêu, đưa new Student() vào
        // là có chỗ, mảng linh hoạt, co giãn kích thước - Collections Framework
        int count;
        String id, name;
        int yob;
        double gpa;

        System.out.println("How many student do you want to input? ");
        Scanner sc = new Scanner(System.in);
//        count = sc.nextInt(); // Trôi lệnh, try-catch, MyToys đưa vào
        count = Integer.parseInt(sc.nextLine());
        System.out.println("Input id: ");
        arr = new Student[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);  // ngoài đời đếm từ 1, lừa đảo chỉ số i 1 tí
                                                                            // i chạy như cũ, đếm đôn i lên + 1
            System.out.println("Input your id: ");
            id = sc.nextLine();

            System.out.println("Input your name: ");
            name = sc.nextLine();

            System.out.println("Input your yob: ");
            yob = Integer.parseInt(sc.nextLine());  // MyToys

            System.out.println("Input your gpa: ");
            gpa = Double.parseDouble(sc.nextLine());    // MyToys.

            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list");
        for (Student x: arr) {
            x.showProfile();
        }
    }

    public static void sortStudentList() {
//        Student[] arr = new Student[5];
//        arr[0] = new Student("SE9", "CHÍN", 19, 9.0);
//        arr[1] = new Student("SE5", "NĂM", 15, 5.0);
//        arr[2] = new Student("SE8", "TÁM", 18, 8.0);
//        arr[3] = new Student("SE2", "HAI", 12, 2.0);
//        arr[4] = new Student("SE7", "BẢY", 17, 7.0);
        Student[] arr = new Student[]{
                new Student("SE9", "CHÍN", 19, 9.0),
                new Student("SE5", "NĂM", 15, 5.0),
                new Student("SE8", "TÁM", 18, 8.0),
                new Student("SE2", "HAI", 12, 2.0),
                new Student("SE7", "BẢY", 17, 7.0)
        };
        System.out.println("The list student before sorting");
        for (Student x : arr) {
            x.showProfile();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student tmp = arr[i];   // Điểm 0 ổn, thì đổi gọi tên, trỏ
                    arr[i] = arr[j];
                    arr[j] = tmp;
                } // Hóa đổi việc trỏ đúng vào vùng new có data điểm phù hợp
                // Thứ tự, đổi việc/thứ tự gọi tên sinh viên
                // Thay vì gọi điểm cao, gọi điểm thấp trước, vẫn gọi từ [0] đầu danh sách
            }
        }

        System.out.println("The list student after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void sortPrimitiveV2() {
        int[] arr = new int[]{1000, -20, -1000, 20, 30, 3};

        // Sắp xếp tăng dần
        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.println(x + "\t");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // i luôn nhỏ hơn j, trước j truong mảng
                    int tmp = arr[i]; // đứng trước mà bày đặt lớn hơn
                    arr[i] = arr[j];  // thì swap thôi
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("The array after sorting ascending");
        for (int x : arr) {
            System.out.println(x + "\t");
        }

    }


    public static void sortPrimitive() {
        int[] arr = new int[]{1000, -20, -1000, 20, 30, 3};
        //                     [0]  [1]    [2]  [3] [4] [5]
        //                    1000 > -20
        //                     -20  1000    đổi ko  ko  ko
        //                    -1000 1000 >  -20
        //                    -1000 -20    1000 20
        // Sắp xếp tăng dần
        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.println(x + "\t");
            /*
                Sắp xếp tăng dần: thằng trước phải < thằng, bất kì vị trí trên mảng
                if (thằng trước > thằng sau) -> swap
                tao cần vị trí [0] mày phải nhỏ nhất trong cả đám phần tử
                lấy tao [0] đi so với tất cả phần tử còn lại, nếu if ko ổn thì đổi
             */
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int tmp = arr[0];
                arr[0] = arr[i];
                arr[i] = tmp;
            }
        }

        for (int x : arr) {
            System.out.println(x + "\t");
        }
        // -1000 1000 -20 20 30 3
        // -1000 -20 1000 20 30 3
        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]) {
                int tmp = arr[1];
                arr[1] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println("The array after sorting");

        for (int x : arr) {
            System.out.println(x + "\t");
        }
    }
}
