package com.manchesterdigital;

public class Calendar {
    public static void main(String[] args) {
        days(4);
}

public static void days(int nuber) {
    if(nuber<6){
        System.out.println("not a weekedn");}

    if (nuber == 2 || nuber == 4){
        System.out.println("gym");
    }
    else if (nuber == 7){
        System.out.println("gardening");
    }
}
}
