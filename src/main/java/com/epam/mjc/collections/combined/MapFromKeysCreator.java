package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for(String key : sourceMap.keySet()) {
            Set<String> mid;
            if(result.containsKey(key.length())) {
                mid = new HashSet<>(result.get(key.length()));
            } else {
                mid = new HashSet<>();
            }
            mid.add(key);
            result.put(key.length(), mid);
        }
        return result;
    }
}
