package org.example.ObjectClassDemo;

class PersonPT{
    String name;
    String age;
    public PersonPT(String name, String age){
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
        return this.name.equals(p.name) && this.age.equals(p.age);
    }

    @Override
    public int hashCode(){;
        return this.age.hashCode() + this.name.hashCode();
    }
}
public class HashCodeDemo {
    public static void main(String[] args) {
        String str = "Test Hash Code";
        System.out.println(str.hashCode());

        PersonPT p = new PersonPT("test", "20");
        System.out.println(p.hashCode());
    }
}
