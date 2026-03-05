package org.example.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(" = demo "+ a);
        a += 10; // a= a+10
        System.out.println(" += Demo  "+ a);

        a += 45; // a = a + 45 - a = 20 + 45 = 65
        System.out.println(" += Demo2  "+ a);

        a += 10; // a = a + 10 - 65 + 10 = 75
        System.out.println(" += Demo3  "+ a);


    }

}
