package com.manchesterdigital;

public class DoWhileExample {
    public static void main(String[] args) {
        /**
         * do { logic }
         * while ( boolean expression );
         */
        int number = 10;
        boolean isLying = false;
        do {
            number --;
            System.out.println(number + " green bottles sitting on a wall and if one green bottle should accidentally fall there'll be");
            if(number == 1){
                System.out.println("no green bottles sitting ont he wall");}
        }
        while (number > 1);
    }
}
