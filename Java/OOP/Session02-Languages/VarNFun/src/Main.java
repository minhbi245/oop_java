public class Main {
    public static void main(String[] args) {
        playWithBooleans();
//        playWithCharacters();
//        playWithDouble();
//        playWithInteger();
//        playWithVariable();
    }

    // Mệnh đề phép toán so sánh, câu phát bieer có hai trạng thái: đúng/sai
    // 5 > 4 true, 5 < 4 false
    // C: đúng thì quy ước là 1, còn sai thì quy ươ là 0, kiểu int
    // Java: đúng sẽ là true, còn sai là false -> boolean tương đương với 1bit, 1 byte
    public static void playWithBooleans() {
        boolean marriedStatus = true; // khai báo biến kiểu giá trị boolean

        if (marriedStatus == true)
            System.out.println("Get marrried");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }

    public static void playWithCharacters() {
        // char trong Java sẽ là 2 byte, vì có thể biểu diễn ược unicode, vì thế có thể lưu đủ mọi loại ngôn ngữ trên thế giới
        // Chuỗi kí tự trong C: mảng char, char name[] = "Ahihi";
        //                  Java: String, là một kiểu data hoàn toàn mới, complex data type,
        //                                            hay còn gọi là một Object, Object Data Type

        char unit = '$';    // char là kiểu primitive
        String name = "Khánh Nguyễn";   // String là kiểu Object Data Type, kiểu dữ liêu complex
        System.out.println("name: " + name) ;
        System.out.println("my name: " + name.toUpperCase());   // name có thể chấm để gọi các ham
        System.out.println("1st letter in my name: " + name.charAt(0));
    }

    public static void playWithDouble() {
        // Mọi số thực có lietral trong code mặc định được xem là 8 byte, double
        double pi = 3.14;
        System.out.println("Pi: " + pi);
        System.out.printf("Display Pi using printf: %f\n", pi); // Ở Java chỉ cần sử dụng %f để hiển thị số thực kiêu double
                                                                // sử dụng %lf thì ở Java không có, nếu cố sử dụng bị sai

        float vat = 0.1F;   // với kiểu float phải thêm hậu tố là F để biết sử dụng 4 byte, vì mặc định là double 8byte
        System.out.println("VAT: " + vat);
    }

    // Mọi giá trị xuất hiện trong code, ví dụ số 5, 5.14, kí tự 'A', chuỗi "Ahihi" được gọi là literal
    public static void playWithInteger() {
        // Mọi số nguyên trong code/literal được Java xem là integer xài 4 byte
        int age = 31;
        long money = 3_500_000_000L; // phải sử dụng hậu tố L phía sau
        System.out.println("Money: " + money);

        int status = 0xFA; // sử dụng hệ thập lục phân biểu diễn số literal
        System.out.println("The literal of status form hex decimal: " + status);

        int octaNumber = 070; // sử dụng octa, hệ đêếm 8 số 0 -> 7
        System.out.println("Octa number with 070 is: " + octaNumber); // 070 octa number convert to literal decimal is 56
    }

    // static chỉ chơi với static
    static void playWithVariable() {
        /*
            Biến là một vùng RAM được đặt tên chiếm 1 số byte trong RAM tùy loại dữ liệu,
            value/data mà bạn muốn lưu trữ

            Biến còn l tên gọi cho 1 value, loại dữ liệu - data type, hình dáng lưu trữ hay hiển thị
            bao gồm là sô (nguyên hay số thực), chữ, chuỗi, kí tự, ảnh, nhạc, etc...

            Con người thì thường định danh cho một cái gì đó để có thể nhớ và hiểu được
            Máy tính cũng không thế cần đặt tên để máy tính có thể hiểu được biến đó nhằm chưa value như thế nào
         */

        int yob = 1993;
        int a = 39, b;  // declare a variable and assign value
        b = 79;
        System.out.println("yob: " + yob);
        System.out.printf("print out yob using printf: %d\n", yob); // print as printf in C

        int age = 2024 - yob;
        System.out.println("Your age: " + age + " years old");
        System.out.println("Your age: " + (2024 - yob) + " years old"); // using () to set prioprity run firstly in ()
    }
}