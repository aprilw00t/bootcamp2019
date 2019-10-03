package com.manchesterdigital;

public class Scratch {
    public static void main(String[] args) {
        BakingExample bakingExample = new BakingExample();
        BakingExample.switchOvenOn(5);
        bakingExample.decorate();
        //can't reach the baking example method until it is taken off private
    }
}
