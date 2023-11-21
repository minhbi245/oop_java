package util;

import java.util.Scanner;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */
//class chứa các hàm đồ chơi, dùng cho việc nhập xuất dữ liệu
public class MyToys {

    private static Scanner sc = new Scanner(System.in);

    //hàm nhập vào số nguyên đích thực
    //- mọi sự nhập cà chớn bị chửi, ví dụ nhập chuỗi thay vì nhập số
    //- chống trôi lệnh, tức là ko để lại rác Enter hay kí tự nào đó
    //trong buffer cho thằng sau hốt 
    //- có thể kiểm tra số nguyên trong 1 range/khoảng cho trước
    //- có câu thông báo động, tùy ngữ cảnh 
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upperBound) {
        int n, tmp;
        //nếu đầu vào lower > upper thì đổi chỗ
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerBound || n > upperBound)
                    throw new Exception();                
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập vào 1 số thực, chặn hết các trường hợp cà chớn 
    public static double getADouble(String inputMsg, String errorMsg) {
        double n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
    public static double getADouble(String inputMsg, String errorMsg, double lowerBound, double upperBound) {
        double n, tmp;
        //nếu đầu vào lower > upper thì đổi chỗ
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if (n < lowerBound || n > upperBound)
                    throw new Exception();                
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
        
    //nhập vào một chuỗi kí tự, theo định dạng đc đưa vào
    //định dạng xài Regular Expression
    public static String getID(String inputMsg, String errorMsg, String format) {
        String id;
        boolean match;
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.length() == 0 || id.isEmpty() || match == false)
                System.out.println(errorMsg);
            else
                return id;            
        }
    }
    
    //nhập vào một chuỗi kí tự, khác rỗng
    public static String getString(String inputMsg, String errorMsg) {
        String id;        
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();            
            if (id.length() == 0 || id.isEmpty())
                System.out.println(errorMsg);
            else 
                return id;
        }
    }
    
    //main() để test thử yêu cầu nhập mã số theo định dạng cho
    //trước: D và 5 con số đi kèm
    //Nhấn Shift-F6 để chạy thử
    public static void main(String[] args) {
        String id = getID("Input ID(DXXXXX): ", "Your input must be under "
                + "the format of DXXXXX, X stands for a digit",
                "^[D|d]\\d{5}$");
        System.out.println("Your ID: " + id);
    }
}