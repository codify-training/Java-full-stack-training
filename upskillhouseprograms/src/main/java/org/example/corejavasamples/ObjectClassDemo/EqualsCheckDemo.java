package org.example.corejavasamples.ObjectClassDemo;

class PersonP{
    String name;
    int age;
    public PersonP(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person Object Info : name :"+name + " age: "+ age;
    }

    @Override
    public boolean equals(Object o){
        PersonP p = (PersonP)o;
        return this.name.equals(p.name) && this.age == p.age;
    }
}
public class EqualsCheckDemo {

    public static void main(String[] args) {
        String str = "test";
        String str2 = "test";
        System.out.println(str == str2);

        String strn1 = new String("test");
        String strn2 = new String("test");
        System.out.println(strn1 == strn2);

        System.out.println(".equals triggered "+strn1.equals(strn2));


        PersonP p = new PersonP("Tets", 40);
        PersonP p2 = new PersonP("Tets", 41);

        System.out.println("Compare person objects: "+(p == p2));

        System.out.println("Compare person objects with equals: "+(p.equals(p2)));

    }
}
