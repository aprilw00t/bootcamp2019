package com.manchesterdigital;

import java.util.Date;

/**
 * file comment
 * playing around with data types and variables
 *
 */
public class variables {
    public static void main(String[] args) {
        int number = 90;
        int NumberOfAnimals; // bad practice, should be in camelCase not PascalCase
        System.out.println("Number of animals is:" + number);
        int i1,i2, i3; // bad practice, default integer value is null
        long bigNumber = 12L; //using an L to stop the number being turned back into an integer
short n; //
        boolean itsRaining; // defaults to false

        StringBuilder output = new StringBuilder();//best practices
        output.append(number);
        output.append(" ");
        output.append(number);
        output.append(number).append("222 ").append("number");

        System.out.println(output);
    System.out.println(output.toString());
    int [] lotteryNumbers = { 1, 2, 3 };
    System.out.println(lotteryNumbers[2]);
Date today = new Date();
System.out.println(today.getTime());
    }
}
