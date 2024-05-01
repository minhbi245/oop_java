package com.fu.didemo.dao;

import com.fu.didemo.dto.Student;
import com.fu.didemo.util.Filter;
import java.util.*;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

//class này sẽ chứa tập hợp các dữ liệu - list of students
//khi đó có các hàm xử lí trên đám data này, 
//ta sẽ filter danh sách này theo các đk khác nhau
public class StudentManager {

    private ArrayList<Student> list = new ArrayList();

    //cần load data từ db lên, sau đó phần còn lại ta chỉ làm trên list
    {
        list.add(new Student("SE999999", "CHÍN NGUYỄN", 2009, 9.0, "SE"));
        list.add(new Student("SE666666", "LỤC TRẦN", 2006, 6.0, "SE"));
        list.add(new Student("SE555555", "NĂM LÊ", 2005, 5.0, "SE"));

        list.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.0, "IA"));
        list.add(new Student("SE777777", "BẢY LÍ", 2007, 7.0, "IA"));
        list.add(new Student("SE888888", "TÁM ĐÀO", 2008, 8.0, "IA"));

        list.add(new Student("SE222222", "HAI VÕ", 2002, 2.0, "GD"));
        list.add(new Student("SE333333", "BÁC BA PHI", 2003, 3.0, "GD"));
    }

    public List<Student> getAllStudents() {
        return list;
    }

    //Solution trả lời cho những câu query này là: 2 cách
    //Cách 1: dễ làm nhất, dễ hiểu nhất, thiếu tính linh hoạt mở rộng
    //Mỗi query là 1 hàm
    //1. In danh sách sv SE
    public List<Student> getSEStudents() {
        List<Student> result = new ArrayList();
        for (Student x : list) {
            if (x.getMajor().equalsIgnoreCase("SE")) {
                result.add(x);
            }
        }

        return result;
    }

    //2. In ra danh sách sv ngành IA
    public List<Student> getIAStudents() {
        List<Student> result = new ArrayList();
        for (int i = 0; i < list.size(); i++) 
            if (list.get(i).getMajor().equalsIgnoreCase("IA")) 
                result.add(list.get(i));
        
        return result;
    }

    //3. In ra danh sách sv ngành SE có gpa > = 8
    public List<Student> getSEStudentsGt8() {
        List<Student> result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Student x = list.get(i);
            if (x.getMajor().equalsIgnoreCase("SE") && x.getGpa() >= 8)
                result.add(x);            
        }
        return result;
    }
    
    //-------------------------------------
    //gom hàm, chích vào cái loại query
    //quy ước xài hàm: Math.sqrt(thực) -> thực, hok in ra kq, chỉ return
    //for (int i = 2; i <= Math.sqrt(n); i++)
    //0: lấy tất cả sv
    //1: lấy tất cả SE; 2. lấy tất cả SE & GPA >= 8; 3. lấy SE < 5
    //4. lấy tất cả SE, d sách sap xếp theo giảm dần điểm
    //5. trả về những SE cao điểm nhất
    //6  IA .....
    
                                    //ENUM, dùng các hằng số đại diện value
                             //FilterType.ALL_SE
                             //FilterType.SE_GT_5
                             //Drop-down list, Combo-box, hộp thả lựa chọn
    public List<Student> getStudents(int filterType) {
        
        List<Student> result = new ArrayList();
        switch (filterType) {
            case 0:
                result = list;
                break;
            case 1:
                for (Student x : list) 
                    //tao đang xét giùm mày cái tiêu chuẩn sv mày muốn
                    if (x.getMajor().equalsIgnoreCase("SE"))
                        result.add(x);
                break;
            case 2:
                for (Student x : list) 
                    if (x.getMajor().equalsIgnoreCase("SE") && x.getGpa() >= 8)
                        result.add(x);
                break;
            case 3:
                break;
            default:
                result = null;               
        }
        return result;
    }

    //-------------------------------------

    //Cách 2: DI 
    public List<Student> getStudents(Filter<Student> filter) {
        List<Student> result = new ArrayList();
                
        for (Student x : list) 
            if (filter.check(x))
                result.add(x);
        
        return result;    
    } 
    
    //nhu cầu: filter, lọc các sinh viên theo 1 điều kiện nào đó
    //1. In ra danh sách sv ngành SE
    //4. In ra danh sách sv ngành IA có gpa > = 8
    //5. In ra danh sách sv có gpa >= 8
    //6. In ra ds sv có gpa < 5
    //7. In ra ds sv SE và IA có gpa < 5
    //8. vô chừng, theo nhu cầu thống kê của bên PĐT
}


//BÌNH LUẬN
//Khi có tập data và ta muốn filter, có giải pháp
//1. 1 hàm 1 filter, 1 câu WHERE. Code kiểu này ko sai, ko hay
//   quá nhiều hàm lẻ, ko biết còn bao nhiêu câu kiểu này nữa
//                     sửa code/bổ sung hàm liên tục nếu có nhu cầu
//                     thay đổi tiêu chí thống kê

//1.1. Giải quyết chuyện nhiều hàm lẻ
//    đưa/chích/inject LOẠI QUERY muốn làm
//    một hàm (nhận vào type - loại query - xài enum cx đc)
//    1 hàm, gọn, 
//    bên trong hàm vẫn where như cũ
//    mình vẫn phải dự đoán hết các cases ngay lúc thiết kế
//    và mình code tiếp phần case -> ko sai, nhưng vô chừng case

// ĐẢO NGƯỢC TƯ DUY
//IoC: Inversion of Control - SpringBoot

//TAO CÓ NHIỀU DATA, STUDENTMANAGER CÓ LIST STUDENT
//MÀY MUỐN KHAI THÁC DATA, NHU CẦU CỦA MÀY LÀ VÔ CHỪNG
//tao ngồi dự đoán mày mún gì, ko thể, dự đoán cơ bản đc, như mình đã code
//các hàm 
//bi giờ mày mún lọc sv theo cách của mày, if() của mày mày rõ hơn tao
//vậy mày đưa cho tao cái if() của mày thay vì tao phải tự if()
//tao có ds sv, tao lấy từng bạn ra, tao hỏi mày rằng đúng sv mày
//cần hay ko, vì sv có đủ info, xét tiêu chí nào do mày
//mày gật, tao đưa sv vào the choosen one, sv đc chọn 
//cứ thế cứ thế, có đc ds sv mày cần

//CHỐT HẠ, MÀY ĐƯA VÀO IF CỦA MÀY ĐI, MÀY TRẢ VỀ TAO BIẾT SV NÀY ĐC KO
//ĐC TAO CẤT LÁT HỒI ĐƯA HẾT CHO MÀY
//TAO KO TỰ LÀM IF NỮA, TỰ DỰ ĐOÁN BAO NHIÊU IF, VIỆC IF LÀ CỦA MÀY
//TAO LẤY TỪNG SV, TAO HỎI MÀY ĐC KO? ĐC HẢ THÌ TAO SẼ ĐƯA SAU
//HÀM CỦA TA CHỜ NGƯỜI NGOÀI, MÀY ĐƯA IF VÀO???
//                            CHÍCH VÀO CÁI RB MÀ MÀY MÚN
//                            DEPENDENCY INJECTION
//LINH HOẠT CHẤP MỌI CÂU IF CỦA NGƯỜI TA, MÀY ĐƯA VÀO, TAO KO SỬA HÀM
//THÊM HÀM, THÊM CASE, KO QUAN TÂM IF
//LOOSE COUPLING

//đưa if bên ngoài vào, ai mún if thế nào tự viết đi rồi đưa cho hàm!!!
//DI: mày muốn xử lí thế nào đưa cho tao
//Manager ko cần sửa
//thích ứng với mọi ai đó xài hàm này

//LÀM SAO ĐƯA CÂU IF VÀO 
//if tức là xử lí, mà xử lí là hàm, OOP hàm nằm trong OBJ
//đưa đối tượng có chứa if vào trong hàm getStudent(obj chứa hàm if)
//                                          gọi obj.hàm if (sv tao có)
//                                          sv đc hay ko do mày 
//                                          if obj của mày
//ko đưa type kiểu int vào nữa

//Loại class nào đó đưa vào!!!!!!!
//class mà có hàm if() đưa vào thì if () có nên hard-code hay ko???
//hard-code if coi như chỉ chấp nhận 1 class 1 if đi kèm
//linh hoạt hàm if bên ngoài luôn, ai mún if thế nào thì cứ tự do
//-> INTERFACE
//nhận vào 1 object thuộc Interface
//class có chứa hàm ko có code
//ai thích thì viết code riêng, 
//hàm ta nhận vào interface, nhận hàm chung chung chỉ có tên hàm
//lúc xài thật, mỗi thằng tự implement hàm chung chung này
//tao gọi hàm chung chung ~~~~ tao gọi hàm cụ thể của mày





