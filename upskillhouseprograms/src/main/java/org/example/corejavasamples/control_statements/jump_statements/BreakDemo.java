package org.example.corejavasamples.control_statements.jump_statements;

class BreakDemo{
    public static void main(String[] args) {
       for(int i=0; i <=10; i++){
           if(i == 5){
               break;
           }
           System.out.println(i);
       }
        System.out.println("Looping completed");
    }
}
