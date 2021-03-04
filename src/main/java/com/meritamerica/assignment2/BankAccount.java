package com.meritamerica.assignment2;

public class BankAccount {

    private Long accountNumber;
    private double balance;
    private double interestRate;

    public BankAccount(){
        this.accountNumber = MeritBank.getNextAccountNumber();
        this.balance = 0;
        this.interestRate = 0;
    }

    BankAccount(double balance, double interestRate){
        new BankAccount();
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public BankAccount(long accountNumber, double balance, double interestRate){
        new BankAccount(balance, interestRate);
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public boolean withdraw(double amount){
        if (this.balance - amount < 0) { return false; }
        this.balance -= amount;
        return true;
    }

    public boolean deposit (double amount){
        if (amount < 0) { return false; }
        this.balance += amount;
        return true;
    }

    public double futureValue(int years){
        return this.balance * (Math.pow(1 + this.interestRate, years));
    }


}
