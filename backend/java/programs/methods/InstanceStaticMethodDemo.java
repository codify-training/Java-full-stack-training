class InstanceStaticMethodDemo{
 
   int instanceVariable = 10;
   byte j = 100;
   long l = 1000000000000000l;
   float f = 2222222222222222222222222232222222222222210.5555555555555555555555;
   void greet(){
    System.out.println(instanceVariable);
     System.out.println(l);
    System.out.println(j);
       System.out.println("Hello Greeting");
    }
   static void doGreetNoInstance(){        
       System.out.println("Hello Greeting called without instance");
    } 
public static void main(String[] args){
     InstanceStaticMethodDemo instanceObj = new InstanceStaticMethodDemo();
     instanceObj.greet();

     InstanceStaticMethodDemo.doGreetNoInstance();

  }
 }              
