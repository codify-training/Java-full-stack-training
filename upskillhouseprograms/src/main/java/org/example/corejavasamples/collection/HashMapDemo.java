package org.example.corejavasamples.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("One", "Apple");
        map.put("Two", "Banana");
        map.put("Three", "Orange");
        map.put("Four", "Orange");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }
        System.out.println("Duplicate Key");
        map.put("Two", "Watermelon");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }
        //Remove a key.
        System.out.println("Remove");
        map.remove("Three");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }

        System.out.println("Contains Key Testing");
        System.out.println(" One Contains : "+map.containsKey("One"));
        System.out.println(" Two Contains : " +map.containsKey("Two"));
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }


        System.out.println("Contains Value Testing");
        System.out.println(" Apple Contains : "+map.containsValue("Apple"));
        System.out.println(" WaterMelon Contains : " +map.containsValue("WaterMelon"));
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + "   Value: "+ entry.getValue());
        }
    }
}
