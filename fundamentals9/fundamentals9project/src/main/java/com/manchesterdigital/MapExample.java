package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<String, String>();
        countries.put("enGB","England");
        countries.put("esEs", "Spain");
        countries.put("foOD", "Candy Kingdom");

        Map<Integer, String>names = new HashMap<Integer, String>();
        names.put(1, "John"); //this is bad
        names.put(2, "Carlisle");

        names.remove(2); // can just eb given the key

        String key = "foOD";
        countries.put(key, "moominminor");
        String portugal = countries.get(key);
        System.out.println(countries);

        for (Map.Entry<Integer, String> entry : names.entrySet() )
        {
            System.out.println("key =" + entry.getKey() + "value" + entry.getValue() );
        }

        for(Integer mapKeys : names.keySet()){
            System.out.println("mapKeys = " + mapKeys);
        }

        for (String val : names.values()){
            System.out.println("val = " + val);
        }
    }
}
