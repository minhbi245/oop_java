package didemo;

import com.fu.didemo.dao.FilterBySE;
import com.fu.didemo.dao.StudentManager;
import com.fu.didemo.dto.Student;
import com.fu.didemo.util.Filter;
import java.util.*;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg 
 * version 21.06
 */

public class DIDemo {

    public static void main(String[] args) {
        
        //testGetStudentsBySeparatedMethods();
        //testGetStudentsByFilterType();
        //testGetStudentsByUsingDIAndConcreteClass();
        //testGetStudentsByUsingDIAndAnonymousClass();
        //testGetStudentsByUsingDIAndLambdaExpression();
        testGetStudentsByUsingDIAndLambdaExpressionV2();
        testInterface();
    }
    
    public static void testGetStudentsByUsingDIAndLambdaExpressionV2() {
        
        //Filter<Student> filterByIA = x -> x.getMajor().equalsIgnoreCase("IA"); //OK
        
        //Sử dụng kết quả filter
        StudentManager sm = new StudentManager();

//        List<Student> result = sm.getStudents(x -> {return x.getMajor().equalsIgnoreCase("IA") 
//                                                      && x.getGpa() < 5;
//                                                   });  //MÀY ĐƯA OBJECT NHƯNG TAO CẦN HÀM
//        
        List<Student> result = sm.getStudents(x -> x.getMajor().equalsIgnoreCase("IA") 
                                                      && x.getGpa() < 5
                                                   );  //MÀY ĐƯA OBJECT NHƯNG TAO CẦN HÀM
        

        System.out.println("The list of SE Students");
        for (Student x : result) {
            x.showProfile();     //1 SE CHÍN 
        }
    }

    public static void testGetStudentsByUsingDIAndLambdaExpression() {

        //chuẩn bị object Filter đưa vào hàm
        //Filter<Student> filterByIA = new Class Rời if IA; viết sẵn
        //Filter<Student> filterByIA = new Filter() {.....code @Overide viết sẵn IA};
        
        //Filter<Student> filterByIA = (Student x) -> {return true;};
        //Filter<Student> filterByIA = (Student x) -> {return x.getMajor().equalsIgnoreCase("IA");}; //OK
        //Filter<Student> filterByIA = x -> {return x.getMajor().equalsIgnoreCase("IA");}; //OK
        
        Filter<Student> filterByIA = x -> x.getMajor().equalsIgnoreCase("IA"); //OK
        
        //kết quả sử dụng
        StudentManager sm = new StudentManager();

        List<Student> result = sm.getStudents(filterByIA);
        System.out.println("The list of SE Students");
        for (Student x : result) {
            x.showProfile();     //1 SE CHÍN 
        }
    }

    public static void testInterface() {
        
        //new Student("A", "B", 0, 0, "C").showProfile();
        
        List<Student> list = new StudentManager().getAllStudents();
        
//        Comparator<Student> can = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                
////                if (o1.getGpa() > o2.getGpa())
////                    return 1;  //tao lớn hơn mày heng
////                else if (o1.getGpa() == o2.getGpa())
////                    return 0;
////                return -1;
//                        
//                return Double.compare(o1.getGpa(), o2.getGpa());
//            }
//        };
        
        Comparator<Student> can = (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa());
        
        
        Collections.sort(list, can);
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : list) 
            x.showProfile();
        
                                    //DI, đưa vào cái cân 2 sv cho tao
                                    //tao hàm sort() mới biết cách ss 2 sv 
                                    //theo cách của mày, vô chừng cách
                                    //chích cách của mày vào, sao tao biết
                                    //gọi hàm gì của mày, tao thống nhất
                                    //tao với mày chơi qua Inteface có sẵn hàm
                                    //Interface chuyên đi cân 2 sv, Comparator
                                    //Bộ TC Cân, có hàm check(2 sv) lớn bé
                                    //                  compare(o1, o2) -> lớn bé bằng
                                    //việc đổi chỗ là việc của tao, chỉ cần cách đổi
                                    //chích cách đổi bên ngoài đưa vào
                                    // ua hàm compare(sv1, sv2) của FI Comparator
                                    //chỉ có 1 hàm compare() - LAMBDA EXPRESSION, ANO
    }

    public static void testGetStudentsByUsingDIAndAnonymousClass() {
        //hàm .getStudents() chỉ cần object chứa hàm check() có code
        //                       true/false để nó add vào wish-list và return sau cùng
        //ta focus vào việc làm hàm check() thay vì chú ý vào tên class rời chứa hàm
        //đây là ý tưởng của class vô danh - Anonymous Class - hok thèm đặt tên class
        //như truyền thống
        //Filter<Student> filterBySEGt8 = new class Rời có sẵn hàm check() đã viết sẵn
        Filter<Student> filterBySEGt8 = new Filter<Student>() {
            @Override
            public boolean check(Student x) {
                return x.getMajor().equalsIgnoreCase("SE") && x.getGpa() >= 8;
            }
        };
        //VIP giống như Filter x = new FilterBYX();

        StudentManager sm = new StudentManager();

        List<Student> result = sm.getStudents(filterBySEGt8);
        System.out.println("The list of SE Students");
        for (Student x : result) {
            x.showProfile();     //1 SE CHÍN 
        }

    }

    public static void testGetStudentsByUsingDIAndConcreteClass() {
        StudentManager sm = new StudentManager();

        //filter như thế nào nếu là object của Interface éo có code
        //viết code ở đâu đó, hàm check() á
        //if phải viết trong check() nhưng ở đâu đó
        //có 3 cách:
        //1. Tạo class rời
        //2. Anonymous
        //3. Lamda expression  nếu Interface là Functional Interface, duy nhất
        //                     1 hàm abstract
        //FilterBySE filterSE = new FilterBySE();
        Filter<Student> filterBySE = new FilterBySE();

        List<Student> result = sm.getStudents(filterBySE); //DI tao chích mày if
        //  cảnh giới cao, ko tạo class rời
        //  mà if ngay tại lúc xài hàm .getStudents()
        //  ON THE GO, LÚC XÀI HÀM, MỚI VIẾT IF 
        System.out.println("The list of SE Students");
        for (Student x : result) {
            x.showProfile();     //3 SE 
        }
    }
    //Khai Cha new Con
    //Khai Con new Con
    //Cha abstract thì Khai Cha new Cha -> Anonymous Class

    public static void testGetStudentsByFilterType() {
        StudentManager sm = new StudentManager();
        System.out.println("The list of SE students (3)");
        for (Student x : sm.getStudents(1)) {
            x.showProfile();
        }
    }

    public static void testGetStudentsBySeparatedMethods() {
        StudentManager sm = new StudentManager();
        System.out.println("The list of SE students (3)");
        for (Student x : sm.getSEStudents()) 
            x.showProfile();
        

        System.out.println("The list of SE students by GPA >= 8 (1)");
        for (Student x : sm.getSEStudentsGt8()) 
            x.showProfile();
        
    }

    //test pointer in Java
    public static void testPointer() {
        Student list[] = {
            new Student("SE999999", "CHÍN NGUYỄN", 2009, 9.0, "SE"),
            new Student("SE666666", "LỤC TRẦN", 2006, 6.0, "SE")
        };

        Student a[] = new Student[6];
        a[0] = new Student("SE999999", "CHÍN NGUYỄN", 2009, 9.0, "SE");
        a[1] = new Student("SE666666", "LỤC TRẦN", 2006, 6.0, "SE");
        //5 phần tử 5 con trỏ, 2 đc gán, 3 con trỏ còn lại chưa trỏ ai, chưa trỏ
        //object nào cả

//        for (Student x : a) 
//            x.showProfile();
        
        for (int i = 0; i < 6; i++) 
            a[i].showProfile();
        

    }

    //xem thử get() set() đúng ko ta có thể JUnit
    public static void testStudent() {
        Student s = new Student("SE123456", "AN NGUYỄN", 2001, 5.6, "SE");
        s.showProfile();
    }

}
