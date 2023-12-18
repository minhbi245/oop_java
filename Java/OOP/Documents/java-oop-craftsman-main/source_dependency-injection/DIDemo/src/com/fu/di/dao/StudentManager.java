package com.fu.di.dao;

import com.fu.di.dto.Student;
import com.fu.di.util.Filter;
import java.util.*;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg 
 * version 21.06
 */

public class StudentManager {

    private List<Student> stuList = new ArrayList();

    //giả bộ có danh sách SV từ DB, làm constructor, set(đưa vào)
    //floating block of code
    {
        stuList.add(new Student("SE999999", "CHÍN NGUYỄN", 1999, 9.0, "SE"));
        stuList.add(new Student("SE888888", "TÁM LÊ", 1998, 8.0, "SE"));
        stuList.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.0, "SE"));
        stuList.add(new Student("IA555555", "NĂM LÝ", 2005, 5.0, "IA"));
        stuList.add(new Student("IA333333", "BA MAI", 2003, 3.0, "IA"));
        stuList.add(new Student("GD777777", "BẢY VÕ", 1997, 7.0, "GD"));
        stuList.add(new Student("GD666666", "LỤC TRẦN", 2006, 6.0, "GD"));
        stuList.add(new Student("SS222222", "HAI VŨ", 2002, 2.0, "IB"));
    }

    //Hàm query data, filter data theo tiêu chuẩn/condition nào đó
    //1. Show tất cả data  SQL: select * from Student
    public List<Student> getAll() {
        return stuList;
    }

    //2. In ra/trả về danh sách sinh viên ngành SE  SQL: where major = 'SE'
    public List<Student> getSEStudents() {
        List<Student> result = new ArrayList();

        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getMajor().equalsIgnoreCase("SE")) {
                result.add(stuList.get(i));
            }
        }

        return result;
    }

    public List<Student> getSEStudentsGt5() {
        List<Student> result = new ArrayList();
        //alt-shift-f
        for (int i = 0; i < stuList.size(); i++) {
            Student x = stuList.get(i);
            if (x.getMajor().equalsIgnoreCase("SE") && x.getGpa() >= 5) {
                result.add(x);
            }
        }

        return result;
    }
    
    //2.1 TỐI ƯU HƠN: ÍT HÀM VẪN FILTER ĐƯỢC NHIỀU
    //dễ để làm, NHƯNG...
    
    //quy ước
    //1. lấy tất cả sv; 2: lấy sv ngành SE; 3: lấy sv SE >= 5; 4: lấy sv SE cao nhất...
    //filterType chính là cái flag để hàm biết phải làm gì
    //trong code sure switch-case với các tình huống filter
    //1, 2, 3, 4, 5... hok đẹp, thay bằng ENUM (DROP-DOWN LIST, COMBO-BOX)
    public List<Student> getStudents(int filterType) {
        
        List<Student> result = new ArrayList();
        
        switch (filterType) {
            case 1:
                result = stuList;  //lấy hết SV
                break;   
                
            case 2:  //lấy SV ngành SE
                for (Student x : stuList) 
                    if (x.getMajor().equalsIgnoreCase("SE"))
                        result.add(x);
                break; 
                
            case 3: //lấy SV ngành IA
                for (Student x : stuList) 
                    if (x.getMajor().equalsIgnoreCase("IA"))
                        result.add(x);
                break;  
                
            default: 
                System.out.println("Please choose the filter type from 1..3");
        }
        
        return result;
    }

    //tui cần lắm bạn đưa cho tui hàm if qua object tên là cond
    //cond.check() sẽ trả về đúng sai, if () trong check() sẽ trả về
    //đúng sai, tui đưa từng sv cho bạn check()
    //lúc nào xài hàm của tui, độ ra cái check() có if bên trong đi
    //lỏng lẻo, tao để mày làm if loose coupling - low coupling
    //vẫn cần mày, vì tao có data, giúp mày theo cách mày muốn
    //Dependency, đưa vào hàm qua tham số Injection
    //StreamAPI
    
    public List<Student> getStudents(Filter<Student> cond) {
        List<Student> result = new ArrayList();
        for (Student x : stuList) 
            if (cond.check(x))  //đúng là sv mày cần theo 
                                        //cái check, cái if của mày hay ko
                                        //đúng thì báo tao
                result.add(x);
        
        return result;   //đúng cho n loại if chấp, ko cần dự đoán if
    }                    //select * from Student WHERE ???? check() tự viết
    //chính thức vào DI
//    public List<Student> getStudents(??? obj) {
//        for (từng phần tử của ArrayList lấy đc một sv, x)
//           obj.check giùm tao bạn sv x này thỏa đk mày hay ko
//                  có -> lấy bạn x này bỏ vào WishList
//                  ko thỏa thì hoy
//        //obj chính nó phải có lệnh if, đẩy if hàm mình thành if bên
//        //ngoài đưa vào, dependency đã đc chích vào/inject      
//        //mày đưa cách mày nhìn dữ liệu vào cho tao, tao xử lí theo cách
//        //của mày, gọi if của mày, hàm của mày, hàm trong obj đưa vào
//        //if viết chỗ khác, viết ở object khác, class khác 
//        //tức là chơi với DI, mình phải tạo ít nhất 1 class khác chứa
//        //if chứa dependency, ràng buộc, filter, bộ lọc, cách bạn
//        //mún xử lí info                  
//        //class ??? này viết ntn? if để trong hàm nào, nhiều if thì sao
//        //if trong bao nhiêu hàm thì đủ????  
//        //ko thể mỗi if một hàm, nếu thế thì hàm getStudents() lại phải
//        //tùy từng query type, mà phải chọn if tương ứng -> lặp lại
//        //đúng vấn đề
//        //CHỐT HẠ: OBJECT ĐƯA VÀO CHỈ 1 HÀM IF
//        for (với mỗi sv x tìm thấy trong danh sách đang có)
//           if obj.check(x) là đúng tiêu chuẩn thì
//                  add x vào WishList
//           ko đúng tiêu chuẩn, move next                  
//        
//        //check() là hàm có if, đúng, nhưng bao nhiêu if trong check()
//        //hóa ra bao nhiêu if ta lại viết trong check(), vớ vẩn tập 2           
//        //check() ko có code, ai mún viết thế nào thì viết như thế theo
//        //nhu cầu riêng, check() ko viết if luôn
//        //lúc nào ai đó thực sự mún filter, viết if cho check() ko muộn
//        //lúc đó viết code cho check() implement một abstract method
//        //mùi của Interface/Abstract class xuất hiện
//        //hóa ra thay vì em phụ thuộc vào 1 cái gì cụ thể - có code 
//        //ta phụ thuộc vào 1 cái chung chung, ko chi tiết, abstract, interface           
//        //LOOSE COUPLING 
//        //High Cohesion Low Coupling SOLID          
//    }
    
    //3. In ra/trả về ds sv ngành SE, điểm tb >= 5
    //4. In ra/trả về ds sv ngành SE, điểm tb < 5
    //5. In ra/trả về ds sv ngành SE có điểm cao nhất (thủ khoa CN)
    //6. In ra/trả về ds sv ngành SE, điểm tb >= 8
    //7. In ra/trả về ds sv điểm cao nhất (tìm thủ khoa toàn trường)
    //8. ... ngành khác
    //9. SE + IA + GD
    //10. Khối ngành kte gồm ngành con, câu hỏi ...
}


//BÌNH LUẬN KHI VIẾT CÁC HÀM ỨNG VỚI CÁC CÂU QUERY
//1. Dễ viết, cần query thế nào thì thêm hàm tương ứng, với filter/dep.
//   tương ứng gài trong hàm
//2. Nhược điểm: nhiều hàm, quá nhiều hàm, và tương lai còn thêm nữa
//   theo nhu cầu thống kê

//   2.1. Thiết kế tốt hơn chút, ít hàm hơn đc ko??? mà vẫn nhiều filter
//        gộp nhiều filter trong 1 hàm

//        Ưu: dễ viết như cách 1, gom toàn bộ các hàm vào 1 hàm
//        
//        Nhược: vẫn ko dự đoán hết đc các CASES, các trường hợp mún
//        filter là vô chừng, theo cách người xài hàm này người ta mún xài

//3. LẬT NGƯỢC VẤN ĐỀ: TẠI SAO MÌNH/HÀM NÀY LẠI PHẢI DỰ ĐOÁN HẾT
//   NHU CẦU FILTER CỦA NGƯỜI TA??? - VÔ CHỪNG FILTER
//   TAO - MANAGER CÓ DATA, NHƯNG KO CÓ FILTER
//   MÀY - NGƯỜI XÀI HÀM, MÀY CÓ FILTER - VÔ CHỪNG
//   MÀY MUỐN GÌ, CỤ THỂ LÀ GÌ, MÀY CỨ CHUẨN BỊ LUÔN, ĐƯA VÀO CHO 
//   TAO, TAO CĂN THEO CÁI MÀY MUỐN, LẤY RA STUDENT TƯƠNG ỨNG THEO
//   THEO TIÊU CHÍ CỦA MÀY...
//   MÀY MÚN IF THẾ NÀO, MÀY LÀM LUÔN ĐI, TAO KO DỰ ĐOÁN NỮA
//   BẠN ĐƯA CÁI BẠN MUỐN VÀO TRONG MANAGER CỦA TỚ, TỚ LÔI TỪNG 
//   SV XÉT THEO TIÊU CHÍ CỦA BẠN, TỚ RETURN 

//   HIỆN NAY: TỚ DỰ ĐOÁN LUÔN TIÊU CHÍ CỦA BẠN, TỰ KIỂM TRA IF CÓ THỎA
//   KO, TỚ BỊ RƯỢT, LÂU LÂU BỔ SUNG THÊM HÀM THEO NHIỀU NHU CẦU KHÁC NHAU

//if nằm ở đầu vào của hàm
//ta tui chỉ gọi if để biết rằng SV của ta thỏa if đưa vào ko, thỏa trả
//ko đi tiếp sv khác
//CHỐT HẠ: IF ĐƯA TỪ BÊN NGOÀI VÀO, KO PHẢI LÀ INT ĐƯA VÀO ĐỂ TA TỰ LO
//IF ĐƯA BÊN NGOÀI VÀO, CODE ĐƯA BÊN NGOÀI VÀO 
//bên ngoài đưa tiêu chí xét duyệt vào bên trong, ta, hàm ta theo 
//tiêu chí bên ngoài đưa vào???

//HÀM EM CHUẨN BỊ DATA VÀ XÉT DUYỆT THEO BÊN NGOÀI
//ĐƯA IF BÊN NGOÀI VÀO??? LÀM SAO???, ĐƯA OBJECT, ĐƯA ĐỐI TƯỢNG VÀO
//SỜ IF QUA CHẤM CỦA ĐỐI TƯỢNG


