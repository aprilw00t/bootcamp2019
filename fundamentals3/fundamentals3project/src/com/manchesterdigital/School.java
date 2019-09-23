package com.manchesterdigital;

import static com.manchesterdigital.Student.CLASS_NAME;

public class School {
    public static void main(String[] args) {
        Student potatoEater = new Student("Chips");
        potatoEater.printDetails();
        System.out.println(CLASS_NAME);
    }
}
