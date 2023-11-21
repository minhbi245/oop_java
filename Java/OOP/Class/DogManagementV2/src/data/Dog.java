package data;

// Khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info, thứ làm ra để bán
// khuôn phải kín, cõ phễu để chế/rót/hứng/đổ vào cá data, nguyên liệu

public class Dog {
    private String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public void bark() {
        System.out.println("Your name is: " + name);
    }


    /*
    * Một object bất kì có nhiều info mô tả
    * Ví dụ: xem đtdd, ập hộp có sách ghi thông số luôn.
    * Nhìn 1 cuốn sách trên mạng, cầm tay: tác giả, ngày xuất bản, mã số...
    * Gặp chú CSGT, showw ra các info mình có: CCCD, Driver, cà-vẹt...
    * Việc show info của 1 object là tự nhiên, FB có porfile
    * Đó là 1 hành động nên có của mỗi object, m tả, đặc tả về object
    * hành động này có thể do ta chủ động tự đưa ra, hoặc tự generate theo template sẵn có
    * Template có sẵn java giúp mình, mình ko cần code
    * */

//    @Override // Override này khác Overload đó nhen, dính đến kế thừa đó
    // Nhưng cả 2 thằng có liên quan đến khái niệm POLYMORPHISM đó nhen - 50 sắc thái, đa nhân cách, đa hình
//    public String toString() {
////        return "Dog{" +
////                "name='" + name + '\'' +
////                ", yob=" + yob +
////                ", weight=" + weight +
////                '}';
//        // Độ lại được quyền, vì chỉ cần trả chuỗi chứa info của mình
//        return  String.format("GAUGAU | %-10s | %4d | %4.1f |", name, yob, weight); // Trả cuỗi thô, ko xuống hàng
//    }

    // Hàm gắn việc xử lí info của chính object. Ai giàu info, gã đó nên xử lí

    public int getAge() {
        return 2021 - yob;
    }

    // Viết code kiểu này gọi là hard-code, fixed value, năm sau phải sửa code thì tuổi mới đúng
    // Chuẩn: phải lấy giờ hệ thống Windows - yob;
}
