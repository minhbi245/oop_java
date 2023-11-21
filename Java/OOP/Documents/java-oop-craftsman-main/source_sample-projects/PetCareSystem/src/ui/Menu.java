package ui;

import java.util.ArrayList;
import util.MyToys;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */
public class Menu {
    private String menuTitle;
    private ArrayList<String> optionList = new ArrayList();
    //chứa các lựa chọn/ thực đơn

    //khởi tạo tên của app., tên của menu
    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;
    }
        
    //bổ sung một lựa chọn vào danh sách, bắt đầu xây dựng thực đơn/
    //lựa chọn của chương trình
    public void addNewOption(String newOption) {
        //TODO: cần kiểm tra coi option đưa vào có trùng với option
        //sẵn có hay ko?
        //nếu ko trùng, add vào danh sách lựa chọn
        optionList.add(newOption);        
    }
    
    //in ra danh sách các lựa chọn để người dùng chọn tính năng cần
    //dùng
    public void printMenu() {
        if (optionList.isEmpty()) {
            System.out.println("There is no item in the menu");
            return;
        }
        System.out.println("\n------------------------------------");
        System.out.println("Welcome to " + menuTitle);
        for (String x : optionList)
            System.out.println(x);  
    }
    
    //có menu mới có lựa chọn. Hàm trả về con số người dùng chọn
    //ứng với chức năng mà người dùng muốn app thực thi
    public int getChoice() {
        int maxOption = optionList.size();
        //lựa chọn lớn nhất là số thứ tự ứng với số mục chọn
        String inputMsg = "Choose [1.." + maxOption + "]: ";
        String errorMsg = "You are required to choose the option 1.." + maxOption; 
        return MyToys.getAnInteger(inputMsg, errorMsg, 1, maxOption);
        //in ra câu nhập: Choose[1..8]: , giả sử có 8 mục chọn trong
        //menu
    }
}
