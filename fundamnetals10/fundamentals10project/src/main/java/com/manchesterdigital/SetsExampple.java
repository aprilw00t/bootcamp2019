package com.manchesterdigital;


import java.util.*;

public class SetsExampple {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("john");
        names.add("mamsm");
        names.add("Jack");
        names.add("Jack");

        for (String name: names
             ) {
            System.out.println("name" + name);
        }

        Set<Integer> ages = new TreeSet<>();
        ages.add(22);
        ages.add(22);
        ages.add(43);
        ages.add(32);

        List<String> footballers = Arrays.asList("Ronaldo", "Messi", "Neymar", "Rooney", "Zlatan", "Ronaldo", "Zlatan", "Ronaldo");
        Set<String> uniqueFootballers = new TreeSet<>(footballers);
        System.out.println("uniqueFootballers" + uniqueFootballers);

        //union (whats in both):
        Set<String> cats = new HashSet<>();
        cats.add("Lion");
        cats.add("Cheetah");

        Set<String> reptiles = new HashSet<>();
        reptiles.add("Snake");
        reptiles.add("Crockodile");

        Set<String> zoo = new HashSet<>(cats);
        zoo.addAll(reptiles);

        System.out.println("zoo" + zoo);

        //intersection:
        Set<String> names2 = new HashSet<>();

        Set<String> otherNames = new HashSet<>();
        otherNames.add("John");
        otherNames.add("joanne");
        otherNames.add("jill");
        otherNames.add("susan");
        otherNames.add("Jack");

        Set<String> intersectionOfBoth = new HashSet<>(names);
intersectionOfBoth.retainAll(otherNames);

        System.out.println(intersectionOfBoth);

        Set<String> nameDifferences = new HashSet<>(names);
        nameDifferences.removeAll(otherNames);
        System.out.println(nameDifferences);
    }
}
