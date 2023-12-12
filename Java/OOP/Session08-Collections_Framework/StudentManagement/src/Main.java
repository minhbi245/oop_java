import data.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        playWithArrayList();
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
        // 2 chàng 1 nàng
        arr.add(s2);    // sinh ra thêm con trỏ nữa [1]
                        // add() vô tận, mảng [lenght - 1] hết mức
                        // new cứ nằm ở HEAP, SV cứ ở nhà, công nhân cứ ở xưởng, bệnh nhân cứ ở phòng
        // add() ở đây là mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        // -> sinh ra con trỏ
        arr.add(s1);    // add trùng nè 1 tên người nữa lại vào danh sách,
        // 3 chàng 1 nàng luôn
        // Set ko báo lỗi đâu, nhưng chỉ lấy đúng 1... đừng đi vào chi tiết vội vã

        arr.add(new Student("SE999999", "CHIN PHẠM", 2003, 9.9));
        //      new cứ tạo ra object lên HEAP mà nằm, bệnh nhân cứ về phòng, tớ nắm được

        // Hỏi xem túi đang có bao nhiêu đồ/elements/các phần tử
        // arr.lenght hỏi túi mà, hỏi má mì mà, tên mảng đó mà
        System.out.println("The bag has: " + arr.size());

        // in mọi người ra
        // tủ có gì, chứa bên trong 1 đống con trỏ
        // mảng: [i].showProfile();
        // Cái Tủ ArrayList[con-trỏ1, con-trỏ2, con-trỏ3, con-trỏ4,... nếu add thêm]
        // add() là đẩy vào 1 con trỏ, tạo ra con trỏ giữ địa chỉ, thẻ bài
        // get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i
        //                              trả về địa chỉ vùng new mà con trỏ đang tham chiếu đến
        // [i] là ta lấy được địa chỉ mà bạn thứ i đang trỏ đến
        // get(i) là ta lấy được chỗ ngồi/địa chỉ ngồi tham chiếu bởi con trỏ thứ i
        // Ahhh, con trỏ này đang tro/tham chiếu đến vùng nhớ của object/bạn sinh viên kia kìa

        // in bạn đầu tiên thì
        // arr[0].showProfile(); phần tử đầu tiên của mảng - cách hồi đó làm bên C
        Student x = arr.get(0); // trả về tọa độ vùng new mà con trỏ bạn thứ 0 đang giữ
        // trả về tọa độ xong ta gán vào biến con trỏ khác kiểu là Student nắm tọa độ được trả về là okie
        System.out.println("The first student in list is");
        x.showProfile();

        // bạn get bạn 1 get(1), trả về tọa độ thì chấm luôn cho rồi, ko cần tạo thêm biến con trỏ để lưu tọa độ làm gì
        // 2 biến con trỏ tham chiếu cùng làm gì
        arr.get(1).showProfile();    // á đù trả về con trỏ, là ta biết tọa độ vùng new object Student đó, học rồi, 7 viên ngọc rồng
                                   // Ở bài Object đó nhen, bài thứ 17 - 18

        System.out.println("In xị sò fore");
        for (Student student: arr) {    // Éo sợ NULL POINTER vì add() đến đâu thêm con trỏ đên đó
            // student = arr.get(i) = arr[i]
            student.showProfile();
        }

        System.out.println("In xị sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            // Kiểu truyền thống của mảng arr[i].showProfile còn ArrayList sẽ dùng get()
            arr.get(i).showProfile();
        }

        // Có hành động xóa 1 con trỏ luôn, loại bỏ 1 thẻ bài, món đồ, gạch tên 1 người khỏi danh sách
        // Còn vùng new Student() bị mất hay ko là còn tùy là còn con trỏ nào khác tham chiếu/trỏ đến nó hay ko
        // size() giảm liền, mảng thì éo có vì fix cứng số con trỏ lúc đầu xin bộ nhớ cấp cho
        // set() là đảo con trỏ, tức là trỏ sang vùng khác (chính là hàm get() và set() xưa nay của các Object)
    }
}
