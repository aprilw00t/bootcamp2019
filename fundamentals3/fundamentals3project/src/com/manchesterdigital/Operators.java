package com.manchesterdigital;

public class Operators {
    public static void main(String[] args) {
        //add
        int result = 1 + 2;
        //subtract -
        //multiply *
        //divide /
        //modulo %
        //pre & post increment ++
        //decrement --
        //logical AND &&
        //logical OR ||
        //abbreviated addition & subtraction += -=
        //not !
        // more than less than <
        //equals =
        // ? ternary operator -- writing an if statement

        boolean isRainingToday = true; //
        int number2 =100;
        int number = 2121312;
        if(number == number2){
            System.out.println("ye boii");
        }
        else System.out.println("nah m8");
        if(isRainingToday){
            System.out.println("you'll need a jacket");
        }
        String lastName = "stinky";
        if (lastName.equals("stinky")){ //can use equalsIgnoreCase
            System.out.println("Surname is Sousa");
        }
        int numberOfMealsToday =1;
        boolean isHungry = numberOfMealsToday <= 1 ? true : false ;
    }
}
