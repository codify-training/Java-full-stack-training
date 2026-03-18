package org.example.oops.polymorphism;

class Animal{
    void sound(int decibels){
        System.out.println("Animal Sounds : " + decibels);
    }
}

class Dog extends Animal{
    void sound(int decibels){
        System.out.println("Dog Barks : " + decibels);
    }
}



public class RuntimePolymorphism {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(100);
    }

}
