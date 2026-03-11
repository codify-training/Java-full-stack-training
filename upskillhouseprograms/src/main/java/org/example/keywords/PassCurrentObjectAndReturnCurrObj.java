package org.example.keywords;

public class PassCurrentObjectAndReturnCurrObj {

    String name1 = "";

    public void assignData(PassCurrentObjectAndReturnCurrObj obj){
        obj.name1 = "test";
    }

     public PassCurrentObjectAndReturnCurrObj getCurrInstance(){
         assignData(this);
         return this;
     }
    public static void main(String[] args) {
        PassCurrentObjectAndReturnCurrObj obj = new PassCurrentObjectAndReturnCurrObj();
        PassCurrentObjectAndReturnCurrObj currInstance = obj.getCurrInstance();
        System.out.println(currInstance.name1);


    }


}
