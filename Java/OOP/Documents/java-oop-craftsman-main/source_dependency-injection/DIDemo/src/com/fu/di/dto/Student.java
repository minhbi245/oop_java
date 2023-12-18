package com.fu.di.dto;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg 
 * version 21.06
 */

public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;
    private String major;  //DB: N - 1 Major
                           //Enumuration, các hằng số định nghĩa trước

    public Student(String id, String name, int yob, double gpa, String major) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + ", gpa=" + gpa + ", major=" + major + '}';
    }
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|%2s|\n",
                           id, name, yob, gpa, major);
    }
    
    
}
