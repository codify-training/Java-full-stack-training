package org.example.corejavasamples.control_statements.jump_statements;

public class ReturnDemo {
    public static void testReturn(){
        for (int i=0; i <=10; i++){
            if(i == 5){
                return;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        testReturn();
        System.out.println("Program Halted");
    }
}