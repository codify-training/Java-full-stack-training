package org.example.arrays;

public class ProblemWithoutArray {

    /**
     * when the students size grows to hundred we have to use hundred variables and hundred print statement.
     * this a great overhead(problem/difficulty)
     * @param args
     */

    public static void problemWithoutarray(){
        int s1 = 80;
        int s2 = 70;
        int s3 = 75;
        int s4 = 90;
        int s5 = 66;
        int s6 = 77;
        int s7 = 88;

        System.out.println("Marks of Student 1 :"+s1 );
        System.out.println("Marks of Student 2 : "+s2 );
        System.out.println("Marks of Student 3 : "+s3 );
        System.out.println("Marks of Student 4 : "+s4 );
        System.out.println("Marks of Student 5 : "+s5 );
        System.out.println("Marks of Student 6 : "+s6 );
        System.out.println("Marks of Student 7 : "+s7 );
    }

    public static void solutionWithArray(){

        int[] students = {80, 70, 75, 90, 66, 77, 88};

        for(int i=0; i< students.length; i++){
            System.out.println("Marks of Student"+ i + " : "+students[i]);
        }
    }

    public static void main(String[] args) {
        problemWithoutarray();
        System.out.println("----------");
        solutionWithArray();
    }


}
