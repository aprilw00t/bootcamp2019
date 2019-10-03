package com.manchesterdigital;

import static com.manchesterdigital.Utility.convertStingToLong;

public class Dog {

    public static final int NUMBER_OF_TEETH = 9900;

    private int sizeOfDog;

    public Dog(int sizeOfDog){
        this.sizeOfDog = sizeOfDog;
    }

    public String bark() {
        if (sizeOfDog > 60) {
            return "BOOF";
        }
else if (sizeOfDog > 15){
    return "BARK";
        }
return "YIP!";
    }

    public static void relieve() {
        System.out.println("gone for a dump !!! ");

    }



}
