package org.example.corejavasamples.keywords;

final class Student{
   String name = "Ramesh";
   final void display(){
      System.out.println("name is  + "+ name);
   }
}

class FinalKeywordDemo /*extends Student - this is not allowed*/{

   /*void display(){
      System.out.println("In child class");
   }*/  // This not allowed bcz method is final

   public static void main(String[] args) {
      final int i=10;
      // i = 20; Chyanging not allowed
      System.out.println(i);
   }

}