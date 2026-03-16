package org.example.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        int a = 11;
        int b = 0;
        System.out.println("Division - "+ (a / b)); // Exception occurs here.
        //Control wont come down.
        System.out.println("Addition - "+ (a + b));
        System.out.println("Susbtraction - "+ (a - b));

    }
}
