import java.util.Locale;
import java.util.Scanner; // ~ #include <stdio.h> in C

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // playWithVariables();
        // playWithIntegers();
        // playWithDoubles();
//        playWithCharacters();
//        playWithBooleans();
//        printIntegerList();
//        printIntegerList(20);     // hard code đầu vào, code cứng/ cố định value/literal
                                    // ko mềm mại linh hoạt
                                    // linh hoạt, bạn muốn in mấy??? hỏi và nhập

//        int n = getAPositiveInteger();
//        System.out.println("Your number: " + n);
//        printIntegerList(n);    // Truyền tham trị, pass by value
                                // value từ n của hàm main() sẽ đưa qua ngõ/ phễu/ máy xay
                                // n main() đâập ngang sang n của hàm
                                // Tuy nhiên OOP thì là pass by reference - truyền tham chiếu - truyền con trỏ/ truyền dịa chỉ
        int n = 5;
        boolean isPrime = isPrimeNumber(n);
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void getListPrimeNumber() {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPrimeNumber(i)) {

            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int getAPositiveInteger() {
        int n;
        // Nhập từ bàn phím, xài kí thuật OOP, chấm và bung lụa ~ name.charAt()
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.println("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        return n; // getAPositiveInteger() = n
    }

    // Tui muốn in n số tự nhiên tính từ 1
    // Hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhứng khác phần tham số
    // Đầu vào, mà phải khác trên data type chứ ko phải khác tên biến
    // ĐƯỢC GỌI LÀ OVERLOAD/OVERLOADING - quá tải hàm
    // vs. OVERRIDE
    // Liên quan đến tới POLYMORPHISM - TÍNH ĐA HÌNH
    // Giống như: quá tải trọng, 5 anh em trên 1 chiếc xe wave
    public static  void printIntegerList(int n) {
        // Hàm này chỉ có thằng ngáo mới scanf(n) here!!! n đã có value khi xài
        // Body of func, nghiền, trộn, xử lí đầu vào giả định sẽ đưa qua tên gọi
        // Giải quyết trên công thức

        System.out.println("The list of " + n + " first integers");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }

    public static  void printIntegerList() {
        System.out.println("The list of 100 first integers");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12 ... n");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
        }
    }
    public static  void playWithBooleans() {
        // C: đúng 1 hoặc là lớn hơn 0, còn sai thì thì nó quy là 0
        // Java: đúng - true, sai - false -> boolean

        boolean marriedStatus = false;
        if (marriedStatus == true) {
            System.out.println("I've just married!!!");
        } else {
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
        }
    }

    public static void playWithCharacters() {
        // 2 bytes cho kiểu char heng, lưu bảng mã Unicode
        char m = '$';
        System.out.println("m: " + m);

        // Muốn lưu em thì sao? C: mảng kí tự, ko primitive data type/giá trị đơn nữa rồi, phức tạp hơn rồi
        String name = "Nguyễn Việt Minh Khánh"; // Loại data type mới hoàn toàn
                                                // Phức tạp, gom n thứ khác
                                                // Object data type, học sớm hoy
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name is: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase(Locale.ROOT));
    }

    // Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %f\n", pi);

        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }

    public static void playWithIntegers() {
        int n = 39;
        System.out.println("n: " + n);
        long m = 390_000_0000L;
        System.out.println("m: " + m);

        int status = 0xFA; // hệ 16 hex
        System.out.println("status: " + status);

        int phone = 010; // 0 đứng trước literal là hệ 8 octal
        System.out.println("Phone: " + phone);
    }

    // static thì chỉ chơi với static - OOP
    public static void playWithVariables() {
        // Biến là 1 vùng RAM được đặt tên, chiếm một số byte nhất định, tùy loại dữ liệu/thông tin mà nó sẽ chưa bên trong - data type - hình thức data
        // Số, chữ, ảnh, ...
        // Biến là cách đặt tên cho một đại lượng giá trị, 1 giá trị đơn hay là phức
        int age = 20;
        int a = 10, b;
        b = 100;
        // Tốn 12 byte trong RAM
        System.out.println("age: " + age); // ~ printf("age: %d\n", age); Bên ngôn ngữ C
        int yob = 1993;
        age = 2023 - yob;
        System.out.println("Now your age is: " + age);
        System.out.println("Now your age is by using transitive tech: " + (2023 - yob));
        System.out.printf("Your age printed by using as in C: %d\n", (2023 - yob));
    }
}