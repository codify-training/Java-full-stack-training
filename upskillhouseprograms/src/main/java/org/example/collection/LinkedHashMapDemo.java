package org.example.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("One", "Apple");
        map.put("Two", "Banana");
        map.put("Three", "Orange");
        map.put("Four", "Orange");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }
    }
}
