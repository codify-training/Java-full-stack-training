package org.example.corejavasamples.Javanewfeatures.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 10,5, 1, 9, 7, 6);//source.
        nums.stream().filter(num -> num <= 7).sorted().forEach(num -> System.out.println(num));

/*
        List<Integer> tempNums = new ArrayList<>();
        for (int i=0; i<nums.size(); i++){
            if(nums.get(i) <= 7){
                tempNums.add(nums.get(i));
            }
        }
        for (int i=0; i<tempNums.size(); i++){
            System.out.println(tempNums.get(i));
        }
*/



        // num is source
        //filter, sorted - intermediatery operation
        //foreach - terniary.


    }

}
