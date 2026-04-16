package org.example.corejavasamples.accessspecifiers.privateaccessdemos;

public class Bank {

    private int goldReserveWeight = 100;

    private void displayRBIAuthority(){
        System.out.println("Tagged with RBI authority");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.goldReserveWeight);
        bank.displayRBIAuthority();
    }


}
