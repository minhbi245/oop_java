import data.Dog;

public class Main {
    public static void main(String[] args) {
        // biến    value đơn
        int age = 20;
//    int là primitive data type
        //  biến       value phức tạp, object
        Dog chiHu = new Dog("Chi Hu Hu", 2021, 2.5);
        // Dog được gọi là Object Data Type
        chiHu.bark();

        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
    }
}

// new: là một hành động dùng để clone ra một object dựa trên class blueprint trên một vùng không gian trống
// new còn là cách ta xin vùng RAM mới, để đổ data vào vùng mơ
// Như ngoài đời thật là lấy phôi CMND/CCCD các chỗ điền còn trống, đổ dữ liệu, điền dữ liệu thông tin vào
// new tương đương malloc() hay là calloc()
// malloc() ~ memory allocation
// calloc() ~ clear memory allocation