package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class RegMeNow {

    public String registrationConverter(String initialNumbers) {
        if (initialNumbers.matches("[A-Z0-9]{5,7}")) {
            Map<Character, Character> conversion = new HashMap<>();
            conversion.put('S', '5');
            conversion.put('A', '4');
            conversion.put('G', '6');
            conversion.put('B', '8');
            conversion.put('I', '1');
            for (Map.Entry<Character, Character> entry: conversion.entrySet()) {
                initialNumbers = initialNumbers.replace(entry.getKey(), entry.getValue());
            }
            return initialNumbers;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
