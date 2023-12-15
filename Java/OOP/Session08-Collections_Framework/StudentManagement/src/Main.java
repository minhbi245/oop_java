import data.Student;

import java.util.*;

public class Main {
//    public static void main(String[] args) {
////        playWithArrayList();
//        // sortArrayListManually();
////        playWithSet();
////        Student test = searchStudent("SE123456");
////        test.showProfile();
//        sortStudentList();
//    }

//    public static void main(String[] args) {
//        List<Student> arrStudents = initData();  // arr ở đây trỏ thằng vào cái Túi có 5 SinhVien()
//        System.out.println("The student list");
//        for (Student student : arrStudents) {
//            student.showProfile();
//        }
//    }

    public static void main(String[] args) {
        List<Student> arrStudents = initData();
        // 5 9 4 2 8
        Student xStudent = searchAStudent(arrStudents, "SE888888");
        if (xStudent == null) {
            System.out.println("NOT FOUND STUDENT!!!");
        } else {
            xStudent.showProfile();
            // Nếu tìm thấy kết quả tui sẽ update dữ liệu luôn, sửa điểm bạn TÁM THÀNH 6789
            xStudent.setGpa(6789);
        }

        // in ra kết quả để xem sự thay đổi diểm gpa của bạn TÁM
        System.out.println("The student list after update SE 8");
        for (Student student: arrStudents) {
            student.showProfile();
        }
    }

    // hàm chuẩn bị DATA. HÀM TRẢ VỀ 1 CÁI TÚI/ARRAYLIST/DÁNH SÁCH SINHVIEN()
    // ĐỌC ĐÚNG: HÀM TRẢ VỀ TỌA ĐỘ VÙNG NEW ARRAYLIST() MÀ BÊN TRONG CÓ SẴN 1 ĐỐNG THẺ/ 1 ĐỐNG CON TRỎ/ GHI ĐỊA CHỈ SINHVIEN()
    // HÀM TRẢ VỀ VỊ TRÍ 1 CÁI TÚI CÓ SẴN RỒI/MUA RỒI. TRONG TÚI CÓ GÌ...
    //              List<Student> arr; = new Gì Đó
    //                           initData = new ArrayList() nào đó
    public static List<Student> initData() {
        List<Student> arrStudents = new ArrayList<Student>();
        arrStudents.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arrStudents.add(new Student("SE444444", "TỨ VÕ", 2003, 4.4));
        arrStudents.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arrStudents.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arrStudents.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        return arrStudents; // initData() = arr = new ArrayList
        // tên-hàm cùng trỏ vào Giỏ vừa new
        // => 2 CHÀNG LÀ ARRSTUDENTS VÀ TÊN HÀM INITDATA() CÙNG TRỎ 1 NÀNG CHÍNH LÀ NEW ARRAYLIST(BÊN TRONG CÓ 5 BIẾN CON TRỎ/THẺ BÀI SINHVIEN())
    }

    //             Strudent x = cần trỏ 1 vùng new SinhVien()
    //                      tên hàm là 1 biến sinh viên, tên hàm này cần trỏ 1 vùng new SinhViên()
    // Hàm trả về giá trị thì tên hàm ~~~ giá trị
    //                                                  arr trỏ 1 cái Giỏ có sẵn
    //                                                  Giỏ ArrayList new ở đâu đó ko care
    //                                                  trong Giỏ có gì ko care vội, lục lọi sau
    // Vậy xài hàm này ta cần chuẩn bị sẵn 1 cái Túi/Giỏ ở đâu đó trước rồi, có đồ bên trong luôn rồi
    // đưa vị trí Giỏ/Túi có sẵn đó vào hàm
    // Như là y tá đưa bác sĩ danh sách, bệnh nhân nằm sẵn ở các phòng rồi
    // đưa mảng/Túi/Giỏ ArrayList có sẵn từ main() vào hàm này. OKIE
    // NHƯNG KO HAY, LẬP TRÌNH LÀ MỌI THỨ TRONG HÀM -> VỚI NGÔN NGỮ C
    // CÒN VỚI OOP THÌ            MỌI HÀM NẰM TRONG OBJECT -> OOP
    // BÀI NÀY, ĐANG THỬ NGHIỆM, TA ĐƯA TOÀN BỘ DATA VÀO TRONG HÀM CÁI ĐÃ
    public static Student searchAStudent(List<Student> arr, String id) {
        // rà qua các phần tử trong mảng/Giỏ, lôi từng con trỏ/thẻ ra
        // hỏi thẻ đó/con trỏ đó, cho tao biết SinhVien() này có id là bao nhiêu, (i).get(i)
        //                  trỏ vào new Student()
        // if(id mới tình == id cần tìm đưa vào) return tọa độ/địa chỉ trên cái thẻ
        //                                               cái thẻ
        // còn nếu ko thấy, return null, tên hàm trỏ vào null, ko có sinh viên, chấm thì bị Exception
        // SinhVien() ko tìm thấy chấm vô nghĩa!!!

        // TA CẦN 1 DANH SÁCH SINHVIEN() ĐỂ FOR
        if (arr.isEmpty()) {  // đưa Túi/Giỏ rỗng mới mua, làm éo có gì mà search
            return null;        // cho mày tọa độ NULL trả về này
        }

        for (int i = 0; i < arr.size(); i++) {
            // lôi cổ từng thẻ/từng biến con trỏ ra, hỏi id của mỗi sinh viên
//            Student x = arr.get(i);
//            String xId = x.getId(); // địnhh luật bắc cầu arr.get(i).getId;
//            // if (xId == id) id vừa lấy của SinhVien == id đưa vào thì return tọa độ object được new
//            if (xId.equals(id)) {
//                return arr.get(i);
//            }
            if(arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        // đi hết for mà ko return được, sure ko thấy gì cả, trả ra NULL
        return null;
    }

    // CÁC HÀM XỊN SÒ, SORT, SEARCH, CHUẨN BỊ KHO DATA
    // 3 HÀM NÀY ĐỀU LÀ STATIC CHO MỤC TIÊU THỬ NGHIỆM, NÓ CHƯA LÀ TƯ DUY OOP
    // TƯ DUY OOP LÀ CÁC HÀM PHẢI NẰM TRONG OBJECT NÀO ĐÓ CƠ, TƯ DUY ABSTRACTION, ENCAPSULATION
    //                  CHẾ TAỘ CÁI TỦ, THÙNG CHỨA, CÓ CÁC HÀNH ĐỘNG: THÊM, XÓA, TÌM, SỬA, SẮP XẾP

    public static  void sortStudentList() {
        // cần chuẩn bị danh sách sv: mua cái Túi-new Túi(), cần có các hồ sơ sinh viên, new sinh-viên()
        List<Student> arrStudents = new ArrayList<Student>();
        arrStudents.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arrStudents.add(new Student("SE444444", "TỨ VÕ", 2003, 4.4));
        arrStudents.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arrStudents.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arrStudents.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        // CÁI TÚI đang có chứa thẻ bài/biến con trỏ/biến tham chiếu, 5 biên con trỏ, tham chiếu thông tin trên cardVisit chính là địa chi vùng new Student trên HEAP
        // y chang bác sĩ cầm danh sách excel chưa thông tin các bệnh nhân, bệnh nhân cuứ nằm ở phòng bệnh, bác sĩ đi thăm sau
        // Bác sĩ đi thăm, nhìn ds, thấy số phòng, chính là địa chỉ từng bệnh nhân
        // Bệnh nhân1, bệnhh nhân 2, thẻ 1, thẻ 2, card 1, card 2 chính là
        // biến con trỏ, biến con trỏ thì có địa chỉ object được new/malloc() để lấy được biến con trỏ đang chứa thông tin địa chỉ thì dùng get(i)
        System.out.println("The student list before sorting ascending by gpa");
//        for (Student student: arrStudents) {
//            // x = arr.get(i) | arr[i] cũ trong C -> chính là lấy tọa độ địa chỉ được lưu trong biến con trỏ/ biến tham chiếu và cất vào x
//            student.showProfile();
//        }

        for (int i = 0; i < arrStudents.size(); i++) {
            arrStudents.get(i).showProfile();
        }
        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arrStudents.size() - 1; i++) {
            for (int j = i + 1; j < arrStudents.size(); j++) {
                if (arrStudents.get(i).getGpa() > arrStudents.get(j).getGpa()) {
                    Student tmp = arrStudents.get(i);   // cất tọa độ bạn i đi
                    arrStudents.set(i, arrStudents.get(j));
                    arrStudents.set(j, tmp);
                }
            }
        }

        for (Student student: arrStudents) {
            student.showProfile();
        }

        Student searchById = searchAStudent(arrStudents, "SE999999");
        searchById.showProfile();

    }

    // TÌM KIẾM 1 SV TRONG DANH SÁCH, HÀM TRẢ VỀ OBJECT - 7 VIÊN NGỌC RỒNG ĐÓ HỌC RỒI NHEN BÀI 17-18 GÌ ĐÓ XEM LẠI
    // ĐỌC ĐÚNG LÀ: HÀM TRẢ VỀ THAM CHIẾU ĐẾN 1 VÙNG NEW
    //              HÀM TRẢ VỀ CÁI THẺ BÀI, TRÊN THẺ CÓ KHẮC HỌA TỌA ĐỘ VÙNG NEW
    //              HÀM TRẢ VỀ DỊA CHỈ MÀ OBJECT NEW ĐANG NẰM
    public static Student searchStudent(String id) { // tên hàm là 1 tọa độ searchStudent()
        // mò trong Arraylist, mang[] lấy được thẻ bài/biên con trỏ, thảy/ném ra ngoài
        // thảy/ném ra hàm cái tọa độ ghi trong thẻ bài/con trỏ, chỉnh là trỏ đến object được new ở vùng RAM
        List<Student> arr = new ArrayList<Student>(); // new là có cái Túi mới, có hành động, có chỗ chứa đồ

        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);

        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);

        // quét từ đầu đến cuối giỏ, lôi từng thẻ bài/biến con trỏ ra, get(i)
        // hỏi tiếp, mã số sinh viên của mày là mấy, get(i).getId()
        // if(id cần tìm == id vừa lấy xong trong giỏ) return thẻ bài/biến con trỏ chứa tọa đồ khớp với info
        // return tọa độ ghi trong thẻ bài, return vùng new SV tìm thấy
        Student tmp = arr.get(0);
        String tmpId = tmp.getId();
        if(tmpId.equals(id)) {  // do String trong Java la object ko so sánh 2 object được, vì nó chỉ co tọa độ
                                // phải dùng hàm equals để truyền vào id cần tìm so sánh
            return tmp;
        } else {
            return null;
        }
    }

    // Set: nhóm Túi/Giỏ hàng hiệu, mỗi elements/thẻ bài/ con trỏ xuất hiện 1 lần thôi
    // ko có 2 thẻ baài/con trỏ trỏ cùng 1 vùng new
    // Mỗi con trỏ/thẻ bài trong giỏ này trỏ duy nhất 1 vùng new thôi
    // Set chia 2 loại Giỏ chi tiết hơn: HashSet: đồ được đưa vào lộn xộn thuứ tự
    // ArrayList thì được đưa vào và giữ nguyên thứ tự, vào ra đúng thứ tự, get() set(), add()
    //                                   TreeSet: đồ đưa vào TỰ ĐỘNG SẮP XẾP
    public static void playWithSet() {
        Set<Student> arr = new HashSet<Student>();
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.9));   // CÓ NEW LÀ CÓ VÙNG NHỚ MỚI, ĐÃ CÓ BIẾN CON TRỎ NÀO THAM CHIẾU ĐÂU
        // QUAN TÂM ÉO GÌ INFO TRÙNG CỦA VÙNG NEW ĐÂU
        // CỨ CÓ NEW ~~~ MALLOC() BÊN C LÀ CÓ VÙNG NHỚ MỚI, CÓ BIẾN LÀ CÓ CON TRỎ THAM CHIẾU VÙNG NHỚ MỚI
        // NEW/MALLOC SẼ TRẢ VỀ TỌA ĐỘ CHO BIẾN CHO TRỎ THAM CHIẾU/TRỎ ĐẾN TỌA ĐỘ VÙNG NHỚ VỪA ĐƯỢC CẤP/NEW/MALLOC
        arr.add(binh);
        arr.add(binh);
        // ÂM THẦM LOẠI BỎ ADD TRÙNG
        // VÀO VÀ RA KO THEO ĐÚNG THỨ TỰ, ADD() VÀO THÌ OKIE, KO CÓ HÀM GET RA()
        // MUỐN LẤY INFO TRONG SET CHỈ CÓ CÁCH FOR EACH
        System.out.println("The student list");
        for (Student student: arr) {
            student.showProfile();
        }

    }

    // một cái túi List Cha (nhiều con ArrayList, Vector, ... ) có 1 cơ chế sort tự dođộng QUA GỌI LỆNH
    // các thẻ bài/biến tham chiếu/biến con trỏ bên trong cơ chế này thiì phải xài Interface (Comparable và Comparator)
    // học sau, cuối cùng vẫn là so sánh và đảo thứ tự
    // ta dùng trước cơ chế tự viết sort, so sánh và đổi thứ tự trỏ
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList<Student>(); // new là có cái Túi mới, có hành động, có chỗ chứa đồ

        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);

        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        // Mở khóa dây của gió, rồi nhét 1 con trỏ/thẻ bài mới vào, con trỏ ghi thông tin trỏ tới sinh viên AN 9.0
        // thẻ bài/con trỏ này nằm ơở vị trí đầu tiên trong giỏ [0]
        // Bệnh nhân cứ nằm ở phòng, new mới thì nằm trong vùng nhớ HEAP trong RAM
        // thong tin bệnh nhân + phonòng -> ghi vào excel/1 dòng trong danh sách
        // bác sĩ cầm trên tay danh sách, arr đấy
        // arr là cái túi excel chứa tọa độ của bệnh nhân

        arr.add(binh);  // 1 thẻ bài/con trỏ được thêm vào giở trỏ BÌNH 4.9
        arr.add(binh);  // add trùng, đã coó trước đó 1 con trỏ/thẻ bài đả tham chiếu/trỏ vùng new BINH 4.9
                        // THÊM THẺ BÀI/CON TRỎ NỮA THÌ GHI INFO THAM CHIỀU/TRỎ BÌNH 4.9
        // danh sách 3 người, 1 người bị ghi 2 lần
        // in danh sách

        for (Student student: arr) {
            // x = con trỏ/ thẻ bài thứ 0, thẻ bài/con trỏ thứ 1, con trỏ/thẻ bài thứ n
            // student lưu tọa độ nằm trong thẻ bài thứ i, tức trỏ/tham chiều vùng new thứ i
            student.showProfile();
        }

        // LẤY TRỰC TIẾP TỪNG CON TRỎ,KO CHƠI TRÒ QUÉT BẰNG FOR EACH
        // tương đương [i] bên mảng, vị trí thứ i, biến thứ i
        //                                          chính là chứa trong nó tọa độ của vùng new
        System.out.println("The student list (printed by using for i)");
        for (int i = 0; i < arr.size(); i++) {
            // Student temp = arr.get(i);  // trả về con trỏ thứ i, con trỏ đó chứa tọa độ vùng new Student
            // temp.showProfile();  cất tọa độ này vào một biến con trỏ sinh viên khác vẫn okie
            arr.get(i).showProfile();   // lấy con trỏ/thẻ bài thứ i trên có tọa độ vùng new trước đó roồi thì mình chấm luôn
        }

        // XÓA BÌNH CUỐI TRONG GIỎ, TỨC LÀ LOẠI BỎ THẲNG ĐI 1 CON TRỎ/THẺ BÀI,
        // BIẾN MẤT 1 CON TRỎ LUÔN, SIZE() CŨNG SẼ GIẢM ĐI 1 ĐƠN VỊ
        // MẢNG KO CÓ TRÒ NÀY, XIN BAO NHIÊ, FIX BẤY NHIÊU, CÒN BẤY NHIÊU
        arr.remove(2);

        System.out.println("The LAST student list (printed by using for i");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }

        // THẺ BÀI/ CON TRỎ (0) LUÔN CÓ GHI TRÊN THẺ BÀI INFO CỦA SINH VIÊN AN 9 Ở XA
        // THẺ BÀI/ CON TRỎ (0) LUÔN CÓ GHI TRÊN THẺ BÀI INFO CỦA SINH VIÊN BÌNH 9 Ở XA
        // TUI MUỐN SẮP XẾP THEO TĂNG DẦN ĐIỂM
        // CHẮC CHẮN RỒI, PHẢI ĐỔI LẠI INFO TRỎ, CÁCH TRỎ, GHI LẠI CÁI THẺ BÀI TRỎ LẠI ĐI
        // THẺ BÀI/CON TRỎ (0) PHẢI TRỎ VÀO BÌNH 4.9
        // THẺ BÀI/CON TRỎ (1) PHẢI GHI LẠI INFO TRỎ, TRỎ VÀO AN 9.0
        // [I] = [J] ĐỔI INFO TRỎ
        // hàm .set(vị trí con trỏ/thẻ bài, thông tin tọa độ mới)

        Student tmpStudent = arr.get(0);    // lấy tọa độ vùng new AN là 9, THẢY VÀO TMPSTUDENT
        arr.set(0, arr.get(1)); // get(1) được tọa độ vùng new BÌNH 4.0, THẢY TỌA ĐỘ ĐÓ VÀO (0)
        arr.set(1, tmpStudent); // sửa đồng thời thể 1, trỏ vùng mới
                                // vùng tmp đang trỏ, AN 9 XƯA KIA
        System.out.println("The student list sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
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
