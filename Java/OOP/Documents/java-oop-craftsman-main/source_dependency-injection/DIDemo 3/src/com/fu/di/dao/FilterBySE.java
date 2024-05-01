package com.fu.di.dao;

import com.fu.di.dto.Student;
import com.fu.di.util.Filter;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg 
 * version 21.06
 */

public class FilterBySE implements Filter<Student>{

    @Override
    public boolean check(Student x) {
        if (x.getMajor().equalsIgnoreCase("SE"))
            return true;
        return false;
    }
    
}
