package data;

public class Dog {
    // trong Class/Khuôn sẽ chứa các info qua biến = value
    // Giống như ca phôi CCCD/CMND/Form. Chưừa chỗ bên trong để fill value vào sau

    private String name;
    private int yob;
    private double weight;

    // Một cái khuôn/Class cần cái phễu để hứng vật liệu/giá trị đưa vào
    // Phễu/Constructor/Initializer hay còn lại là hàm dựng được sử dụng để đúc ra một Object thuộc Class/Khuôn tương ứng
    // Constructor/Initializer sẽ return chính các object đang bàn
    // Do đó ta không cần ghi return và giá trị trả về
    // Tên của Constructor/Initializer giống 100% tên của class đối với Java
    // Mỗi lần mà ta gọi Phễu/Constructor/Initializer tương đương với 1 lần tạo/đúc ra một object
    // Lúc này có 1 object mới hoàn toàn được tạo ra với vật liệu/giá trị được đổ vào
    // Giống như ba má sinh ra một đứa em, cho nó tên:...; cân nặng:...; ngày sinh:...
    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    // Các hàm của object là những quy tắc để xử lý dữ liệu thông tin
    // Một object (thực thể sống như tôi & bạn) có nhiều hành động hằng ngày, hành động có liên quan đến dữ liệu/data
    // Hàm chính là sẽ xử lý trên data trên đặc điểm hay thuộc tính của một object
    // Hàm trong object còn được gọi là method - behaviors(hành vi)

    public void bark() {
//        System.out.println("gogogogo..., my name is " + name);
//        System.out.println("gogogogo..., my yob is " + yob);
        System.out.printf("|GAU GAU|%-15s|%4d|%4.1f|\n", name, yob, weight);
    }

    // Khi ta đã có info, ta sẽ có nhu cầu giao tiếp cách nào đó để lấy info này ra, dưa ra những thông tin này
    // Thông tin này sẽ được đưa ra khi ai đó cần hoặc hỏi lấy nhằm mục đích khác
    // Việc này trong máy tính thì ta sẽ pha xử lí lấy ra thông tin thông qua hàm gọi là get-thông tin()
    public String getName() {
        return name;
    }

    // Nhìn cấu trúc có tham số parameter truyền vào, tuy nhiên nó lại không phải là phễu.
    // Phễu hay constructor được sử dụng để tạo ra một Object mới, còn đây là dựa vào object đã được tạo và ta sẽ thiết lập lại thuộc tính/thông tin của Object đó
    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getInfo() {
        System.out.printf("|%-25s|%10d|%10.2f|\n", name, yob, weight);
    }
}

// Nếu ta viết các dữ liệu này bên ngoài thì tương đương với ngoài đời là cái Khuôn bị lủng

// Biến/Data/Properties/Thuộc tính + Hàm/Method để xử lí data đó, HIÌNH THÀNH NÊN CHẤT CỦA 1 OBJECT CỤ THỂ NÀO ĐÓ
// N THỨ GÓI LẠI TRONG 1 KHUÔN/OBJECT
// KHÔNG LỘN XỘN GIỮA DOG CAT HAY PERSON, GIÁO VIÊN, SINH VIÊN, SÁCH...
// LÀ MỘT KĨ THUẬT GOM HÀM + BIẾN VÀO 1 KHUÔN/OBJECT, HÌNH THÀNH NÊN 1 THỨ RIÊNG BIỆT -> CHÍNH LÀ TÍNH CHẤT ĐÓNG GÓI ENCAPSULATION
