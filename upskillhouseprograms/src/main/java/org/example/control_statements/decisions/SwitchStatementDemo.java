package org.example.control_statements.decisions;
class SwitchStatementDemo{

    public static void main(String args[]){
        int num = 1;
        switch(num){
            case 1:
                System.out.println("Number 1 Entered");
                break;
            case 2:   
                System.out.println("Number 2 Entered");
                break;
            case 3:   
                System.out.println("Number 3 Entered");
                break;
            default:
                System.out.println("Invalid number Entered");
                break;     
        }

    }
}