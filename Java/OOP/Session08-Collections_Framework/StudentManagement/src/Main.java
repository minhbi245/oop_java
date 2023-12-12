import data.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void playWithArrayList() {
        // Student[] arr = new Student[500];
        // arr là 1 cái túi chứa sẵn 500 chỗ, 500 sinh viên/món đồ có thể bỏ vô
        // moón đồ phải đi mua, new, rồi thảy vào
        // tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn

        //List arr = new ArrayList(); // đựng lộn xộn đủ loại con trỏ
        // đúng nghĩa là túi Doraemon, món gì cũng dưng, đựng tham chiếu hoy nha
        // nhét được cả NhanVien, GiangVien, Animal, Dog, ...


        // Túi đồng nhất chỉ dùng lưu con trỏ Student
        List<Student> arr = new ArrayList<>();  // túi đựng đồng nhất 1 loại gọi là GENERIC
        //List<Student> arr1 = new ArrayList<Student>()
        // arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        // nhét đồng nhất món đồ dễ chấm chung được, đa hình được

        // MƠỞ NGĂN TỦ/TÚI, NHÉT ĐỒ VÔ
        //arr[i] = new Student(...); // mảng
        //arr.add(new Student(...));  // lưu con trỏ hoy
                                    // new Student thoải mái ở bên ngoài, vùng HEAP

        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 7.5);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 8.5);
        arr.add(s1);    // giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        arr.add(s2);    // sinh ra thêm con trỏ nữa [1]
                        // add() vô tận, mảng [lenght - 1] hết mức
                        // new cứ nằm ở HEAP, SV cứ ở nhà, công nhân cứ ở xưởng, bệnh nhân cứ ở phòng
        // add() ở đây là mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        // -> sinh ra con trỏ
        arr.add(s1);    // add trùng nè 1 tên người nữa lại vào danh sách,
        // Set ko báo lỗi đâu, nhưng chỉ lấy đúng 1... đừng đi vào chi tiết vội vã

        arr.add(new Student("SE999999", "CHIN PHẠM", 2003, 9.9));
        //      new cứ tạo ra object lên HEAP mà nằm, bệnh nhân cứ về phòng, tớ nắm đươ
        for (Student x: arr) {
            x.showProfile();
        }
    }
}
