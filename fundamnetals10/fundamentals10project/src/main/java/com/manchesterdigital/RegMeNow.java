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
            for (int position = 0; position < initialNumbers.length(); position++) {
                Character currentCharacter = initialNumbers.charAt(position);
                if (conversion.containsKey(currentCharacter)) {
                    initialNumbers = initialNumbers.replace(currentCharacter, conversion.get(currentCharacter));
                }
            }
            return initialNumbers;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
