package khanh.data;

import khanh.util.MyToys;

import java.util.Scanner;

public class Shelf {
    // đặc điểm của 1 cái tủ bất kì là gì: màu sơn:___; giá tiền:___; nhà sx:___;
    // số ngăn/không gian chứa đồ:___ các món đồ nhét vào;
    // chứa nhiều đồ/nhiều object, rõ ràng tới thời điểm này là ta cần mảng object
    // tủ sẽ chứa 1 list/mảng/danh sách caác đối tượng
    // Ứng dụng của mảng, góp phần tạo dựng nên object khác
    // OOP: tìm các object và phối hợp chúng, trộn với nhau

    private String color;
    private String label; // tủ chén, tử hồ sơ trường nào đó

    // Biến thì cần được đưa value, được đưa value lúc nào???
                                    //    đưa qua phễu (mặc định trong suy nghĩ)
    // Gán trực tiếp lúc khai báo: private String color = "PINK";
    // Chứa cái gì??? Chừa chỗ, chừa không gian để lát chứa đồ, chưa các giá trị, thực ra ban đầu chưa có
    //                          chưa có hồ sơ sinh viên
    private Student[] ds = new Student[300];
    private Student[] students; // Khai bảo kiểu động, truyền size vào để xác định sức chưa của Shelf
    //                ds ở đây là biến má mì = cần value
    //                      new sẵn 300 ở đây tương đương mua tủ 300 lít
    //                      ngoài ra ta có thể đặt hàng kích thước, dung tích lớn hơn như 500, 1000, 2000 chẳng hạn
    private Scanner sc = new Scanner(System.in);

    // tui có không gian chứa info, vậy tui sẽ giải quyết chuyện nhập xuất

    private int count = 0;  // Mỡi mua tủ về, hồ sơ = 0
                            // Nhét thêm 1 hồ sơ vào thì count += 1
                            // Chơi mảng chỉ for đến count
                            // count ở đây dùng để lưu trữ cách để đồ vào mảng, vào giỏ, để từ trái sang phải, sắp xếp đồ cho nó gọn gàng
                            // Sắp xếp đồ vào tủ vào giỏ theo thứ tự gọn gàng
                            // FOR PHẢI ĐẾN COUNT THÔI, vì các phần tử sau chưa có địa chỉ new mới là null

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    // Cách khai bảo khuôn/constructor linh hoạt cho kích thước chứa của sinh viên/của tủ chứa được
    public Shelf(String color, String label, int size) {    // size kích thước của tủ
        this.color = color;
        this.label = label;
        students = new Student[size];   // linh hoạt trong kích thước tủ, muốn bao nhiêu đưa bấy nhiêu
    }

    // DATA + HÀM XỬ LÍ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ SẼ LÀ NON-STATIC
    // NẾU KHÔNG CÁC TRƯỜNG ĐẠI HỌC KHÁC, BỘ MÔN KHÁC XÀI CHUNG DANH SÁCH SINH VIÊN => TOANG CMNR
    // ĐỒ ĐẠC, HÀNH XỬ/BEHAVIOR PHẢI THUỘC VỀ OBJECT
    public void inputAStudent() {
        String id, name;
        int yob;
        double gpa;

        // - Todo: kiểm tra id trùng; Regular expression kiểm tra chuỗi nhập đúng định dạng ko
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
//        System.out.println("Input id: ");                     // 1 / 300
        id = MyToys.getString("Input id: ", "Lỗi rồi vui lòng nhập lại");

        name = MyToys.getString("Input name: ", "Lỗi rồi nhập lại bạn ơi");

        yob = MyToys.getAnInteger("Input yob: ", "Lỗi rồi bạn ơi hãy thử lại");

        gpa = MyToys.getADouble("Input gpa: ", "Lỗi rồi bạn ơi hãy thử lại");

        ds[count] = new Student(id, name, yob, gpa);
        count += 1; // SIÊU VIP PRO, THIẾU LÀ TOANG CMNR
        System.out.println("Add student successfully");
    }

    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();    // FOR HẾT FOR EACH LÀ TOANG CMNR
                                    // VÌ MẸ KIẾP, MẢNG OBJECT DEFAULT CAÁC PHẦN TỬ LÀ NULL
                                    // HẠ CÁNH NƠI ANH, TRỎ ĐÁY RAM, MÀ ÉP ĐÁY RAM CÓ CODE SHOWPROFILE() LÀ QUÁ ĐÁNG LẮM LUÔN KO?
                                    // VÙNG NEW STUDENT(...) THÌ MỚI CÓ CODE MÀ CHẠY CHỨ
        }
    }

    public void searchAStudent() {
        // Search là quét/duyệt/đi từ trái sang phải lôi cổ từng sv[i] ra hỏi mày Id là mấy?
        // Sau đó đi so sánh với mã số mà mình muốn tìm == mã số sv[i] sv[i].getId()
        // Báo tìm thấy hoặc tìm hết ko thấy -> báo Not found
        // ĐÂY LÀ THUẬT TOÁN TRÂU BÒ/VÉT CẠN/TÁT CẠN
        String id = MyToys.getID("Input the id that you want to search: ", "Vui lòng nhập lại không hợp lệ", "SE00000");
        for (int i = 0; i < count; i++) {   // Ở đây đi đến chỗ đổ cuối cùng heng, chỗ count làm cờ đã đếm vị trí cuối cùng được đổ là bao nhiêu
            if(ds[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student found !!! Here she/he is");
                ds[i].showProfile();
                return; // TÌM THẤY THÌ DỪNG HÀM LUÔN, KHÔNG CẦN CHẠY LẶP FOR CHI NỮA
                        // NẾU ĐÃ TÌM THẤY Ở VỊ TRÍ GIỮA MẢNG KO PHẢI CUỐI MẢNG THÌ CHẠY THÊM CHI CHO PHÍ TÀI NGUYÊN CPU
            }
        }
        // Sống sót ở đây, đã chạy duyệt qua tất cả các object có trong mảng nhưng ko thấy
        // đi hết for rồi mà vẫn ko thoát được, show ra câu thông báo
        System.out.println("Not found the student you want");
        // Ở đây ngoài ra còn có thủ thuật dùng biến cờ FLAG/MARKER để phất cờ khi tìm thấy hoặc ko, và if() check để đưa ra câu thông báo phù hợp
    }
}
