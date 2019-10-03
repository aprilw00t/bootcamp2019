package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //Generic way of creating an arraylist
        //ArrayList variableName = new ArrayList(); NOT BEST PRACTICE
    ArrayList<String> variableName = new ArrayList<>(); // everything in the "variableName" ArrayList should be a string
    //Should use the wrapper class of everything
    variableName.add("John");
    variableName.add("bananaman");
    variableName.add("Murgatroid");

    variableName.add(3,"Frankenstein");

    int numberOfELements = variableName.size();
    System.out.println("number of elements =" + numberOfELements);
variableName.remove(0); //arrays r hell but this will reshuffle the array UwU
        variableName.remove("John");  // this returns a boolean
    String elememt = variableName.get(1);

    ArrayList<String> zooAnimals = new ArrayList<>();

    zooAnimals.add("Lion");
    zooAnimals.add("Hippo");//hippos are rubbish so we replace wiht more KITTIES
    zooAnimals.add("leopard");

    zooAnimals.set(1, "house cat");
        System.out.println(zooAnimals.get(1));
        Collections.shuffle(zooAnimals); //shuffles lists
        Collections.sort(zooAnimals);//sorts by alphabetical or numerical;
zooAnimals.contains("leopard"); //this is case sensitive and returns you a boolean

        zooAnimals.clear();
        int[] lotteryArr =new int[10];
        //to initia;ise a predefined arraylist
        List<Integer> lotteryNumbers = Arrays.asList(1, 23,45,6,88);

    }
}
