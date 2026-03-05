package org.example.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10;

        System.out.println( " A and B Rel "+ (a == b) );
        System.out.println( " A and C Rel "+ (a == c) );
        System.out.println( " A GT B Check"+ (a > b) );
        System.out.println( " A GT OR EQ B Check"+ (a >= b) );
    }

}
