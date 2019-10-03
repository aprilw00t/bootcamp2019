package com.manchesterdigital;

import java.util.Map;

public class MapChallenge {

    public Map<String, String> appendAB(Map<String, String> originalMap) {
        if(originalMap.containsKey("a")&&originalMap.containsKey("b")&&originalMap.containsKey("c")){
            return originalMap;
        }
        if (originalMap.containsKey("a")&&originalMap.containsKey("b")) {
            originalMap.put("ab",originalMap.get("a") + originalMap.get("b"));
        }
        return originalMap;
    }
}
