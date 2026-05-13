package org.example.corejavasamples.Javanewfeatures.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String str = null;
        //System.out.println(str.length());
        Optional<String> oStr = Optional.ofNullable(str);
        if(oStr.isPresent()){
            System.out.println("str length is ::: "+oStr.get().length());
        }

        oStr.ifPresent(str1 -> System.out.println("str length is ::: "+str1.length())); // this is equal to above ispresent check.

        //Getting default value
        System.out.println(" Or else Demo ");
        String name = "Test";
        Optional<String> oName = Optional.ofNullable(name);
        System.out.println("When Value is Empty :  "+ oName.orElse("Default Name"));

        System.out.println(" Throwing exception when null ");
        String info = null;
       /* if(info == null){
            throw new RuntimeException("Null Not allowed raised through If check");
        }*/
        Optional<String> oInfo = Optional.ofNullable(info);
        oInfo.orElseThrow(() -> new RuntimeException("Invalid Data raised through if check:"));
    }

}
