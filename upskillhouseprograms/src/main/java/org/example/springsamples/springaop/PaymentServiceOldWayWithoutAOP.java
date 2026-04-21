package org.example.springsamples.springaop;

public class PaymentServiceOldWayWithoutAOP {

    public int makePayment(int actualAmount, int transferAmount){
        Long startTime = System.currentTimeMillis(); //CrssCutting Concersns
        System.out.println("Arguments/parameters :"+actualAmount + "  "+transferAmount); //CrssCutting Concersns
        if(actualAmount < transferAmount){
            return -1;
        }
        int result = actualAmount - transferAmount;
        System.out.println("Result : "+ result);
        Long endTime = System.currentTimeMillis(); //CrssCutting Concersns
        System.out.println("Executed in Time : "+(endTime - startTime)); //CrssCutting Concersns
        return result;
    }

    public int doTransfer(int acct1Amuont, int acct2Amount, int transferAmount){
        Long startTime = System.currentTimeMillis(); //CrssCutting Concersns
        System.out.println("Arguments/parameters :"+acct1Amuont + "  "+ " acct2Amount: "+transferAmount); //CrssCutting Concersns
        if(acct1Amuont < transferAmount){
            return -1;
        }
        int result = acct1Amuont - transferAmount;
        int result2 = acct2Amount + transferAmount;
        //Save data in the database.
        Long endTime = System.currentTimeMillis(); //CrssCutting Concersns
        System.out.println(endTime - startTime); //CrssCutting Concersns
        return result;
    }

}
