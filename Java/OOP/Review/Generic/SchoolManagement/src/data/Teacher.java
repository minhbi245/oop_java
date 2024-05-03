package data;

public class Teacher extends Person {

    private double salary;

    public Teacher(String id, int yob, String name, double salary) {
        super(id, yob, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showProfile() {
        System.out.printf("|TEACHER|ID: %-15s|NAME: %-10s|YOB: %4d|SALARY: %9.1f|", id, name, yob, salary);
    }
}
