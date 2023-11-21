import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        inputProfile();
        inputProfileXinXo();
    }

    public static void inputProfileXinXo() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.println("Input yob: ");
                yob = Integer.parseInt(sc.nextLine()); // Dữ liệu trên đây nhập sai không phải là số nguyên thì catch sẽ bắt và nhập lại
                break; // Thoát khỏi vòng lặp khi dữ liệu nhập trên là đúng
            } catch (Exception e) {
                System.out.println("Do you know to input a positive number?");
            }
        }

        System.out.println("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("YOB: " + yob);
        System.out.println("Address: " + address);

    }

    // Nhập thông tin cơ bản của sinh viên và in ra
    public static void inputProfile() {
        // Ko OOP, chỉ cần hiểu về việc nhập thông tin trước đã, ko chơi class Student

        String name, address;
        int yob;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input name: ");
        name = sc.nextLine().toUpperCase();

        // Mặc địnhh JVM Java sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        // Đưa cho ta 1 cơ chế tự xử khi có cà chớn, chuyển quyền giết chóc cho mình
        // Báo JVM biết đừng giết, để tao tự xử, nhốt các lệnh cà chớn lại -> gọi là SANDBOX

        try {
            System.out.println("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            // nextLine() hốt sạch chuỗi kí tự trong buffer, loại bỏ enter, còn chuỗi số -> phân rã chuyển hóa thành số
        } catch (Exception e) {
            // CPU sẽ chạy đến chỗ này, khi c cà chớn xảy ra
            // JVM sẽ ko giết app như truyền thống nữa
            // Chỗ này là chỗ xử lý hậu quả của việc cà chớn
            // Không có cà chớn thì ko vào đây
            // e chính là lá thư/msg màu đỏ mà JVM gửi cho mình báo răằng có lỗi cà chớn nè
            // làm gì thì làm
            // Execption e = new Exception(nội dung lỗi màu đỏ đây nè...);
            // Về lí: e.xem lỗi, xử lí tự mình
            // Về toán hóa, mình chỉ tập trung xử lí lỗi, biết thừa
            // Xử lý sao??? Nhiều cách: default value

            yob = 69;
        }

        System.out.println("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("YOB: " + yob);
        System.out.println("Address: " + address);

    }

}