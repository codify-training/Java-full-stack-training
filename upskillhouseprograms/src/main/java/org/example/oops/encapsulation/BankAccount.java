package org.example.oops.encapsulation;

import org.example.accessspecifiers.privateaccessdemos.Bank;

class BankAccount{
    private double balance = 0;

    public void deposit(int amt){
        if(amt > 40000){
            System.out.println("verify aadhar and take amount");
        }
        balance = balance + amt;
    }
    
   public void withdrawl(int amt){
        balance = balance - amt;
    }
    
   public double getBalance() {
       return balance;
   }

 }

 class MainCls{
     public static void main(String[] args) {
         BankAccount ba = new BankAccount();
         ba.deposit(100);
         System.out.println(ba.getBalance());
         ba.deposit(100);
         System.out.println(ba.getBalance());
         ba.deposit(5000);
         System.out.println(ba.getBalance());


     }

 }