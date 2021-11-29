package com.oops.inheritance;

public class BankApplication {
    public static void main(String [] args) {
        Bank iciciBankObj = new ICICIBank();
        Bank hdfcBankObj = new HDFCBank();
        Bank bankOfBarodaObj = new BankOfBaroda();

        System.out.println("Printing available denominations for ICICI Bank: ");
        iciciBankObj.printAvailableDenominations();
        System.out.println("Printing available denominations for HDFC Bank: ");
        hdfcBankObj.printAvailableDenominations();
        System.out.println("Printing available denominations for Bank of Baroda: ");
        bankOfBarodaObj.printAvailableDenominations();
    }
}
