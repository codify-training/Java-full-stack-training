package org.example.control_statements.loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 5;
        do{
            System.out.println("1. Add");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = sc.nextInt();
        }while(choice != 5);
        System.out.println("Program Halted");
    }
}
