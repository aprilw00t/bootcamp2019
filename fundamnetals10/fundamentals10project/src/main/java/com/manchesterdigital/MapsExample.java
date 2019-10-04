package com.manchesterdigital;

import apple.laf.JRSUIUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<Integer, String>();
        names.put(1, "john");
        names.put(3, "jill");
        names.put(8, "susan");
        names.put(4,"andrew");
        names.put(9999,"andrw");
        names.put(43,"andrew");
        names.put(42,"adrew");
        names.put(19,"andw");
        names.put(10,"andw");
        names.put(9,"andw");
        names.put(104,"andw");
        names.put(149,"andw"); // these things aren't guaranteed to order themselves

        for(Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.println("entry.getKey() =" + entry.getKey());
            System.out.println("entry.getKey() =" + entry.getValue());

        }
        Map<Integer, String> countries = new TreeMap<Integer, String>();
        countries.put(23, "England");
        countries.put(99, "France");
    }
}
