package didemo;

import com.fu.di.dao.FilterBySE;
import com.fu.di.dao.StudentManager;
import com.fu.di.dto.Student;
import com.fu.di.util.Filter;
import java.util.List;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg 
 * version 21.06
 */

public class DIDemo {

    public static void main(String[] args) {
        //saveAStudent();
        //testStudentManager();
        //testStudentManagerUsingSimpleFilter();
        //testGetStudentsBySE();
        //testGetStudentsBySEGt5UsingAnonymous();
        testGetStudentsBySELt5UsingAnonymous();
    }
    
    public static void testGetStudentsBySELt5UsingAnonymous() {
        StudentManager sm = new StudentManager();
        //Lambda xuất hiện, rút gọn tên hàm, tên class
        //                         anonymous method name
        //                         hàm vô danh của class vô danh thuộc về interface         
        //Filter<Student> se = new...;   //có code cho hàm check()
//        Filter<Student> se = x -> {return x.getMajor().equalsIgnoreCase("SE") 
//                                      && x.getGpa() < 5; };

//Filter<Student> se = x -> {if (x.getMajor().equalsIgnoreCase("SE") 
//                                      && x.getGpa() < 5) 
//                              return true;
//                           return false;};

//        Filter<Student> se = x -> x.getMajor().equalsIgnoreCase("SE") 
//                                      && x.getGpa() < 5;
//        
        List<Student> list = sm.getStudents(x -> x.getMajor().equalsIgnoreCase("SE") 
                                      && x.getGpa() < 5);
        for (Student x : list) 
            x.showProfile(); 
        //Collections.sort(list, (o1, o2) -> {});
    }
    //cách tạo class FilterSE rời rạc, làm riêng đủ hay, nhưng hơi tốn kém
    //tạo class dùng ko nhiều lần, vậy lược bớt thao tác tạo class
    //mục đích cuối cùng: cần code if của hàm check()
    //vì chỉ cần object.check() là đủ 
    //2 giải pháp: Anonymous class, class ngầm hiểu, ko cần tên gì cả
    //             mượn gió bẻ măng, mượn Interface new luôn
    //                            bung rộng gõ code @Override
    
    //FUNCTIONAL PROGRAMMING - HÀM LÀ THAM SỐ
    //            lược bỏ luôn tên class, tên hàm, chỉ cần focus vào
    //code trong hàm là đủ, câu if là đủ
    //hàm getStudents(chỉ cần đưa vào hàm là đủ)
    //                Filter<Student> cond)
    //                                ko cần tạo object, có tạo xong
    //                                tao chỉ .check()
    //                                            tao cần if
    //                  rút gọn tối đa phần dư, focus hàm xử lí
    //                  giống biểu thức, công thức, Lambda Expression
    //Collections.sort(list, việc so sánh 2 object)
    //                         DI, hàm compare(o1, o2) hoy 
    //                             Comparator Functional Interface
    
    public static void testGetStudentsBySEGt5UsingAnonymous() {
        StudentManager sm = new StudentManager();
        Filter<Student> seFilter =  x -> {
            if (x.getGpa() >= 5 && x.getMajor().equalsIgnoreCase("SE"))
                return true;
            return false;
        };
        System.out.println("The list of SE students with gpa >= 5");
        List<Student> list = sm.getStudents(seFilter);
        for (Student x : list) 
            x.showProfile(); 
    }
    
    
    public static void testGetStudentsBySE() {
        StudentManager sm = new StudentManager();
        FilterBySE seFilter = new FilterBySE();
        //seFilter.check(x);  //có code rồi đó
        //chích phụ thuộc vào nè
        System.out.println("The list of SE students");
        List<Student> list = sm.getStudents(seFilter);
        for (Student x : list) 
            x.showProfile();        
    }
    
    public static void testStudentManagerUsingSimpleFilter() {
        StudentManager sm = new StudentManager();
        
        System.out.println("The list of avalable students (8)");
        for (Student x : sm.getStudents(1)) 
            x.showProfile();
        
        System.out.println("The list of avalable SE students (3)");
        for (Student x : sm.getStudents(2)) 
            x.showProfile();
        
        System.out.println("The list of avalable SE students (2)");
        for (Student x : sm.getStudents(3)) 
            x.showProfile();
    }
    
    //có thể xài JUnit/Unit Testing vào
    public static void testStudentManager() {
        StudentManager sm = new StudentManager();
        System.out.println("The list of avalable students");
        for (Student x : sm.getAll()) 
            x.showProfile();
        
        System.out.println("The list of SE students (3)");
        for (Student x : sm.getSEStudents()) 
            x.showProfile();
        
        System.out.println("The list of SE students gpa >= 5 (2)");
        for (Student x : sm.getSEStudentsGt5()) 
            x.showProfile();
    }
    
    public static void saveAStudent() {
        Student x = new Student("SE666868", "LỘC PHÁT", 2001, 6.8, "SE");
        x.showProfile();
    }
    
    
    
}

//SELECT * FROM STUDENT WHERE ???
//                            ràng buộc trên dữ liệu
//                            phụ thuộc trên tập dữ liệu 
//                            dependency/filter/condition/
//                            tui mún đưa cho câu lệnh select 1 ràng buộc la
//                            chỉ lấy ra sv ngành SE
//                            bạn đưa ràng buộc tớ trả về kết quả
//                            inject một cái dependency/loại filter
//CHỈ 1 LỆNH, TƯƠNG THÍCH N THỨ AI ĐÓ MUỐN 
//LỎNG LẺO, MỞ VỚI TẤT CẢ, NHƯNG CẦN HỌ, PHỤ THUỘC MÀ LỎNG
//LOOSE COUPLING
//
