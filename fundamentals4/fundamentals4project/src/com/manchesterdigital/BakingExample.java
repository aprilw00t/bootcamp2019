package com.manchesterdigital;

public class BakingExample {
    public static void main(String[] args) {
switchOvenOn(2);
    }
    protected void decorate(){
        System.out.println("decorating the cake...");
    }
    protected static int switchOvenOn(int setting){
        int minutesToCook =0;
        System.out.println("Setting oven to " + setting);
        switch (setting) {
            case 1:
                System.out.println("set 1");
                minutesToCook += 30;
                break;
            case 2:
                System.out.println("set 2");
                minutesToCook += 40;
                break;
            case 3:
                System.out.println("set 3");
                minutesToCook += 50;
                break;
            case 4:
                System.out.println("set 4");
                minutesToCook += 60;
                break;
            case 5:
                System.out.println("set 5");
                minutesToCook += 70;
                break;
            default:
                System.out.println("oven is off");
        }
        return minutesToCook;
    }
        private static void produceMixture(){
            System.out.println("Mixing...");
        }
    }

