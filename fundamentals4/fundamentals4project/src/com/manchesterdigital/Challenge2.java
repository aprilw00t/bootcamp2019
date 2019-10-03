package com.manchesterdigital;

public class Challenge2 {
    public static void main(String[] args) {
registrationGenerator("SAIBG12");

    }
    private static String registrationGenerator(String reg)
    {
        reg = reg.replaceAll("S", "5").replaceAll("A", "4").replaceAll("I", "1")
                .replaceAll("B", "8").replaceAll("G","9");
        System.out.println(reg);
        return reg;
    }

}
