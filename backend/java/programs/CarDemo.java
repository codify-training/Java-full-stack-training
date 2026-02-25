class Car{
      //data, variables, properties
      String color;
      int speed;
      // Method, function, behaviour
      void drive(){
         System.out.println("drive");
      }
      void displayCarProps(){
         System.out.println("Color: "+color + " Speed: "+ speed);
      }
   }


class CarDemo{

   public static void main(String[] args){
     Car myCar = new Car(); 
     myCar.color = "red";
     myCar.speed = 120;
     myCar.drive();
     myCar.displayCarProps(); 

    Car myNewCar = new Car();
    myNewCar.color = "white";
    myNewCar.speed = 200;
    myNewCar.drive();
    myNewCar.displayCarProps();
   }

}