package khanh.stage;

import khanh.data.Student;

import java.util.Arrays;

public class stage {
    public static  void main(String[] args) {
        sortPrimitives();
    }

    // primitive - biến đơn giá trị, 1 vùng ram 1 giá trị, KO CÓ BAO GIỜ CHẤM PRIMITIVE HENG
    // có value qua tên biến xài luôn, CHẤM LÀ ĂN ĐÒN NGHE CHƯA
    public static void playWithPrimitiveArray() {
        // double vol[365]; // ko cho phép ghi kích thưước mảng, số biến, số phần tử mảng lúc khai báo
        // double v[100] = {0, 5, 10, 15, 20, 25, 30}; // ko kích thước
        double[] v = {0, 5, 10, 15, 20, 25, 30}; // có 7 biến double primitive v[0] v[1] v[2] ... v[i]
        System.out.println("v[0]: " + v[0]);
        System.out.println("v[1]: " + v[1] + "| v[2]: " + v[2]);
        System.out.println("The array has value of");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        System.out.println("The array has values of (printed using for each)");
        for (double x : v) {
            // với mọi, mỗi x là số thực, x thuộc về tập hợp v, mà v nhiều biến/value khác
            // x có quyền bằng từng phần tử về giá trị
            // x = v[0], x = v[1], ... , x = v[i]
            // do đó sout(x) ~~~~~~~~ sout(v[i])
            System.out.println(x + "\t");
        }
    }

    public static void playWithPrimitiveArrayV2() {
//        float *arr = calloc(7, sizeof(float));
        double arr[] = new double[333]; // arr là con trỏ, trỏ vùng new chà bá lửa
        // vùng new này chuưa đến 365 float primitive
        // giá trị 365 biến này đều default là 0;
        // new ở đây tương đương calloc() bên C
        // new trả về góc tọa đồ, gồm cụm 365
        // nhưng nó ko chơi chấm để lấy biến 1 biến 2, xài [] như thường
        arr[0] = 6789;
        for (double x : arr) {
            /*
                Với mọi, với mỗi x là số thực, x thuộc tập hợp arr, arr nhiều biến/value, x có qyền bằng từng phần
                x = arr[0], x = [1], x = arr[2], .... x = arr[i]
                do đó ở đây sout(x) ~~~~ sout(v[i])
             */
            System.out.println("x: \t" + x);
        }

        /*
               N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...)
                    N[0] -> 0
                    N[1] -> 1
                    N[2] -> 2

              V x là số tự nhin e N, x là mấy, mang giá trị mấy????
                x có thể là bất kì ai, bất kì gi trị nào trong N
                x = 0, x = 1, x = 2
         */

        System.out.println("");
        System.out.println("The array has values of (using for [i] traditional");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        /*
            NGHE KĨ NÈ: tên mảng là biến má mì, tú ông tú bà, biến object, biến con trỏ, biến tham chiếu
            troỏ vào vùng bự chà bá qua cái new ngoặc[] chứa nhiều biến khác. Má mì quản lí nhiều chân dài/nhiều biến,
            như nhiều chân dài, trai ngành, má mì này quản lí 333 lính dưới quyền
            Vậy nếu hoỏi má mì có gì, tao có 333 đứa, vậy mámì.lenght trả về kích thước mảng
         */
        System.out.println("\nArray lenght: " + arr.length);
    }

    public static void playWithPrimitiveArrayV3() {
        // Kiểm tra la các kiến thức về mảng primitive
        int arr1[] = {5, 10, 15, 20, 25}; // Có 5 biến int  đã có luôn value
        // calloc() 5 biến int có luôn value

        int arr2[] = new int[]{5, 10, 15, 20, 25}; // tương đương lệnh ở trên
        int arr3[];
        arr3 = new int[5]; // Default hết cho tất cả biến int thứ [i]
        int arr[] = new int[5]; // chuẩn nhất
        // arr[0] khác hoàn toàn arr; arr[0] là 1 biến int như bình thường
        // arr là tên của mảng, là biến má mì, biến con trỏ, trỏ vùng new [] chà bá luôn
        // To hơn bên C vùng new, có hàm luôn () có biến đặc điểm luôn

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        // [3], [4] có giá trị là default, nhưng ko phải là rác như bên C, cũng có thể bên C có default
        // giá trị default ở đây nếu là số -> số 0, boolean thì là false
        System.out.println("The arr has values: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Hỏi `lenght` ở đây là static hay non-static?
        // -> `lenght` ở đây là non-static vì mỗi mảng có kích thước khác nhau, kích thước ăn theo từng mảng
        // biến mảng trỏ vùng new chà bá, tức bên trong là 1 đống biến primitive
        // + hàm + lenght
        // Đống biến này ko chơi kiểu get()/set() vì nó đồng nhất data type
        // cho sờ trục tiếp [i]
        // arr[0] arr[1] arr[2] thoải mái lấy dùng, thoải mái sửa
        // mảng là 1 đống biến đồng nhất data type
        // vùng new có hàm toString() convert toàn bộ value thành...

        System.out.println("\nThe arr has: " + arr); // Gọi thầm tên em, in ra địa chỉ, do toString() sẽ băm ra
        // arr[0]. chấm thế éo nào được vì là primitive, xài em đi......

        for (int x : arr) {
            // x = a[0], x = a[1]
            System.out.print(x + "\t");
        }
    }

    public static void sortPrimitives() {
        int a = 9, b = 5;
        // quy ước a đứng đâu danh sách, b đứng sau, khi in value, chắc chắn giảm dần
        System.out.println("a: " + a + " | b: " + b);
        // sort tăng dần từ trái sang, a đầu, b sau, lí thuyết thì a sẽ là 5, còn b là 9 mới đúng
        // a = 5 đúng, mà 5 lại nằm trong b
        // Tao lớn hơn mày, ko đúng chỗ, tao đổi mày, mày lại đổi cho tao
        // Thực tế tao cần nhỏ hơn mày (sort tăng dần)
        int t = a;  // giữ lại value của a 9 trước khi a bị mất, thay đổi
                    // backup a lại đã
                    // temporary, temp, tmp
        a = b;  // a = 5 đúng rồi, tao muốn lấy giá trị nhỏ của mày
                // a mất ngay giá trị cũ, tại 1 điểm biến chỉ có 1 kiểu ON/OFF thôi | chỉ 1 value thôi
        b = t;  // b = giá trị cũ cảu a mới đúng, tức là giá trị là 9 trước đó của a, đang nằm trong t
        System.out.println("a: " + a + " | b: " + b);

    }

    public static void sortObjectArray() {
        Student[] students = new Student[3]; // 50 biến sinh viên, chưa có ai cụ thể
        // Có 3 biến sv, + biến má mì
        students[0] = new Student("SE123456", "AN NGUYỄN", 1999, 3.9);
        students[1] = new Student("SE123457", "BÌNH LÊ", 1998, 3.5);
        students[2] = new Student("SE123458", "CƯỜNG VÕ", 2000, 3.7);

        System.out.println("The student list before sorting");
//        for (int i = 0; i < students.length; i++) {
//            students[i].showProfile();
//            System.out.println(students[i]); // Gọi thầm tên em | này bên C là in địa chỉ đấy
//        }

        for (Student x : students) {
            // Với mọi, x sẽ bằng value của từng phần tử, [0], [1], ... [i]
            // -> x = students[0]; x = students[1]; x = students[2], ... x = students[i]
            // tao sẽ chơi với, quét, rà qua, duyệt qua từng đứa 1 trong mảng
            x.showProfile();
        }

        // Nếu mảng tăng dần về điểm, thì [0] đang trỏ sai, lẽ ra nó phải trỏ
        // [0] mày đang có value sai, lẽ ra mày phải trỏ vùng điểm có 3.5 mới đúng
        // Vậy mảng Object trỏ sai data, nó phải trỏ lại cho đúng data
        // -> sắp xếp mảng object, dựa trên việc trỏ đúng data hay ko
        // -> vậy data trong vùng object sẽ quyết định việc trỏ
        // -> SẮP XẾP MẢNG OBJECT CHẲNG QUA LÀ ĐỔI CHỖ TRỎ, VỊ TRÍ TRỎ, VALUE CON TRỎ
    }


    public static void playWithObjectArray() {
        // lưu 50 con số dãy fibo, chẵn
        // Cần 50 biến/tên tắt, sau đó = 50 value đơn, xong, tên biến là value luôn

        int v1 = 68, v2, v3, v4, v5, v6, v7; // ...

        int[] v = new int[50];
        v[0] = 2;
        v[1] = 4;
        v[2] = 6;

        // v[0] chấm cái đầu mày, tao đường đường là primitive value, lấy value qua tên tao
        // xài tao giá trị là 2 đó

        // v.length; // tao là tên mảng, tao cai quản nhiều biến, hỏi tao cai quản bao nhiêu biến

        // Lưu 50 sinh viên của lớp này
        // Cần 50 biến, tên tắt, sau đó = 50 nhát new Phễu () tương ứng
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14; // LẺ
        // 50 nhát new() để lưu hồ sơ sinh viên, gán value
        // Mảng cho ngon thì:
        Student[] students = new Student[50]; // 50 biến sinh viên, chưa có ai cụ thể
        students[0] = new Student("SE0123456", "AN NGUYỄN", 1999, 3.9);
        students[1] = new Student("SE123457", "BÌNH LÊ", 1998, 3.5);
        students[2] = new Student("SE123458", "CƯỜNG VÕ", 2000, 3.7);
        // s[0]    // Có xổ gì ko? Có chứ tớ l con trỏ sinh sinh viên mà, chấm ra public sinh viên
        // s       // Có xổ gì ko? Có tao là biến má mì, chấm ra length
        // s[0] = null;
        System.out.println("The list of students: ");
        System.out.println("The number elements have in students: " + students.length);
        for (int i = 0; i < 3; i++) {
            students[i].showProfile();
        }   // Con trỏ null cho các biến còn lại, tức l trỏ đáy RAM
        // đáy RAM chỉ 00000000 (byte null) in ra NullPointerException
        // Khi chơi với mảng object, phải nhớ ko được for hết mảng
        // Vì phần chưa gán của biến object sẽ trỏ null, Exception
        // Chỉ for đến count, tức là chỗ đã gán new ...
        s1 = null;  // trỏ đáy ram cho tao
        // gán tọa độ địa chỉ 0 vào s1
        s1.showProfile();
    }

    public static void playWithAStudent() {
        Student x; // Biến object
        // x.showProfile();

        x = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        // value phức tạp
        x.showProfile();
        // primitive ko chấm được, = value thì xài luôn
        // biến object             = value kiểu new (), chấm để xài
    }
}
