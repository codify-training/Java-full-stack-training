package org.example.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 22;
        //
        if(age > 18 && age < 30){
            System.out.println("Eleigible for Job");
        }

        if(age == 20 || age == 21){
            System.out.println("I want those Employee in that age");
        }
    }

}
