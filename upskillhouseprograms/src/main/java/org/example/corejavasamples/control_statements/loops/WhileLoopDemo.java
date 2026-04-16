package org.example.corejavasamples.control_statements.loops;

import java.util.Scanner;

class WhileLoopDemo{
   
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = 0;
      while(num!=0){
        System.out.print("Entered 0 to stop");
        num = sc.nextInt();
      }
      System.out.println("Program Halted");

   }
   

}