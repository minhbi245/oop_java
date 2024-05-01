package com.fu.didemo.dao;

import com.fu.didemo.dto.Student;
import com.fu.didemo.util.Filter;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

//tham gia CLB, Bộ Tiêu Chuẩn, thì phải làm gì cụ thể, implement, viết code
//cho hàm abstract, cụ thể rồi, ko chung chung trừu tượng nữa
//class rời, phải có create class -> CONCRETE CLASS
public class FilterBySE implements Filter<Student> {

    @Override
    public boolean check(Student x) {
        
        return x.getMajor().equalsIgnoreCase("SE");
        
//        if (x.getMajor().equalsIgnoreCase("SE") == true)
//            return true;
//        return false;        
    }

   
    
}
