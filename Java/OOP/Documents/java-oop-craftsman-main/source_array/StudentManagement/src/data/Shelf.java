package data;

import java.util.Scanner;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

public class Shelf {

    //đặc điểm của cái tủ là gì???
    private String color;
    private String label;

    //đặc điểm chính cần focus
    //dung lượng, không gian chứa của cái tủ là bao nhiêu???
    //nhiều cách khác nhau
    //1. đóng sẵn kích thước
    //2. theo yêu cầu (đưa ra yêu cầu, đưa vào phễu)
    private Student[] arr = new Student[500];  //sẵn kích thước
    //logic mảng: cần có kích thước, chừa chỗ sẵn
    //value từng phần tử, từng món đồ từ từ tính
    //khi chơi với mảng, phải biết for đến đâu, coi chừng null pointer
    //add vào từ từ từ trái sang phải
    //ta cần 1 biến count nói về số lượng đang có trong mảng 
    //sure non static
    private int count = 0;

    private Scanner sc = new Scanner(System.in);

    //NON-STATIC CHO NHỮNG ĐẶC TÍNH Ở TRÊN
    // constructor làm những việc gì: đổ info vào
    // bài này mình đổ màu sắc, tủ dùng cho việc gì (label)
    // đặt hàng dung lượng, hoặc fix dung lượng
    // CÂU HỎI: sao em ko đưa hồ sơ thật của sv vào???
    // mua tủ về phải trống, nhét hồ sơ thật vào từ từ hợp lí hơn
    // nhét ngay 1 lần hết hồ sơ vào tủ là ko thực tế...
    // bỏ hồ sơ vào tủ thực sự đc lặp đi lặp lại nhiều lần với cái tủ
    // hàm thêm hồ sơ nằm ở cái tủ là hợp lí: ai có nhiều info, kẻ đó xử lí
    //addSV() xoaSV() ....        
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
        //this.count = 0;  //mới mua tủ thì chưa có hồ sơ cụ thể
        //có thể đưa qua con đường phễu, nhưng ko hay, vì đây là thứ người dùng
        //khi mua tủ ko cần biết, họ chỉ cần biết khả năng chứa tối đa
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    //hành động add mới hồ sơ sv lặp lại cho mỗi cái tủ, 1 cái kệ, app đk member
    public void addAStudent() {
        //chơi for vỡ mặt, phải là từ từ, vì nó sẽ đc liên tục bổ sung theo
        //quy trình cty, cách bạn làm với cái tủ
        int yob;
        String id, name;
        double gpa;
        
        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        //ngoài đời đếm từ 1, lừa đảo chỉ số i 1 tí, i chạy như cũ, 
        //đếm đôn lên 1 giá trị

        System.out.print("Input id: ");
        id = sc.nextLine();  //TODO: tên rỗng //CHECK TRÙNG ID
                             //CÒN TRÙNG CÒN NHẬP LẠI, Y CHANG ĐĂNG KÍ MEMBER

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine()); //MyToys.

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine()); //MyToys.

        arr[count] = new Student(id, name, yob, gpa);
        count++;  //VIP đã add xong 1 hồ sơ, thì phải sẵn sàng vị trí kế tiếp
        //bao nhiêu lần mở tủ add() hồ sơ, bấy nhiêu lần count tăng lên...
    }

    //y chang xem danh sách số kênh đã add vào cái tivi
    public void printStudentList() {
        System.out.println("There is/are " + count + " student(s) in the list");
//        for (Student x : arr)
//            x.showProfile();
        //coi chừng null pointer

        for (int i = 0; i < count; i++) {
            arr[i].showProfile();
        }

    }
    
    public void searchAStudent() {
        //đưa id vào từ bàn phím, tìm sv theo id
        //for từ đầu đến count của mảng, lôi từng sv ra hỏi, mã số của ku là gì
        //so sánh với id gõ vào, == nhau thì done, tìm ra sv ở vị trí i
        String id;
        System.out.print("Input student id that you want to search: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (arr[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student found!!! Here she/he is");
                arr[i].showProfile();
                return; //thoát hàm luôn, vì mã số sv duy nhất, thấy rồi
                //ko còn ai để for thêm làm gì
            }                
        }
        
        System.out.println("Student not found!!!");
    }

}
