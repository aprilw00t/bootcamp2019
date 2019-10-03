package com.manchesterdigital;

import java.util.ArrayList;

public class InterestCalculator {
    public static void main(String[] args) {
        stringTimes("r", 5);
        forEachExample();
        whileExample();
    }


public static String stringTimes(String string, int numberOftimes) {
    String result = "";
    for (int i = 1; i <= numberOftimes; i++) {
        result = result + string;
    }
    System.out.println(result);
    return result; }

    public static boolean forEachExample() {
        /**
         * for (datatype instance : collection){
         *     //some logic for the loop
         * }
         * for each is used to cycle through arrays and array lists
         */
        ArrayList<Integer> students = new ArrayList<>();
        students.add(1);
        students.add(1);
        //students.add(5);
        students.add(4);

        for (int student : students) {
            boolean result = false;
            if (student != 1 && student != 4) {

                System.out.println("false");
            return false;}
        }
        System.out.println("true");
return true;
    }

    public static int whileExample(){
        /**
         * while(booean expression){
         *  body/logic
         *  }
         */

        int number = 0; //initial population of puffins
        int total = 0;

        while(number <= 100){

           total = total + number;
           number ++;
        }
        System.out.println(total/100);
        System.out.println(total);
        return total;
    }

}
