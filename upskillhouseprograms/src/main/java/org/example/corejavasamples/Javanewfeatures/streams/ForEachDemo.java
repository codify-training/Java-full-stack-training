package org.example.corejavasamples.Javanewfeatures.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 10,5, 1, 9, 7, 6);//source.
        /*for (int i=0; i< nums.size(); i++){
            System.out.println("Iterating one by one");
            System.out.println(nums.get(i));
        }*/

        nums.stream().forEach(num -> {
            System.out.println("Iterating one by one");
            System.out.println(num);
        });

    }
}
