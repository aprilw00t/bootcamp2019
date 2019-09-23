package com.manchesterdigital;

public class Variables {
   static boolean isHungry = false;
    public static void main(String[] args) {
        greetWhenAdult(22);

    }
    private static void greetWhenAdult(int age){
        boolean isHappy = true;
        if (!isHungry && isHappy && age >= 18){
            System.out.println("Hello");
        }
    }
}//end of class
