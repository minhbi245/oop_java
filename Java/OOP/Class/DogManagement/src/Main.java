import data.Dog;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Lấy khuôn Dog ra để bắt đầu đổ info vào
        // Y chang làm thẻ căn cước, lấy thông tin in ra thẻ, đổ mực
        // Sau khi chờ khô, ta có được object thuộc Nhóm vừa đúc
        // Đặt tên gọi tắt cho object để dễ dàng nói chuyện

        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
    // Variable/tên tắt         Objects

        // Có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        chiHu.bark();

        Dog ngaoDa = new Dog("Ngáo đá", 2020, 50.0);
        ngaoDa.bark();

        // Chi Hu sủa trở lại
        System.out.println("Chi hu hu bark again!!!");
        chiHu.bark();

        // bark(); ??? Đứa nào sủa vậy???, ko biết rõ đứa nào sủa
        // => HÀNH ĐỘNG THÌ PHẢI GẮN VỚI OBJECT, THÔNG QUA CHẤM ĐỂ GỌI HÀM ĐÓ
        chiHu.setNewWeight(5.0);
        chiHu.bark();
        ngaoDa.bark();

        int chiHuYob = chiHu.getYob();
        System.out.println("CHI HU YOB: " + chiHuYob);
        System.out.println("NGAO DA YOB: " + ngaoDa.getYob());
    }

    // new xin vùng ram mới đủ chứa info của 1 bạn Dog sẽ được đúc, được đổ data
    // -> Có 2 vùng name cho 2 object
    // -> Ngáo đá ko đề lên name của Chi Hu và ngược lại
}