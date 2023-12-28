package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> listDev = new ArrayList<>();
        for (String key : projects.keySet()) {
            if(projects.get(key).contains(developer)) {
                listDev.add(key);
            }
        }
        Collections.sort(listDev, Collections.reverseOrder());
        listDev.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return (t1.length() - s.length());
            }
        });
        return listDev;
    }
}
