package org.example.oops.polymorphism;

public class CompileTimePolymorphismDemo {
    public String joinInfo(String info1, String info2, String info3){
        return info1 + info2 + info3;
    }

    public String joinInfo(String info1, String info2){
        return info1 + info2;
    }

    public static void main(String[] args) {
        CompileTimePolymorphismDemo c = new CompileTimePolymorphismDemo();
        c.joinInfo("test1", "test2");
    }

}
