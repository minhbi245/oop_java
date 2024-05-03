package data;

public class Student extends Person {

    public double gpa;

    public Student(String id, int yob, String name, double gpa) {
        super(id, yob, name);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void showProfile() {
        System.out.printf("|STUDENT|ID: %-15s|NAME: %-10s|YOB: %4d|GPA: %4.1f|", id, name, yob, gpa);
    }
}
