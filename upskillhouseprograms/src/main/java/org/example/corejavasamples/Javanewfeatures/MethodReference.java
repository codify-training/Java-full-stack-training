package org.example.corejavasamples.Javanewfeatures;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void print(String name){
        System.out.println("Hello:: "+name);
    }

    public void printNowInstMethod(String name){
        System.out.println("Hello from instance Method"+ name);
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ramesh", "Rakesh", "Harsha");
       MethodReference methodReference = new MethodReference();
       //1. Static Method Reference
        names.stream().forEach(name -> MethodReference.print(name));
        names.stream().forEach(MethodReference::print);

        System.out.println("-----------------------------------------");

        //2. without instance method referece
        names.stream().forEach(nme -> methodReference.printNowInstMethod(nme));
        //2. Instance Method reference
        names.stream().forEach(methodReference::printNowInstMethod);



    }


}
