import data.Dog;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Lấy khuôn Dog ra để bắt đầu đổ info vào
        // Y chang làm thẻ căn cước, lấy thông tin in ra thẻ, đổ mực
        // Sau khi chờ khô, ta có được object thuộc Nhóm vừa đúc
        // Đặt tên gọi tắt cho object để dễ dàng nói chuyện

        Dog chiHu = new Dog("Chi Hu Hu", 2021, 1.0);
        // Variable/tên tắt         Objects

        // Có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        // new ~ malloc -> xin cấp vùng RAM ở HEAP
        chiHu.bark();

        Dog ngaoDa = new Dog("Ngáo đá", 2020, 50.0); // ~ C: Dog ngaoDa* = &new Dog();
        // Tương tự bên C thì code trên Dog ngaoDa chính là tên biên kiểu con trỏ chứa giá trị là tọa độ
        // Tọa độ mà new Dog ~ malloc(Dog) xin vùng ram ở HEAP chứa khung Dog bên trong khung Dog là các thuộc tính khác
        // Dog ngaoDa được tạo trên vùng RAM stack chứa giá trị là tọa đọ mà được tạo ở HEAP của khung Dog và trỏ tới địa chỉ đó
        ngaoDa.bark();

        // Chi Hu sủa trở lại
        System.out.println("Chi hu hu bark again!!!");
        chiHu.bark();

        // bark(); ??? Đứa nào sủa vậy???, ko biết rõ đứa nào sủa
        // => HÀNH ĐỘNG THÌ PHẢI GẮN VỚI OBJECT, THÔNG QUA CHẤM ĐỂ GỌI HÀM ĐÓ

        ngaoDa.bark();

        int chiHuYob = chiHu.getYob();
        System.out.println("CHI HU YOB: " + chiHuYob);
        System.out.println("NGAO DA YOB: " + ngaoDa.getYob());

        // Tui muốn show toàn bộ info của tui, theo cách toString();
        // Object có nhiều hành động
        System.out.println("Show all info by using toString");
        System.out.println("CHI HU HU DETAILED: " + chiHu.toString());
        System.out.println("NGAO DA DETAILED: " + ngaoDa.toString());

        // Hàm toString() ở đây rất đặc biệt, @Override
        // Mục tiêu là show ra all of info đã đổ vào, hoặc chỉnh sửa, y chang như ở Settings trong phone ra xem info đt

        System.out.println("Play with toString() - GỌI THẦM TÊN EM");
        System.out.println(chiHu);  // chiHu ở đây là biến object/pointer, tức là lưu tọa độ của vùng new
                                    // Lí tuyết nó sẽ in ra địa chỉ
                                    // Thuực tế Java thì gọi toString()
        System.out.println(ngaoDa); // Gọi thầm tên em toString()

        /*
            NẾU KHUÔN/CLASS KO CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI
            THÌ JVM SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA
            ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
            -> HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256
         */

        // Xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với Object qua dấu chấm
        System.out.println("Get age");
        System.out.println("NĐ age: " + ngaoDa.getAge());
    }

    // new xin vùng ram mới đủ chứa info của 1 bạn Dog sẽ được đúc, được đổ data
    // -> Có 2 vùng name cho 2 object
    // -> Ngáo đá ko đề lên name của Chi Hu và ngược lại
}