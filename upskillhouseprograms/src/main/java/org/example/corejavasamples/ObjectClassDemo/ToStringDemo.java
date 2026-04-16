package org.example.corejavasamples.ObjectClassDemo;


class PersonT{
    String name;
    int age;
    public PersonT(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person Object Info : name :"+name + " age: "+ age;
    }

}
public class ToStringDemo {
    public static void main(String[] args) {
        PersonT p = new PersonT("TestStr", 30);
        System.out.println(p.toString());

        String str = "Test";
        System.out.println(str.toString());

    }
}
