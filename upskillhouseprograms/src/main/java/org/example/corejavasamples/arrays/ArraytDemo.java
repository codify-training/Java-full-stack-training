package org.example.corejavasamples.arrays;

public class ArraytDemo {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 30;
        for (int i=0; i< arr.length; i++){
            System.out.println("value of arr in position" + i + " : "+ arr[i]);
        }

        int[] arr2 = new int[10];
        arr2[0] = 10;
        arr2[1] = 15;
        arr2[2] = 20;
        arr2[3] = 30;
        for (int i=0; i< arr2.length; i++){
            System.out.println("value of arr in position" + i + " : "+ arr2[i]);
        }

        int[] arr3 = new int[10];
        arr3[0] = 10;
        arr3[1] = 15;
        arr3[2] = 30;
        for (int i=0; i< arr3.length; i++){
            System.out.println("value of arr in position" + i + " : "+ arr2[i]);
        }

    }

}
