package data;

import java.util.Scanner;

public class StudentManagement {
    Shelf<Student> studentShelf;
    Shelf<Teacher> teacherShelf;
    Scanner scanner = new Scanner(System.in);
   public void createNewStudent() {
       String id, name;
       int yob;
       double gpa;

       System.out.println("Input iD: ");
       id = scanner.nextLine();

       System.out.println("Input name: ");
       name = scanner.nextLine();

       System.out.println("Input YOB: ");
       yob = Integer.parseInt(scanner.nextLine());

       System.out.println("Input Salary: ");
       gpa = Double.parseDouble(scanner.nextLine());

       Student student = new Student(id, yob, name, gpa);
       studentShelf = new Shelf<Student>("RED", "STUDENT", Student.class);
       studentShelf.addItem(student);
    }

    public void createAndAddNewTeacher() {
        String id, name;
        int yob;
        double salary;

        System.out.println("Input iD: ");
        id = scanner.nextLine();

        System.out.println("Input name: ");
        name = scanner.nextLine();

        System.out.println("Input YOB: ");
        yob = Integer.parseInt(scanner.nextLine());

        System.out.println("Input GPA: ");
        salary = Double.parseDouble(scanner.nextLine());

        Teacher teacher = new Teacher(id, yob, name, salary);
        teacherShelf = new Shelf<Teacher>("RED", "STUDENT", Teacher.class);
        teacherShelf.addItem(teacher);
    }

    public void getInfoStudentFromShelf() {
       for(int i = 0; i < studentShelf.getShelf().length; i++) {
           Student x = studentShelf.getShelf()[i];
           if(x != null) {
               x.showProfile();
           }
       }
    }

    public void getInfoTeacherFromSelf() {
        for(int i = 0; i < teacherShelf.getShelf().length; i++) {
            Teacher x = teacherShelf.getShelf()[i];
            if(x != null) {
                x.showProfile();
            }
        }
    }
}
