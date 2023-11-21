package khanh.stage;

import java.util.Scanner;

import khanh.data.Student;

public class stage {

    public static void main(String[] args) {
       Student x = checkObjectV7(); // x = tọa độ của ai đó new, ai đó new đã được return qua tên hàm
       x.showProfile(); // AHIHI
       x.setName("EM HOK ĐỔI NGÀNH");
       x.showProfile(); // EM HOK ĐỔI NGÀNH
       // VI DIỆU TT
        checkObjectV7().showProfile(); // TẠO RA NEW CLONE MỚI, TẠO RA OBJECT MỚI
    }

    // BIẾN CÓ QUYỀN THAY ĐỔ CHỖ TRỎ!!!
    // MẤT TỌA ĐỘ, MẤT DẤU VÙNG `NEW`, CÓ THỂ XẢY RA ĐIỀU NÀY HAY KO? NẾU CÓ THÌ HẬU TRƯỜNG DIỄN RA ĐIỀU GÌ?

    // HÀM TRẢ VỀ OBJECT, KO TRẢ VỀ PRIMITIVE
    // Đọc đúng phải thế này: hàm này trả về tọa độ của 1 object đã new ở đâu đó
    /*
        Student x = ...
        Student s1 = ...
        int a;
        int f();    <- sqrt(); Tên hàm là 1 biến vì nó chứa 1 giá trị
     */
    public static Student checkObjectV7() { // Tên hàm này cũng là 1 biến, là 1 biến object
                                            //  Giá trị của hàm này, biến này là tọa độ new
        Student s1 = new Student("SE666789", "AHIHI KHANHNVM", 1993, 3.9);
        // s1 em đang nắm tọa độ vùng new clone trong HEAP đó anh
        return s1;  // em ném cái tọa độ đó vào tên hàm
                    // tên hàm là tọa độ, Student f() mà, f() là tọa độ mà
                    // 2 chàng trỏ 1 nàng new f() và s1 cùng trỏ new

        // Từ trong hàm ném được tọa độ vùng nhớ trong HEAP, vùng new clone ra ngoài
        // Lát hồi hàm chạy xong, mất mẹ nó biến s1 vì s1 nằm trong STACK
        // TUY NHIÊN vùng `NEW` vẫn nằm ở HEAP, vùng nhớ HEAP chỉ có GARBAGE COLLECTOR mới giết được
    }

    // KHAI BÁO BIẾN RỒI GÁN SAU
    public static void checkObjectV6() {
        int a;
        a = 10; // ~~~~~~~ int a = 10;
        Student s1; // tớ với cậu sẽ nói xấu dìm hàng 1 thằng bạn heng
                    // s1 là đứa tao với mày sẽ chơi trỏ, troll, lên confession
                    // s1 cần lắm luôn trỏ vùng new, sẵn sàng để trỏ
        // thằng trỏ đó đây
        // giờ trỏ nè
       s1 = new Student("SE666789 ", "AN NGUYỄN", 1993, 3.1);
       s1.showProfile();
    }

    public static void checkObjectV5() {
        // Student s1 = new Student("SE666789 ", "AN NGUYỄN", 1993, 3.1);

        // Object vô danh, sinh ra mà hok thèm đặt tên, chỉ khóc 1 tiếng rồi pass away
        // s1.showProfile();
        // s1 chấm tức là vào vùng tọa độ chấm làm gì đó
        // new ... cũng chính là tọa độ, đẩy cho s1, s1 và new ... là như nhau
        // s1 chấm cũng như new chấm

        new Student("SE666789", "AHIHI", 1999, 3.9).showProfile();
        // Cò hó chạy ngoài đường ko có ông chủ cầm xích, exciter hốt luôn
        // ko có con trỏ, réo lên được 1 lần rồi GARBAGE COLLECTOR hốt xóa luôn, chết luôn
        // object vô danh, anonymous object
        // VẬY CHO NÊN MUỐN RE-USE OBJECT, MUỐN CHẤM NHIỀU LẦN THÌ PHẢI CÓ TÊN GỌI

    }

    // HAI CHÀNG TRỎ 1 NÀNG
    public static void checkObjectV4() {
        Student s1 = new Student("SE00097", "AN NGUYỄN", 1993, 3.1);
        Student s2 = s1; // 2 thằng cùng nhòm 1 hướng tọa độ, 2 chàng trỏ 1 nàng
        // s1 và s2 cùng lưu 1 tọa độ, cùng trỏ vùng new clone AN
        s1.setName("ANH CỤC SÚC");

        s2.showProfile();   // ANH CỤC SÚC
        s1.showProfile();   // ANH SỤC SÚC

        /*
            Sếp
            Sky                 ----> CaSi() Sơn Tùng
            Anh lạc trôi
         */
    }

    // BACKUP OBJECT, TỨC LÀ GIỮ LẠI TỌA ĐỘ
    public static void checkObjectV3() {
        Student s1 = new Student("SE00097", "AN NGUYỄN", 1993, 3.1);
        // trước khi s1 chơi với BÌNH, ko muốn mất AN
        // vậy cần ghi ra đâu đó cái tọa độ vùng new của AN,
        // trước khi đãng trí quên tên, thì ghi ra giấy, danh bạ
        Student x = s1; // new Student("SE00098", "BÌNH LÊ", 1994, 3.4); -> ĂN ĐÒN NHEN này là new ra vùng nhớ khác rồi
        s1.setName("EM ÉO TIN THẦY");
        // x tao là biến object, tao rất cần tọa độ 1 vùng new
        // tự new thì okie, nhưng trước đó có thằng nào new trước rồi chưa cho tao với, cho tao cùng chơi với
        // cho tao tọa độ đi, tao ko cần new nữa
        // khi này x trỏ đến AN NGUYỄN ở trên
        int a = 10;
        int b = a; // gán giá trị 2 biến cho nhau, ở đây phải đi tìm vùng ram có giá trị a và clone gán cho b
        s1 = new Student("SE00098", "BÌNH LÊ", 1994, 3.4);
        // s1 đã bỏ AN, đi với BÌNH
        // x ở đây là AN CỦA NGÀY HÔM QUA, XƯA CŨ BỊ S1 RUỒNG BỎ
        s1.showProfile();
        x.showProfile(); // AN NGUYỄN NHƯNG BỊ THAY THÀNH EM ÉO TIN THẦY

        System.out.println("Check thầy LUÔN đúng!!!");
        s1.setName("AHUHU, THẦY LUÔN ĐÚNG");
        x.showProfile(); // EM ÉO TIN THẦY
        s1.showProfile(); // AHUHU, THẦY LUÔN ĐÚNG
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE00097", "AN NGUYỄN", 1993, 3.1);
        // object/instance/ đủ info được đổ, nằm vùng nào đó trong HEAP
        // new trả về tọa độ vùng clone
        // cả nguyên dòng từ new... ; được xem là tọa độ/giá trị phức tạp
        // s1 là biến con trỏ, luưu tọa độ/địa chỉ vùng new
        // s1 còn là object, lưa tọa độ vùng clone
        // s1 còn là reference variable, tao chiếu tọa độ đến chỗ khác heng
        // BIẾN CON TRỎ/OBJECT/REFERENCE BẢN CHẤT LÀ CẦN TRỎ, CẦN LƯU 1 TỌA ĐỘ VÙNG NEW CLONE
        // VẬY KO AI CẤM MÌNH TRỎ VÙNG NEW MỚI
        s1 = new Student("SE00098", "BÌNH LÊ", 1994, 3.4);
        s1.showProfile();

        // Em muốn lấy lại vùng clone AN thì sao??? Vì bị mất dấu rồi!!!
        // s1 = new Student("SE00097", "AN NGUYỄN", 1993, 3.1); // AN này là AN khác trên heng

        /*
               LƯU Ý - SOURCE: Khi 1 object/vùng new clone ko có ai trỏ tới, mất con trỏ
               do con trỏ đang gán qua vùng new khác, thì ta mất dấu toọa độ, vùng new cũ
               Java: JVM có máy ảo Java chạy bên trong HĐH, giám sát vùng RAM viết bằng Java
               kiểm tra app có cà chớn k -> có giết app, cảnh báo gửi báo tử khi chơi try-catch
               ngoài ra giám sát vùng new có mồ côi nào ko, vùng ko con trỏ
               HEAP có object nào ko có con trỏ ko?
               Đây gọi là bộ phận giám sát của máy ảo Java -> gọi là GARBAGE COLLECTOR
               đảm nhiệm clear để available cho vùng new clone khác
               tương đương free(con trỏ C - free vùng malloc() calloc() -> đây cũng là cách tạo ra vùng nhớ HEAP bên C)
               việc clear RAM HEAP của Java sẽ diễn ra định kì, bao nhiêu giây, phút...
               tuy nhiên mình có thể gọi ngay luôn
         */
        System.gc();

        /*
            s1 li dị với AN chơi với BÌNH LÊ
            biến object thay chỗ trỏ/chiếu/đọa độ
            tao ần lắm tọa độ vùng new
            ví dụ:
            hiện tại sếp = CaSi SoTung...;
            sau đó   sếp = là "gã" trả lương, đánh giá KPI làm việc của miình
         */

        // Biến có quyền thay đổi value nó lưu trữ, vì thay đổi value nó mới là biến
        // variable - sự biến đổi, mày đang là 10 rồi mày thành 100
        Student s2 = new Student("SE00097", "ĐẠI GIA", 1994, 3.3);

    }

    // Kiiểm tra việc new trùng thông tin xem sao, điều gì sẽ xảy ra?
    public static void checkObjectV1() {
        Student s1 = new Student("SE00097", "AN NGUYỄN", 1993, 3.1);
        Student s2 = new Student("SE00097", "AN NGUYỄN", 1993, 3.1);

        s1.showProfile();
        s2.showProfile();
        s1.setName("DỖI RỒI, KHÔNG HỌC BÀI");
        // Chứng minh 2 `new` là 2 object khác nhau, 2 vùng clone khác nhau, cho dù độ info khác nhau
        // Ở ngoài đời: đi vào tiệm sách, tô tượng, chọn 2 tượng "giống nhau", nhưng vẫn là 2
        s2.showProfile(); // AN
        s1.showProfile(); // DỖI RỒI
        System.out.println("Check duplication if any???");
        System.out.println(s1); // Gọi thầm tên em -> DỖI
        System.out.println(s2);

    }

    public static void checkObject() {
        Student myStuent = new Student("SE00097", "KhanhNVM", 1993, 3.1);
        //      reference var           object, vùng RAM bự trong HEAP
        //      object var              instance, thể hiện, 1 hiện thân, 1 bức tượng được đúc ra
        //      "pointer" var
        myStuent.showProfile(); // myStudent đang nắm/lưu tọa độ RAM object trong HEAP
        Student oldStudent = myStuent;
        /*
            new ở đây làm cực kì nhiều việc
                - Clone Khuôn/Class(object và static)
                - Gọi phễu/constructor/init đổ data vào vùng clone
                - Chốt lại tọa độ/ địa vùng new vừa rồi đựa tạo ở RAM, đem tọa độ/địa chỉ đi gán biến con trỏ là myStudent
        */

        /*
            myStudent là biến, vậy nó có thể thay đổi value!!!!!!
            Sếp với bạn trẻ đang trỏ đến Casi là Sơn Tùng
            Sếp với người đi làm, trỏ đến đến ông/bà quyết định lương cho mình
            Nếu sếp tham chiếu người này người kia
         */

        myStuent = new Student("SE00099", "Tâm Lê", 1992, 2.9);
        System.out.println("My student now is Tâm Lê");
        myStuent.showProfile();

        /*
            Giải thích đoạn code vừa trên thì KhanhNVM ko còn ai trỏ đến, ko còn cách nào lấy lại được vùng RAM này
            Tọa độ new thì cũ ta ko giữ lại
            Biến object là tay cầm con diều, new chính là con diều
            Khi tay cầm nối dây với con diều mới, con diều cũ mất, ko còn chơi được nữa, bị đứt dây rồi, bay mất
            1 vùng ram new Object mà ko còn ai trỏ tới, JVM có 1 chương trình ngầm gọi là
            Cty Môi trường đô thị, GARBAGE COLLECTOR, sẽ đi gom vùng new mồ côi ko con trỏ, để giải phóng RAM
            -> còn gọi là free RAM, free HEAP
            trả lại vùng ram trống cho xài cho new mới sau này
            Để vẫn giữ lại được KhanhNVM thì cần 1 biến giữ được địa chỉ/tọa độ trước đó của object KhanhNVM
         */

        // 2 con trỏ trỏ cùng 1 vùng 1 new, 2 chàng trỏ 1 nàng
        System.out.println("KhanhNVM after myStudent từ chối chơi"); // KhanhNVM vẫn là KhanhNVM thôi
        oldStudent.showProfile();

        /*
            VI DIỆU, VỀ SUY NGHĨ ĐIỀU GÌ SẼ DIỄN RA, HACK NÃO 1 TÍ
         */
        new Student("PS00099", "ĐẠI GIA", 1999, 3.9).showProfile();
    }
}
