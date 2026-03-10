package org.example.control_statements.decisions;

public class IfElseIfLadder {

    public static void main(String[] args) {
        int stGrade = 45;
        //above 90 A+ grade, above 80 A grade, above 70 B grade, above 60 C grade, below 60 d grade.
        if(stGrade >= 90){
            System.out.println("A+ grade");
        }else if(stGrade >=80){
            System.out.println("A grade");
        }else if(stGrade >=70){
            System.out.println("B grade");
        }else if(stGrade >=60){
            System.out.println("C grade");
        }else{
            System.out.println("D grade");
        }
    }

}
