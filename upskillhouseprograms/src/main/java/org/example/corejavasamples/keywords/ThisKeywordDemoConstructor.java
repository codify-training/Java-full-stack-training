package org.example.corejavasamples.keywords;

public class ThisKeywordDemoConstructor {

    String name = "";
    String name2 = "";
    String stateName;
    ThisKeywordDemoConstructor(){
        this.stateName = "Andhra Pradesh";
    }

    ThisKeywordDemoConstructor(String name1, String name2){
        this(name1);
        this.name2 = name2;
    }

    ThisKeywordDemoConstructor(String name){
        this();
        this.name = name;
    }

    public static void main(String[] args) {
        ThisKeywordDemoConstructor thisKeywordDemo = new ThisKeywordDemoConstructor("Suresh", "Naveen");
        System.out.println("State Name is : "+thisKeywordDemo.stateName);
        System.out.println("Name is : "+thisKeywordDemo.name);
        System.out.println("Name 2 is : "+thisKeywordDemo.name2);
    }   

}
