
package org.example.oops.abstraction;

abstract class Shape{
    String color;
    abstract double area();

    void printArea(){
        System.out.println("area is : "+ area());
    }
 }

 class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }


 }

class Square extends Shape{

    int length, breadth;

    Square(int length, int breadth){
        this.length = length;
        this.breadth =breadth;
    }
    double area(){
        return length * breadth;
    }

}

public class AbstractClassDemo{
    public static void main(String[] args) {
        Shape sh = new Circle(10);
        System.out.println(sh.area());

        Shape sh2 = new Square(10, 20);
        System.out.println(sh2.area());

    }
}