package com.manchesterdigital;

public class Total {
    public static void main(String[] args) {
        double potato = 20d;
        double carrot = 80d;
        double total = ((potato + carrot)*25)%40;
        System.out.println(total);
        if (total <= 20){
            System.out.println("total was over the limit");
        }
    }
}
