package org.example.accessspecifiers.college;

public class Student {
    public String name = "Rakesh";
    public int sAge = 20;

    public void printName(){
        System.out.println("name :"+ name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("age: "+ s.sAge);
        s.printName();

        College college = new College(); // Protected Demo within package
        college.displayStaffCount();// Protected Demo within package

    }

}
