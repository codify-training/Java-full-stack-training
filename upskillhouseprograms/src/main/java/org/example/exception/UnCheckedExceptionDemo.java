package org.example.exception;

public class UnCheckedExceptionDemo {

    public static void main(String[] args) {
            int a = 11;
            int b = 0;
            try{
                System.out.println("Division - "+ (a / b)); // Exception occurs here.
            }catch (ArithmeticException ex){
                System.out.println("Invalid argument value 0 is passed for B, Division not executed");
            }
            //Control wont come down.
            System.out.println("Addition - "+ (a + b));
            System.out.println("Susbtraction - "+ (a - b));

        }
    }

