package com.manchesterdigital;

public class ExceptionExample {


    public static void main(String[] args) {
        int[] intArr = {12, 3, 5};

        printArray(0, intArr);
        printArray(1,intArr);
        printArray(2, intArr);
        //o no

        try {
            //try to access element 3
            printArray(3, intArr);//would recieve a red message,
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("OH NO THE ARRAY IS ERROR " + e.getLocalizedMessage());
        } } //make sure the error messages are sensible
    //means people looking at your code have a better time


    private static void printArray(int index, int [] arr){
        System.out.println("element" + index + "is" + arr[index]);
    }
}
