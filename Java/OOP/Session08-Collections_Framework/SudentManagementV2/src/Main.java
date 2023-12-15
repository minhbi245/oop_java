import data.Cabinet;

public class Main {

    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        //              có cái Tủ, trong cái Tủ có cái Giỏ/Túi nhưng lại chưa có gì cả ~~~ ngăn trống
        se.addAStudent();
        se.addAStudent();

        se.printStudentList();

        // search tìm thấy
        //String id; // Scanner...
        //se.searchAStudent("SE123456"); hard code hoặc từ bàn phím ở trên
        se.searchAStudent();
    }

//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ai = new Cabinet();
//
//        // Tạo MENU chỗ này mới đúng
//        System.out.println("ADD SE");
//        se.addAStudent();   // #1
//
//        System.out.println("ADD AI");
//        ai.addAStudent();   // #1
//        ai.addAStudent();   // #2
//
//        System.out.println("SE Students");
//        se.printStudentList();
//        System.out.println("AI Students");
//        ai.printStudentList();
//    }
}
