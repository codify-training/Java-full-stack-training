package org.example.constructor;

public class StudentContructorDemo {

    String college;
    public String name;
    int age;
    float fee;

    boolean b;


    StudentContructorDemo(){
        college = "Audisankara";
        fee = 5000.0f;
        b = true;
    }

    StudentContructorDemo(String n, int a){
        this();
        name = n;
        age = a;
    }

    public void printData(){
        System.out.println("Name : "+ name + "  age " + age + "  float --> " + fee + " Bool "+ b);
    }
    public static void main(String[] args) {
        StudentContructorDemo studentContructorDemo1 = new StudentContructorDemo("Akshay", 19);
        studentContructorDemo1.printData();
        System.out.println("----------------");
        StudentContructorDemo studentContructorDemo2 = new StudentContructorDemo("Ramu", 20);
        studentContructorDemo2.printData();
        System.out.println("----------------");
        StudentContructorDemo studentContructorDemo3 = new StudentContructorDemo("Navitha", 20);
        studentContructorDemo3.printData();


    }

}
