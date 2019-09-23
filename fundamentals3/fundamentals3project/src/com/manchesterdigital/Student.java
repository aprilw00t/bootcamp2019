package com.manchesterdigital;

public class Student {
    public static final String CLASS_NAME = "Bootcamp";//be kind with names, constants at the top
    // this is an example of an instance variable:
    private String studentName;
//creating constructor
    public Student(String studentName) {
        this.studentName = studentName;
    }
    public void printDetails(){
        System.out.println("Student's name is " + studentName + " Class is: " + CLASS_NAME);
    }

    public static void main(String[] args) {
        Student student = new Student("fishman");
        student.printDetails();
    }
}
