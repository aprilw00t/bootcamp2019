package com.manchesterdigital;

public class MethodOverloadingExample {

    public int multiply(int first, int second){
        return first * second;
    }
    public int multiply(int first, int second, int third){
        return first * second * third;
    }
    public int multiply(int first, int second, int third, int fourth){
        return multiply(first, second, third) * fourth;
    }


    public static void main(String[] args) {
        MethodOverloadingExample me = new MethodOverloadingExample();

        int result = me.multiply(3, 3);
        System.out.println("Result" + result);
    }
}
