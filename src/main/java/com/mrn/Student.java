package com.mrn;

public class Student {
    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void studentInit() {
        System.out.println("Student init method called here...");
    }

    public void studentDestroy() {
        System.out.println("Student destroy method is called...");
    }
}
