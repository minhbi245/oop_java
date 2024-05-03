package main;
import data.Shelf;
import data.Student;
import java.util.Scanner;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //NGON MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH
        Shelf tuSE = new Shelf("PINK", "SE");
        
        tuSE.inputAStudent();  //giả bộ gọi menu add student 2 lần
        tuSE.inputAStudent();
        
        tuSE.printStudentList();  //gọi menu in danh sách đã nhập
                
        //inputStudentList();
    }
    
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;
        
        System.out.print("How many students do you want to input? ");
        count = Integer.parseInt(sc.nextLine());  //sc.nextInt();  //MyToys.getAnInteger(??????);
                
        Student[] arr = new Student[count];  //count = 5
         
        //for nhập 5 hồ sơ
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();
            
            System.out.print("Input name: ");
            name = sc.nextLine();
            
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine()); //try-catch hoặc MyToys.
            
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine()); //try-catch hoặc MyToys.
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        //sort dăm ba đồ yêu, éo thèm làm, vì đã học
        
    }
    
}
