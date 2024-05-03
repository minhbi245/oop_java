package data;

import java.util.Scanner;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

public class Shelf {
    //đặc điểm của 1 cái tủ bất kì là gì: màu sơn:__; giá tiền:___; nhà sx:____

    //số ngăn/không gian chứa đồ:______các món đồ nhét vào, món đồ là object
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng
    //ứng dụng của mảng, góp phần tạo dựng nên object khác
    //OOP: tìm các object, chúng phối hợp, trộn nhau
    private String color; //= "PINK"; //________
    
    private String label; //_______  tủ chén, tủ hồ sơ SE, IA, GD, JP

    //biến được đưa value, lúc nào???
    //                      qua phễu (default trong suy nghĩ)
    //                      gán trực tiếp lúc khai báo
    
    //chứa cái gì, chừa không gian để chứa đồ, thực ra đồ chưa có
    //             chưa có hồ sơ sv
    
    private Student[] ds = new Student[300];  //ds[0] = new Student();
             //ds là biến má mì = cần value    
             //            new sẵn 300 tương đương mua tủ 300l
             //            đặt hàng kích thước, dung tích size 500, 1000, 2000
    

                                               //có cách nâng cao tủ linh hoạt
                                              //về khả năng chứa. Từ từ tính...
    private int count = 0;  //mới mua tủ về, số hồ sơ = 0
                            //nhét thêm 1 hồ sơ thì count++
                            //chơi mảng chỉ for đến count
    //lưu trữ cách để đồ vào mảng, vào giỏ, để từ trái sang phải, tương đương
    //sắp xếp đồ vào tủ giỏ theo thứ tự gọn gàng
    //FOR ĐẾN COUNT
    private Scanner sc = new Scanner(System.in);
    
    //tui có không gian chứa info, tui sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String label) { //int size kích thước tủ
        this.color = color;
        this.label = label;
        //ds = new Student[size]; //linh hoạt trong kích thước thủ
    }

    //DATA + HÀM XỬ LÍ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ SẼ LÀ NON-STATIC
    //NẾU KO CÁC TRƯỜNG ĐH, BỘ MÔN XÀI CHUNG DSSV TOANG
    //ĐỒ ĐẠC, HÀNH XỬ PHẢI THUỘC VỀ OBJECT
    public void inputAStudent() {
        
        //nhập đúng chạy phải đúng cái đã
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");                     //1 / 300
        id = sc.nextLine();                   //TODO: kiểm tra id trùng
                                               //MyToys.get...("SEXXXXXX");
                                               //Regular Expression kiểm tra chuỗi nhập đúng định dạng hay ko  
        
        System.out.print("Input name: ");
        name = sc.nextLine();                   //MyToys.get...()
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());  //MyToys.get...()
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());  //MyToys.get...()
        
        ds[count] = new Student(id, name, yob, gpa);
        count++;   //SIÊU VÍP
        System.out.println("Add student successfully");
    }
    
    public void printStudentList() {
        System.out.println("The student list");  //chưa thèm kiểm tra mảng rỗng!!!
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();   //FOR HẾT LÀ TOANG!!!
        }                          //VÌ MẸ KIẾP, MẢNG OBJECT DEFAULT CÁC PHẦN TỬ LÀ NULL
    }                              //HẠ CÁNH NƠI ANH, TRỎ ĐÁY RAM, MÀ ÉP ĐÁY 
                                   //RAM CÓ CODE SHOWPROFILE() QUÁ ĐÁNG HOK?
                                   //VÙNG NEW STUDENT(....) THÌ MỚI CÓ CODE CHẠY CHỨ
    
    public void searchAStudent() {
        //search là quét/duyệt/đi từ trái sang phải lôi cổ từng sv[i] ra
        //hỏi hắn mã số mày là mấy????
        //so sánh với mã số muốn tìm??? == mã số of sv[i]  sv[i].getMS()
        //báo tìm thấy, tìm hết hok thấy == báo rằng not found
        //THUẬT TOÁN TRÂU BÒ/VÉT CẠN/TÁT CẠN
        System.out.print("Input the id that you want to search: ");
        String id = sc.nextLine();  //hoa thường à nhen
        for (int i = 0; i < count; i++) {  //đi đến chỗ đổ cuối cùng heng
            if (ds[i].getId().equalsIgnoreCase(id)) {
                //tìm thấy tại vị trí [i]
                System.out.println("Student found!!! Here she/he is");
                ds[i].showProfile(); //in kết quả liền
                //ds[i].   update hồ sơ profile 
                return;
            }  //tìm thấy thì dừng hàm luôn, ko for gì nữa
        }
        
        //sống sót here, sure, éo có thấy id cần tìm, nếu thấy dừng sớm ở trên
        //đi hết for mà ko thoát đc, báo ko thấy
        System.out.println("Student not found!!!");
        //dùng biến flag phất cờ nếu thấy và ko, if () in ra câu gì?
        
    }
}
