package khanh.util;

import java.util.Scanner;

// Đây là Class/Khuôn/Chứa, có đặc điểm hành động/ chứa các món đồ chơi dùng chung cho mọi nơi
// Vì nó ko nhớ cái gì riêng tư của nó
// LIBRARY/FRAMEWORK - chứa các hàm/biến(data) dùng chung cho nhiều việc khác nhau của các dự án khác nhau
public class MyToys {
    // Đặc điểm/hành vi/ là static, cho người ta sờ thì thêm public
    // Ko nhớ cái gì của riêng mình
    // Một class bình thường thì vẫn có thể static vừa non-static, tùy nhu cầu, cách thức

    // Math: hầu hết static
    // String: vừa non-static, vừa có static
    // System: hầu hết static

    public static final double PI = 3.1415;
    // final ~ const bên C, biến ko cho thay đổi value, trừ lần đầu tiên khai báo
    // -> final là hằng số

    // Đẩy scanner ra ngoài xài chung cho các hàm của chúng ta, tại sao ko chứ???

    private static Scanner sc = new Scanner(System.in);
    // private cho nhu cầu dùng nội bộ bên trong

    // DI: Dependency Injection
    public static int getAnInteger(String inputMsg) {
        int n; // hứng giá trị từ bàn phím nhập vào

        do {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know to input an integer?");
            }
        } while (true);
    }


    /*
        Trong quá trình làm app, việc nhập số là gặp lại nhiều lần, nhập 2 của 1 hình chữ nhật
        , 3 cạnh 1 tam giác, nhập sự lựa chọn menu 1...5, điểm trung bình, điểm thi các môn
        -> Thì mỗi cú nhập, biến nhập, kèm theo: chú ý là sẽ xaảy ra trôi lệnh, hoặc nhập cà chớn thì
        chúng ta sẽ dùng try-catch và do-while
        -> Vậy tại sao ko tách viiệc nhập số nguyên thành 1 hàm, gói chủi bới trôi lệnh, nhập lệnh và 1 chỗ là được
        Ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
        ví dụ như Math.sqrt(4) -> mình dùng, Math ko cần nhớ giá trị, ko cần non-static
        new mà trả kết quả về cho người ta dùng -> ko cần nhớ, dùng nhiều RAM làm gì -> dùng STATIC thượng sách hơn
     */

    public static int getAnInteger() {
        int n; // hứng giá trị từ bàn phím nhập vào

        do {
            try {
                System.out.println("Input integer: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know to input an integer?");
            }
        } while (true);
    }
}
