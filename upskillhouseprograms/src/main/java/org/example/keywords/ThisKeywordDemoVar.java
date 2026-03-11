package org.example.keywords;

public class ThisKeywordDemoVar{

    String name = "";
    ThisKeywordDemoVar(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ThisKeywordDemoVar thisKeywordDemo = new ThisKeywordDemoVar("test");
        System.out.println("Here name is : "+thisKeywordDemo.name);
    }

}
