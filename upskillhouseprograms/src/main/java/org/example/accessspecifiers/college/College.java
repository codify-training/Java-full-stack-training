package org.example.accessspecifiers.college;

public class College {
    public String collegeName = "Narayana";//Public scope Demo
    public String collegeAffliation = "NICTE";//Public scope Demo

    protected  int staffCount =  100; // Protected Demo 

    protected void displayStaffCount(){  // Protected Demo
        System.out.println("Staff Count:" + staffCount);// Protected Demo
    }

    public void showCollegeName(){ //Public scope Demo
        System.out.println("College Name"+ collegeName);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.sAge);
        s1.printName();
    }

}
