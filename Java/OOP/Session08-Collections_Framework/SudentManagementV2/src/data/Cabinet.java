package data;

import java.util.*;

public class Cabinet {
    // Properties
    /*
        Màu săcs
        Giá tiền
        Nhãn tủ/lable
        Mình quan tủ đựng nhiều đồ
     */

    private List<Student> arr  = new ArrayList<>();  // = new ArrayList() là đủ, add vào sau

    private Scanner sc = new Scanner(System.in);

    // Phễu này gọi là Phếu rỗng/empty constructor/default cst
    public Cabinet() {
    }

    // Methods
    // Tủ thì có các hành động cơ bản:
    /*
        Mở khóa kéo ra
        bỏ đồ vô
        loại bỏ đồ ra
        chỉnh sửa
        tìm kiếm
        sắp xếp
     */

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input sutdent profile #" + (arr.size() + 1));


        while(true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();
            //                 trim ở đây giúp ta trả về chuỗi cắt khoảng trắng dư đầu đuôi
            //                                          đổi chuỗi vừa cắt qua HOA
            // vừa gõ id xong, check liền coi có trung id ko, có, chửi, bắt nhập lại
            // còn sai là còn ăn chửi, bắt nhập lại
            Student xStudent = searchStudent(id);
            if (xStudent == null) {
                break;  // ko thấy có sinh viên nào ứng với id này, tức là ko trùng, BREAK LÀ ĐỂ NHẬP TIẾP INFO CÒN LẠI
                        // KO TRÙNG ID CHÍNH LÀ KHÁI NIỆM PRIMARY KEY BÊN DATABASE
            } else {
                System.out.println("Duplicated ID. Try with another one");
            }
        }

        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add a new student successfully");
    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("There is no student to print");
            return;
        }
        System.out.println("There is/are" + arr.size() + "student(s)");
        for (Student xStudent: arr) {
            xStudent.showProfile();
        }
    }

    // CRUD: Create/Retrieve(Read)/Update/Delete
    // viết hàm search là ham quant rọng, vì nó ko chỉ là search cho nhu cầu tìm hồ sơ
    // mà còn giúp cho các hành động khác: xóa, sử hồ sơ
    //                           giúp việc tọa mới hoàn hảo hơn
    // tìm xem mã số sv vừa tọa mới có trùng không
    // tương đương đki 1 member, gõ acc báo trùng rồi, còn trùng còn éo cho đi tiếp
    // ta sẽ viết hàm search giải quyết được khá nhiều chuyện thì tốt hơn

    public Student searchStudent(String id) {
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            Student student = arr.get(i);
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    //          overloading xảy ra này
    // hàm này bao hàm trên lại - dùng lại, cung cấp id. Nhìn ra ngoài tủ
    // bên ngoài sẽ thấy Cabinet/Class/Khuôn này có 2 cách search
    // 1. Là bạn đưa id trực tiếp
    // 2. Là bạn nhập id vào
    public void searchAStudent() {
        String id;
        System.out.print("Input a student id that you want to search: ");
        id = sc.nextLine().trim();
        Student xStudent = searchStudent(id);
        if (xStudent == null) {
            System.out.println("NOT FOUND!!!");
            return;
        } else {
            System.out.println("STUDENT FOUND/ Here she/he is");
            xStudent.showProfile();
        }
    }

    public void updateAStudent(Student x, double newGPA) {
        // đã đưa tao tham chiếu đến sinh viên x, tao set luôn
        // check coi x có null không trước đã, vì null sao mà set
        if (x != null) {
            x.setGpa(newGPA);
        }
    }

    public void updateAStudent(String id, double newGPA) {
        Student xStudent = searchStudent(id);
        if (xStudent == null) {
            System.out.println("STUDENT NOT FOUND! Nothing to update");
        } else {
            System.out.println("Before updating");
            xStudent.showProfile();

            xStudent.setGpa(newGPA);

            System.out.println("After updating");
            xStudent.showProfile();
        }
    }

    public void updateAStudent() {
        String id;
        double newGPA;  // có ai đó làm price kiểu int -> ăn đòn
        System.out.println("Input the student id that you want to update profile");
        id = sc.nextLine().trim();

        Student xStudent = searchStudent(id);   // có biến con trỏ tham chiếu trỏ đến vùng new Student() với id cần tìm
        if (xStudent == null) {
            System.out.println("STUDENT NOT FOUND! Nothing to update");
        } else {
            System.out.println("Before updating");
            xStudent.showProfile();
            // Mời nhập điểm số/ giá tiền mới
            System.out.println("Input new gpa");
            newGPA = Double.parseDouble(sc.nextLine().trim());
            xStudent.setGpa(newGPA);

            System.out.println("After updating");
            xStudent.showProfile();
        }
    }
}
