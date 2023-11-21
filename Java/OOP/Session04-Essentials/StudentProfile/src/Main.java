import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputProfile();
    }

    // Nhập thông tin cơ bản của sinh viên và in ra
    public static void inputProfile() {
        // Ko OOP, chỉ cần hiểu về việc nhập thông tin trước đã, ko chơi class Student

        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.println("Input yob: ");
//        yob = sc.nextInt(); // Convert data từ bàn phím - là chuỗi thành số - nextInt() để lại rác tệ nhất là enter - còn tệ nhất là rác và enter
        // Để tránh việc này thì xóa luôn bộ đệm xong rồi hẳn nhập chuỗi
//        sc.nextLine(); // chỉ dùng để xóa bộ nhớ đệm thôi ko có trả về giá trị - trick
        // Nhưng cách trên tà đạo quá - chơi cách chính thống như sau:

        yob = Integer.parseInt(sc.nextLine());  // nextLine() hốt sạch chuỗi kí tự trong buffer, loại bỏ enter, còn chuỗi số -> phân rã chuyển hóa thành số

        System.out.println("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("YOB: " + yob);
        System.out.println("Address: " + address);

    }
}