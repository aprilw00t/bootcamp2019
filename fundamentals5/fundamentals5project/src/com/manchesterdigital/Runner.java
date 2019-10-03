package com.manchesterdigital;

import static com.manchesterdigital.Utility.convertStingToLong;

public class Runner {
    public static void main (String[] args){
//        String name = "mushroomman";
//        Boolean result = Utility.isEven(89);
//        System.out.println(result);
     Boolean names = Utility.isNamesTheSame("fishy", "snailo");
//
//        Dog poodle = new Dog(9); //object of poodle of type dog
//        Dog rottweiler = new Dog(99);//object/instance of rotweiler of type dog
//        System.out.println(rottweiler);
//        System.out.println(poodle.bark());
//        Dog.relieve();//static so muct be accessed at a class level
//        System.out.println(Dog.NUMBER_OF_TEETH);
    long aLong = Utility.convertStingToLong("23443243244324");
        System.out.println(aLong);


        Long id;
        try {
            id = convertStingToLong("31sfafaf11");
            System.out.println(id);
        }
        catch (NumberFormatException e) {
            System.err.println("input provided was not a valid number" + e );

            id = Long.MAX_VALUE;
        }
        System.out.println("my id is " + id );


    }
}
