package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import util.MyToys;

/**
 *
 * @author giao-lang | fb/giao.lang.bis | fb/bmag.vn
 * version 18.03
 */

//Tủ đựng hồ sơ các thú cưng, lồng nhốt toàn bộ đám Dog, Cat...
public class Cabinet {  
    //Dùng ArrayList, là 1 biến thể của mảng, để lưu danh sách
    //hồ sơ các chú Pet
    //Phiên bản nâng cao sẽ xài Map
    private ArrayList<Pet> petList = new ArrayList();
    
    private Scanner sc = new Scanner(System.in);  
    //Bàn phím xài chung cho các hàm ở dưới
   
    //-----------------------------------------------------
    //CÁC HÀNH ĐỘNG LIÊN QUAN ĐẾN TỦ HỒ SƠ
    //-----------------------------------------------------
    //Thêm hồ sơ, Tìm hồ sơ, Xóa hồ sơ, Sửa hồ sơ, In danh sách (sort)
    
    //THÊM MỚI HỒ SƠ DOG --------------------------------------
    public void addNewDog() {        
        //ta sẽ nhập từng miếng thông tin của Dog ở đây qua lệnh Scanner
        String id, name;
        int yob;
        double weight;
        int pos;  //lưu vị trí tìm thấy id 
        
        //chửi khi nhập sai định dạng id, hay nhập trùng id 
        do {
            //mã số Dog là DXXXXX, D kèm 5 con số            
            id = MyToys.getID("Input dog id(DXXXXX): ", 
                    "The format of id is DXXXXX (X stands for a digit)", "^[D|d]\\d{5}$");
            pos = searchPetByID(id);
            if (pos >= 0)
                System.out.println("The dog id already exists. "
                        + "Input another one!");
        } while (pos != -1);
         
        name = MyToys.getString("Input dog name: ", "The dog name is required!");
        yob = MyToys.getAnInteger("Input dog yob (2000..2018): ", "Yob is from 2000..2018!", 2000, 2018);
        weight = MyToys.getADouble("Input dog weight (0.1->99.0): ", "Weight is from 0.1 to 99.0!", 0.1, 99.0);          
        petList.add(new Dog(id, name, yob, weight));
        System.out.println("A dog profile is added sucessfully");
    }
    
    //THÊM MỚI HỒ SƠ CAT --------------------------------------
    public void addNewCat() {        
        //ta sẽ nhập từng miếng thông tin của Cat ở đây qua lệnh Scanner
        String id, name;
        int yob;
        double weight;
        int pos;  //lưu vị trí tìm thấy id 
        
        //chửi khi nhập sai định dạng id, hay nhập trùng id 
        do {
            //mã số Cat là CXXXXX, C kèm 5 con số            
            id = MyToys.getID("Input cat id(CXXXXX): ", 
                    "The format of id is CXXXXX (X stands for a digit)", "^[C|c]\\d{5}$");
            pos = searchPetByID(id);
            if (pos >= 0)
                System.out.println("The cat id already exists. "
                        + "Input another one!");
        } while (pos != -1);
         
        name = MyToys.getString("Input cat name: ", "The cat name is required!");
        yob = MyToys.getAnInteger("Input cat yob (2000..2018): ", "Yob is from 2000..2018!", 2000, 2018);
        weight = MyToys.getADouble("Input cat weight (0.1->99.0): ", "Weight is from 0.1 to 99.0!", 0.1, 99.0);          
        petList.add(new Dog(id, name, yob, weight));
        System.out.println("A cat profile is added sucessfully");
    }
    
    //TÌM HỒ SƠ CAT/DOG --------------------------------------  
    //hàm này được gọi bởi Menu từ main() để thực thi chức năng
    //Tìm thú cưng, yêu cầu nhập vào ID của Dog hoặc Cat để tìm
    public void searchPetByID() {
        String id;
        Pet x;  //con trỏ trỏ tạm thời đến Pet tìm thấy
        id = MyToys.getString("Input pet id: ", "Pet id is required!");
        x = searchPetObjectByID(id);
        System.out.println("------------------------------------");
        if (x == null)
            System.out.println("Not found!!!");
        else {
            System.out.println("Here is the Pet "
                    + "that you want to search");
            x.showProfile();
        }     
    }
    
    //hàm helper/hàm phụ trợ
    //hàm này sẽ trả về vị trí tìm thấy Pet trong mảng 
    //quy ước: -1 hok tìm thấy 
    //trả về >=0 vị trí tìm thấy trong mảng 
    public int searchPetByID(String petID) {
        //tìm kiếm: thuật toán trâu bò, rà, quét hết mảng 
        //so khớp id của Pet thứ i trong mảng coi có bằng id đưa vào hem 
        int pos; 
        if (petList.isEmpty()) //ko có con Pet nào, kết thúc cuộc chơi ngay
            return -1; //ko tìm gì cả
        //quét hết list, coi có trùng id nào ko, thì trả về vị trí
        for (int i = 0; i < petList.size(); i++) 
            if (petList.get(i).getId().equalsIgnoreCase(petID))
                return i;            
        //đi hết cả for mà hok thấy, thì return -1 - not found 
        return -1;            
    }
    
    //vi diệu, return an object
    //nếu tìm thấy, ta return con trỏ trỏ đến Pet tìm thấy
    //tức là có 2 biến cùng trỏ vào vùng đc new Pet trước đó 
    public Pet searchPetObjectByID(String petID) {
        if (petList.isEmpty())  //ko có con nào, thì return null
            return null;        
        for (int i = 0; i < petList.size(); i++)
            if (petList.get(i).getId().equalsIgnoreCase(petID))
                return petList.get(i);
        //̣đi hết cả for mà hok thấy, đích thị là return null
        return null;
    }
    
    //CẬP NHẬT THÔNG TIN PET --------------------------------------
    //hàm này được gọi bởi Menu từ main() để thực thi chức năng
    //Sửa thông tin thú cưng, yêu cầu nhập vào ID của Dog hoặc Cat để cập nhật
    public void updatePet() {
        String id;
        String tmpName;  //nhập tên mới thay cho tên cũ
        Pet x;  //con trỏ trỏ tạm thời đến Pet tìm thấy
        id = MyToys.getString("Input pet id: ", "Pet id is required!");
        x = searchPetObjectByID(id);
        System.out.println("------------------------------------");
        if (x == null)
            System.out.println("Not found!!!");
        else {
            System.out.println("Here is the Pet before updating");
            x.showProfile();
            System.out.println("You are required to input a new name");
            tmpName = MyToys.getString("Input new name: ", "Name is required!");
            x.setName(tmpName);
            
            //TODO: thêm dàn sub menu cho lựa chọn update info nào
            //Ta gọi Menu updateMenu = new Menu();
            //và add các sub menu về update info gì? name, yob, weight
            //lưu ý ko cho update id, vì id là key, ko cho sửa
            System.out.println("The pet info is updated successfully!");
        }     
    }
    
    //XÓA PET --------------------------------------
    //hàm này được gọi bởi Menu từ main() để thực thi chức năng
    //Xóa một hồ sơ thú cưng, yêu cầu nhập vào ID của Dog hoặc Cat để xóa
    public void removePet() {
        String id;
        int pos; //vị trí tìm thấy pet
        id = MyToys.getString("Input pet id: ", "Pet id is required!");
        pos = searchPetByID(id);
        System.out.println("------------------------------------");
        if (pos == -1)
            System.out.println("Not found!!!");
        else {
            //TODO: hỏi thêm Are you sure????
            //hoặc in ra info trước khi xóa để kiểm tra
            petList.remove(pos);
            System.out.println("The selected pet is removed successfully!");
        }     
    }
    
    //IN DANH SÁCH PET -------------------------------------- 
    //in danh sách Pet tăng dần theo ID.
    //Mặc định Pet đc sort trên ID tăng dần, dùng cơ chế Comparable
    //Mỗi con Pet có khả năng GATO với cùng đồng loại
    public void printPetListAscendingByID() {
        if (petList.isEmpty()) {
            System.out.println("The cage is empty. Nothing to print");
            return;
        }
        Collections.sort(petList);
        System.out.println("------------------------------------");
        System.out.println("Here is the pet list");
        String header = String.format("|%-6s|%-15s|%4s|%4s|%4s|", "ID", "Name", "YOB", "WGHT", "SPD");
        System.out.println(header);
        for (int i = 0; i < petList.size(); i++)
            petList.get(i).showProfile();
    }
     
    //in danh sách Pet tăng dần theo Name.
    //dùng cơ chế Comparator, Anonymous class. Nâng cao sẽ dùng cú pháp Lambda
    //Mượn, mua 1 cái cân 2 đĩa để cân 2 con Pet bất kì
    public void printPetListAscendingByName() {
        if (petList.isEmpty()) {
            System.out.println("The cage is empty. Nothing to print!");
            return;
        }
        Comparator nameBalance = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        };
        Collections.sort(petList, nameBalance);
        System.out.println("------------------------------------");
        System.out.println("Here is the pet list");
        String header = String.format("|%-6s|%-15s|%4s|%4s|%4s|", "ID", "Name", "YOB", "WGHT", "SPD");
        System.out.println(header);
        for (int i = 0; i < petList.size(); i++)
            petList.get(i).showProfile();
    }
    
}
