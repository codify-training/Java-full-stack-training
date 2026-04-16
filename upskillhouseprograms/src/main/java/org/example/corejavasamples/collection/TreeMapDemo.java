package org.example.corejavasamples.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("One", "Apple");
        map.put("Two", "Banana");
        map.put("Three", "Orange");
        map.put("Four", "Orange");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "Apple");
        map2.put(7, "Banana");
        map2.put(4, "Orange");
        map2.put(3, "Orange");

        for(Map.Entry<Integer, String> entry1 : map2.entrySet()){
            System.out.println("Key: "+entry1.getKey() + "   Value: "+ entry1.getValue());
        }
    }
}
