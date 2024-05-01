package data;

public class Student {
    private static String id;   // static nằm ở 1 vùng nhớ riêng, mà object nào cũng xài ké, xài chung
    public static String name;  // vùng nhớ xài chung cho các object cùng Khuôn/Class/Nhóm
                                // Dữ liệu đổ vào hay chỉnh sửa aăn theo thằng cuối cùng mà nó đổ/gán
                                // Biến này, đặc tính này thuộc về CLASS LEVEL, thuộc về static

    // CHỐT HẠ: KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ĐẶC ĐIỂM/ HẦM MÀ CỦA RIÊNG TỪNG OBJECT
    // tui có mã số, bạn có mã số, bạn kia cũng có mã số, nhưng đều là riêng của mỗi đứa
    // Chung đặc điểm là có mã số, nhưng khác value, vậy phải có biến clone riêng - NON STATIC
    public int yob;
    private double gpa; // grade point average
    // ...

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    } Do hiếm khi phải thay đổi mã số id, giống như môn DB primary key

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f| \n", id, name, yob, gpa);
    }

    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f| \n", id, name, yob, gpa);
    } // NON-STATIC CHƠI VỚI NON - DĨ NHIÊN CÙNG OBJECT, VÀ STATIC LUÔN, ĐỒ RIÊNG THÀNH CHUNG

    public int getAge() {
        return 2021 - yob;
    }

    public static void sayHi() {
        System.out.println("Hi everyone my name is: " + name);
//        System.out.println("By the way, my yob is " + yob);
//        STATIC CHỈ CHƠI VỚI STATIC VÌ CÙNG KHU VỰC -> có quá trời yob được clone, biết lấy yob nào bỏ yob nào
//        -> static ko choi với non-static
    }
}

// Conclusion: Static chỉ có thể chơi với static vì chung 1 khu vực vùng RAM được cấp riêng 1 khu vực Static
//              Vậy tại sao hàm main là static?
//                  + Vì có sự quy ước chung giữa nhà phát triển hệ điệu hành, hàm main phải được load nằm cố định ở 1 vùng RAM để được load
//                  + Mà cố định chính là static
//==========================================================================
//Ngoài ra ta còn khái niệm về các level như sau
// Chiếu dưới thì ta có OBJECT LEVEL, INSTANCE LEVEL chính là tức là các thuộc tính sẽ được clone theo từng OBJECT, ăn theo từng object riêng biệt
// Còn chiếu trên là ta có Class level, vùng nhớ dùng chung cho tất cả các Object khác, vùng tĩnh hay cố định -> static