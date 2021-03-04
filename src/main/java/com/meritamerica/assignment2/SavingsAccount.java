package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(){
        new BankAccount();
    }

    public SavingsAccount(double openingBalance, double interestRate){
        new BankAccount(openingBalance, interestRate);
    }

    public SavingsAccount(long accountNumber, double openingBalance, double interestRate) {
        new BankAccount(accountNumber, openingBalance, interestRate);
    }

}