package com.fu.di.util;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg 
 * version 21.06
 */

//biến data type thành tham số, truyền tham số theo kiểu lấy data type mà truyền
//ko phải truyền value nào đó, kĩ thuật này gọi là GENERIC
//List<Student> list = new ArrayList();
//list..... 

@FunctionalInterface   //dính dáng đến Lambda expression
public interface Filter<T> {
    
    public boolean check(T x);
    
}
