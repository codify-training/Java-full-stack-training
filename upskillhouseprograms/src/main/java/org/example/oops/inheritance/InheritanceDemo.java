package org.example.oops.inheritance;

class GrandFather{
    int gold = 10;
    int noOfCars = 1;

    void snoring(){
        System.out.println("Snoar in night");
    }
}

class Father extends GrandFather{

    int houses = 2;
}

 class Son extends Father{
     int company = 1;

 }


public class InheritanceDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.snoring();
        System.out.println(son.gold);
        System.out.println(son.noOfCars);
        System.out.println(son.houses);

        Father fa = new Father();
        System.out.println(fa.gold);

    }


}
