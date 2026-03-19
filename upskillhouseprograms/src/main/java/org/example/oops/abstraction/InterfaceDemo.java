package org.example.oops.abstraction;

interface Car{

     public void displayBrand();

     public void displayMusicSystem();

     public void displayAcSystem();

}

class Ford implements Car{
    public void displayBrand(){
        System.out.println("Ford");
    }

    public void displayMusicSystem(){
        System.out.println("Harman Music system");
    }

    public void displayAcSystem(){
        System.out.println("Carrier");
    }
}

class Hyundai implements Car{
    public void displayBrand(){
        System.out.println("Hyndai");
    }

    public void displayMusicSystem(){
        System.out.println("Sony Music system");
    }

    public void displayAcSystem(){
        System.out.println("Lloyd");
    }

}





public class InterfaceDemo {

    public static void main(String[] args) {
        Car car = new Hyundai();
        car.displayAcSystem();
    }

}
