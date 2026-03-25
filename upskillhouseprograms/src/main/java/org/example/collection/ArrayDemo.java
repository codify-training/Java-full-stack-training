package org.example.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        li.add("B");
        //li.add(1); // this wont work bcz the list is of type string.
        System.out.println(li);
        System.out.println(li.get(2));
        li.set(2, "F");
        System.out.println(li);
        li.remove(3);
        System.out.println(li);
    }


}
