package org.example.corejavasamples.Javanewfeatures.functionalInterfaces;


import java.util.function.BiFunction;
import java.util.function.Predicate;

@FunctionalInterface
interface Vehicle{
    void startVehicle();

    default void test(){
        System.out.println("Default method");
    }
    static void testNow(){
        System.out.println("Static method");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Vehicle vehicle = () -> System.out.println("vehicle started");
        vehicle.startVehicle();

        Predicate<Integer> evenCheck = a -> a%2 == 0;
        System.out.println("Is even: "+evenCheck.test(10));
        System.out.println("Is even: "+evenCheck.test(11));

        BiFunction<Integer, Integer, Integer> add = (a,b) -> a + b;
        System.out.println("Sum is: "+add.apply(10, 10));
        System.out.println("Sum is: "+add.apply(10, 20));
    }
}
