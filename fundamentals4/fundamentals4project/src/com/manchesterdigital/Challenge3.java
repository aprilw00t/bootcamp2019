package com.manchesterdigital;

public class Challenge3 {
    public static void main(String[] args) {
        repeat("potato", 67);
    }
    public static void repeat(String string, int age){
        if(age>60){
            System.out.println(string + string);
        }
        else{
            System.out.println(string);
        }
    }
}
