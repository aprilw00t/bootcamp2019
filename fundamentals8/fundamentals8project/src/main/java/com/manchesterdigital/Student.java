package com.manchesterdigital;

public class Student extends Person{
    private String universityName;

    public Student(String firstName, String lastNmae, Integer age, Address address) {
        super(firstName, lastNmae, age, address);
    }

    public void haveLunch() {
System.out.println("has lunch at 12");
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
       StringBuilder out = new StringBuilder();

       out.append("UniversityName :");
       out.append(universityName);
       out.append("\n");
       out.append("Person :");
       out.append(getAge());
       return out.toString();
    }
}
