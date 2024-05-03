import data.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
//        studentManagement.createNewStudent();
//        studentManagement.getInfoStudentFromShelf();
//
        studentManagement.createAndAddNewTeacher();
        studentManagement.getInfoTeacherFromSelf();
    }
}