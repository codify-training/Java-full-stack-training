package org.example.springsamples.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public int makePayment(int actualAmount, int transferAmount){
        if(actualAmount < transferAmount){
            return -1;
        }
        int result = actualAmount - transferAmount;
        System.out.println("Inside Makepayment:::: "+ result);
        return result;
    }

    public int doTransfer(int acct1Amuont, int acct2Amount, int transferAmount){
        if(acct1Amuont < transferAmount){
            return -1;
        }
        int result = acct1Amuont - transferAmount;
        int result2 = acct2Amount + transferAmount;
        System.out.println("Inside Tranfer:::: "+ result2);
        //Save data in the database.
        return result;
    }

}
