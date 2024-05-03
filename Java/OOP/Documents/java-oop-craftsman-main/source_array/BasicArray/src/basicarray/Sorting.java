package basicarray;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

public class Sorting {

    //thêm 1 main() ngoài main() ban đầu, main() phải mở lên Shift-F6
    //F6 đứng ở class nào cx đc, ưu tiên/default chạy main() đầu tiên tạo ra
    //có thể đổi main() default đc nếu mún
    //phải chuột trên biểu tượng ly cafe của Project/Properties/Run/Main Class/Browse...
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
    }

    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE9", "CHÍN", 19, 9),
                                      new Student("SE5", "NĂM", 15, 5),
                                      new Student("SE7", "BẢY", 17, 7),
                                      new Student("SE3", "BA", 13, 3),
                                      new Student("SE8", "TÁM", 18, 8),
                                       };
        System.out.println("The student list before sorting");
        for (Student x : arr) 
            x.showProfile();
        
        for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) 
            x.showProfile();
        
    }
    
    public static void sortPrimitiveArray() {

        int[] arr = new int[]{1000, 
                             -1000, 
                              1000,
                              5, 
                              10, 
                              -15,
                              -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //if thằng đầu lớn hơn thằng sau, đổi ngay và luôn
                if (arr[i] > arr[j]) {  //[i] trước [j] 
                    int t = arr[i];     //mày trước tao, mà lại lớn hơn tao
                    arr[i] = arr[j];    //đổi
                    arr[j] = t;
                }  // > tăng dần,  < giảm dần
            }
        }

        System.out.println("\nAfter sorting ascending");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
