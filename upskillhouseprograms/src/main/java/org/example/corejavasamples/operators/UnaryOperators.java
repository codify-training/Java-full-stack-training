package org.example.corejavasamples.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before result "+ a);
        a++;
        System.out.println("Increment result "+ a);
        a++;
        System.out.println("Increment result2 "+ a);
        a++;
        System.out.println("Increment result2 "+ a);

        a--;
        System.out.println("Decrement result2 "+ a);

        a--;
        System.out.println("Decrement result3 "+ a);

        int b = 20;
        System.out.println("minus val    "+ (-b));

        boolean bool = true;
        System.out.println("Boolean bool "+ !bool);

        boolean bool2 = false;
        System.out.println("Boolean bool2 "+ !bool2);
    }

}
