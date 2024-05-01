package com.fu.didemo.util;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

//là 1 class chứa hàm ko có code, từ JDK 8, 9 trở đi khác rồi, có code...
//là 1 bộ tiêu chuẩn, nói rằng ai đó cần phải làm gì, ko cụ thể
//để sự linh hoạt lại cho người khác làm, miễn thỏa mãn bộ TC
//hàm ko code đc gọi là abstract - ý tưởng, trừu tượng - hữu hình & vô hình
//đây là 1 bộ lọc chung chung nói rằng 1 sv có thỏa tiêu chuẩn nào đó
//hay ko, ủa, thỏa tiêu chuẩn nào, tiêu chuẩn nào tùy mày đặt ra 
//chứa 1 hàm check chất lượng sv, cụ thể sao tùy mỗi bên
//FPT đặt ra tiêu chuẩn đầu ra
//Hutech, Hoa Sen .. tiêu chuẩn đầu ra  
//... theo tiêu chuẩn chung của Bộ GDĐT
//generic, biến data type thành tham số 
//setX(T a) -> tham số, kiểu value, thực sự tao cần value là int
//                        5 7 10 okie
//
@FunctionalInterface  //kí hiệu báo rằng interface chỉ có 1 hàm
                      //sử dụng Lambda expression khi xài interface

//truyền tham trị,  void f(int x) x đại diện 1 giá trị - pass by value
//truyền tham chiếu  void f(Student x) x đại diện 1 object, nằm chỗ hác
                                         //pass by reference
//truyền data type, data type lại là 1 tham số
//                   void f(??? x)   ??? là data type nào đó, x ứng với data type đó
//                   void f(<T> x), xài f(<Student> x)
//                                      f(<Lecture> x)  GENERIC

//truyền nguyên 1 hàm vào trong tham số, pass by function, đưa 1 hàm vào 1 hàm
//                   void f(??? x), lại là 1 hàm hác, 
//                                  LAMBDA EXPRESSION, ĐƯA HÀM VÀO TRONG HÀM
//                              FUNCTIONAL PROGRMMING                                            
public interface Filter<T> {

    public boolean check(T x);  //procedural programming

}
