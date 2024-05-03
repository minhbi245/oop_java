package basicarray;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitiveArrayV3();
        //playWithAnObject();
        //playWithObjectArray();
        //playWithObjectArrayV2();
        sortPrimitiveArrayV2();
        ////sortObjectArray();
        sortObjectArrayV2();
    }

    public static void sortObjectArrayV2() {

        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 10.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 10.0);

        System.out.println("The student list before sorting");
        for (Student x : arr) {
            System.out.println(x);
        }
        //SẮP XẾP MẢNG OBJECT - mảng của các biến object mà trỏ vào object
        //chẳng qua là đổi vị trí trỏ, thay đổi value/tọa độ vùng object
        //mà đang đc lưu trong các biến con trỏ
        //đổi cách trỏ của từng biến mảng. Chơi biến trung gian  
        //khi nào thì đổi, nhắm mắt đổi là sai
        //GIẢ BỘ SẮP TĂNG DẦN CỦA ĐIỂM TRUNG BÌNH
        //nếu thứ tự trỏ vùng new đã đúng thứ tự điểm, để im
        //nếu điểm của arr[0] đang trỏ  > điểm của arr[1] đang trỏ thì mới đổi 
        
        //CHỐT HẠ: CẤM TUYỆT ĐỐI XÀI > >= < <= == != CHO VIỆC SO SÁNH 2 BIẾN 
        //OBJECT, VÌ TOÁN TỬ SO SÁNH TRUYỀN THỐNG CHỈ DÀNH CHO PRIMITIVE
        //int a = 5, b = 10;  if (a > b) vì 2 giá trị, so sánh đc 
        //arr[0] [1] bản chất trong ram nó là tọa độ, là con số luôn, hàm ý
        //địa chỉ vùng ram,
        //ĐI SO SÁNH 2 BIẾN object arr[0] [1] tương đương so sánh tọa độ, số nhà
        //nhà tao số nhà 500 đg QT, GV
        //nhà mày số nhà 2      LL, Q1
        //số nhà tao to hơn 250 lần số nhà mày, vô nghĩa vãi
        //hãy so sánh giùm tui 2 sv An và Bình
        //sv1:                        sv2 vô nghĩa vì lúc thắng lúc thua theo
        //data bên trong 
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student t = arr[0];
            arr[0] = arr[1];
            arr[1] = t;
        }

        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void sortPrimitiveArrayV2() {
        int a = 10, b = 10;
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        //nếu có trục trặc thứ tự thì mới đổi
        //trong sắp xếp tăng dần, thì thằng trước PHẢI bé hơn thằng sau
        //nếu đứng trước mà lớn hơn đứng sau, 9  5  |   8  |  4,
        //SURE PHẢI ĐỔI VALUE, HOÁN ĐỔI
        //chỉ hoán đổi khi có trục trặc, thằng trước LỚN HƠN thằng sau
        //if thằng trước > thằng sau, đổi ngay và luôn
        if (a > b) {  //do ta quy ước a trước b
            int t = a;
            a = b;
            b = t;
        }

        System.out.println("Before sorting: a: " + a + " | b: " + b);
    }

    public static void sortObjectArray() {

        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 4.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 8.0);

        System.out.println("The student list before sorting");
        for (Student x : arr) {
            System.out.println(x);
        }
        Student t = arr[0];  //arr[0] cho tao tọa độ bạn AN 9, TRỎ CÙNG, BACKUP
        arr[0] = arr[1];  //[1] đang trỏ BÌNH 5.0, ngồi sau trỏ nhỏ
        //đưa nhỏ cho [0]
        arr[1] = t;    //trỏ vào AN 9
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void sortPrimitiveArray() {
        int a = 9, b = 5;
        //quy ước a đứng trước b khi in ra kết quả
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        //tui mún in giá trị a b tăng dần
        //đổi giá trị cho nhau, là xong
//        a = b;  //a lấy giá trị b, đang 5, do đó a đã 5
//        b = a;  //b lấy giá trị a, đang 5 luôn rồi (1 giá trị tại 1 tđiêm)
//                //đúng ra phải la b = a cũ xưa xưa, 9 đó
        //đúng chuẩn phải backup a trước khi a chơi với giá trị mới
        //biến trung gian, tờ giấy nháp ghi lại cái sắp bị quên 9 trong a
        int t = a;  //a 9 cất vào t   temporary, temp, tmp, t
        a = b;      //a lấy 5 của b
        b = t;       //b lấy a cũ đang trong t 9            
        System.out.println("Before sorting: a: " + a + " | b: " + b);
    }

    public static void playWithObjectArrayV2() {

        Student arr[] = new Student[2];

        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);
        //in mảng 

        System.out.println("The student list before sorting");
//        for (int i = 0; i < 2; i++) {
//            //arr[i].showProfile();
//            System.out.println(arr[i] + " "); //gọi thầm tên em
//        }

        for (Student x : arr) {
            //x = từng phần tử của mảng, tập hợp, vào từng phần tử lấy value
            //với mỗi, duyệt qua toàn bộ mảng
            //x = arr[0];  x = arr[1];  x = arr[i] cho tao cùng nhìn cái coi
            //arr[i].showP()  ~~~~ x.showP()
            //2 chàng 1 nàng 
            //x.showProfile();
            System.out.println(x);  //gọi thầm tên em
        }

        //tui mún in mảng tăng dần ascending về điểm, về lí BÌNH 5.0 |  AN 9.0
        //arr[0] đang trỏ sai, mày đầu mảng thì phải trỏ new BÌNH 5.0
        //arr[1] đang trỏ sai, đang trỏ 5.0 sai, nhì mảng, phải trỏ AN 9.0
        //cần hoán đổi việc trỏ
//        arr[0] trỏ BÌNH 5.0 ĐANG GIỮ BỞI ARR[1]
//        arr[1] ơi cho tao arr[0] xin vùng ram BÌNH 5.0 ĐI
        arr[0] = arr[1];  //trỏ BÌNH 5.0
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void playWithObjectArray() {
        //tui mún lưu hồ sơ 50 sv
        //tui cần chuẩn bị những gì? 2 thứ 
        //50 biến/tên tắt, 
        //50 value - 50 VÙNG NEW 
        //int a1, a2, a3, a4, a5, a6; //.. 50 số
        //a1 = 5; //value 5 

        //int arr[] = new int[50];  //50 biến heng, éo có, chưa có value nha
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13; //, ...
        //s1.showProfile();
        //s1 = new Student(id, name, a6, a6)

        //50 biến cái đã, mảng các biến SV
        Student s[] = new Student[3]; //13 biến sv, chưa có object thực, value
        //s[0], s[1], s[2] ~~~~~~
        //s1    s2     s3 ở khai báo lẻ

        s[0] = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        s[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.7);
        s[2] = new Student("SE123458", "CƯỜNG VÕ", 1999, 5.8);

        System.out.println("The student list");
//        s[0].showProfile();
//        s[1].showProfile();
//        s[2].showProfile();
        System.out.println("Cường lower "
                + s[2].getName().toUpperCase().toLowerCase());

        for (int i = 0; i < s.length; i++) {
            s[i].showProfile();
            //sv x.showP()
        }

        //BIẾN SV CÒN LẠI TỪ S[3]  .....S[12] GIÁ TRỊ DEFAULT GÌ???????
        //DEFAULT NULL HẠ CÁNH ĐÁY RAM 
        //NGUYÊN TẮC CHƠI VỚI MẢNG OBJECT CẤM TUYỆT ĐỐI FOR HẾT NẾU MẢNG CHƯA
        //GÁN FULL VÌ PHẦN CÒN LẠI TRỎ ĐÁY RAM MẶC ĐỊNH, ĐỊA CHỈ 0 MẶC ĐỊNH
        //PHẦN GÁN RỒI GÁN VÀO NEW CLONE THÌ CHẠY BT
        //MẢNG OBJECT BẮT BUỘC PHẢI FOR ĐẾN COUNT LÀ SỐ PHẦN TỬ ĐÃ GÁN
        //mảng pri default 0, boolean, value in bt 
        //đáy ram của [i].showP() có value gì mà show, toàn 0 hà
        //s.length chấm xổ ra gì
        //s[0]. xổ ra gì info SV, tao là biến object
        //s[0] = 100; tao là biến Student, tao cần vùng new
        //arr.length chấm xổ ra gì
        //arr[0] = 100 ;//chấm xổ ra gì        
    }

    public static void playWithAnObject() {
        //muốn lưu hồ sơ 1 sv, ta cần 2 thứ: biến, tên tắt, con trỏ, reference
        //                                   vùng new clone đổ phễu
        //muốn lưu 1 giá trị bt, ta cần 2 thứ: biến primitive
        //                                     value đơn 
        int a = 10;

        Student x;  //em với thầy cùng nói xấu đứa kia x đi 
        //đã là sv, thì chắc chắn showProfile() công dân thì phải có CCCD
        x = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);

        //hạ cánh nơi anh - cho con trỏ hạ cánh xuống 1 chỗ cực kì cool
        x = null;   //trỏ vùng mới, hạ cánh đáy của ram
        //gán địa chỉ 0, con số 0 vào trong biến con trỏ
        //biến con trỏ lưu tọa độ đáy ram, chứa toàn số 0, byte null
        //nhà đầu phố (số nhà 0) tối thui, 0 có gì
        //nhà null
        x.showProfile();

    }

    public static void playWithPrimitiveArrayV3() {
        int a = 10;
        //a chấm xổ cái đầu mày, a là 10 rõ ràng đòi gì nữa
        int a1 = 10, a2 = 100, a3, a4, a5, a6, a7, a8, a9, a11;  //LẺ
        //System.out.println(a3 + " ");

        int arr1[] = {5, 10, 15, 20, 25, 30};  //có nhiều biến chung arr
        //cụ thể là arr[0] [1]  [2]....           //implicit new

        int arr2[] = new int[]{5, 10, 15, 20, 25, 30}; //explicit new

        int[] arr3 = {5, 10, 15, 20, 25, 30};
        //đưa nhiều value thì phải có nhiều biến tương ứng
        //có nhiều biến lắm luôn và value tương ứng 
        int[] arr;  //arr là biến má mì, con trỏ, trỏ vùng new cực bự hơn C
        arr = new int[30];   //trỏ object chứa rất nhiều biến int khác

        System.out.println("The array arr has");
        arr[0] = 100;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int x : arr) {  //x = arr[0] tao xin value thằng đầu tiên
            //x = arr[1] tao xin value thằng kế, [i]
            System.out.print(x + " ");
        }
        //arr[0] chấm xổ ra gì??? cái đầu mày, pri xài luôn, chấm gì nó là 100

        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void playWithPrimitiveArrayV2() {
        //float a[] = {5, 10, 15};  //HEAP ĐÓ EM

        //cách 1: new ngầm số biến = số value đc gán ~~~~ float a[] = new float[3]
        //                                                    a[0] = 5; a[1] = 10; a[2] = 15;
        //float* array = calloc(10, sizeof(float));
        float a[] = new float[1000];  //new ngoặc vuông heng, éo phải tròn
        //new ngoặc tròn là new xài phễu, clone ram object
        //tao cần 365 biến float như bên C, nhưng 365 biến này nằm trên HEAP
        //CLONE 365 BIẾN FLOAT TRÊN HEAP
        System.out.println("The a array has: ");

        a[0] = 27_300_000;

        for (float x : a) {
            System.out.printf("%.1f ", x);
        }

        //mặc định gán 0 cho các biến trong mảng số...
        //VI DIỆU, IN THEO KIỂU TRUYỀN THỐNG: [i]
        System.out.println("\nThe a array has (using for i): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");

        //tên mảng là biến má mì, tú ông, tú bà, quản lí 1 đám chân dài chân ngắn
        //biến má mì quản lí rất nhiều biến khác
        //tên mảng là biến object bất chấp mảng primitive hay ko
        //tao quản lí, tao trỏ vùng ram HEAP chứa rất nhiều data qua việc new []
        //tao chấm đc, xổ gì tính sau
        //tao chấm đc, xổ ra .length là kích thước của mảng, số biến tao cho mày, mày xin
        //                           cấm thay đổi kích thước mảng - final
        //                          cho xem public, ko static, vì mỗi mảng kt khác nhau
        //
        //HỨA, a[]. . . HỨA, MẢNG OBJECT TUẦN SAU, HỌC BÀI HÔM NAY, TƯƠNG LAI NGÀY MAI
    }

    public static void playWithPrimitiveArray() {
        //double v[365]; //cấm tuyệt đối kích thước mảng khi khai báo
        //mảng trong J là mảng động ~~~~~ malloc() bên C, dùng HEAP để lưu value
        double v[] = {5, 10, 15, 20, 25};  //có 5 biến double trong ram
        //           v[0] v[1]  v[2]  v[3]  v[4]
        //với mọi x = ?    ?     ?     ?     ?
        v[0] = 1000;

        System.out.println(v[0]);

        System.out.println("The v array has values of");
        for (int i = 0; i < 5; i++) {
            System.out.print(v[i] + "\t");
        }

        System.out.println("");
        System.out.println("The v array has values of (using for each)");

        for (double x : v) {  //với mọi x thuộc tập v
            //rõ ràng v chứa nhiều value, x = từng value
            //x = v[0], x = v[1], x = v[2]
            System.out.print(x + " ");
        }

    }

}
