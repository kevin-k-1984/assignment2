package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(){
        new BankAccount();
    }

    public CheckingAccount(double openingBalance) {
        new BankAccount(openingBalance, 0.0001);
    }

//    public CheckingAccount(double openingBalance, double interestRate){
//        new BankAccount(openingBalance, interestRate);
//    }
//
//    public CheckingAccount(long accountNumber, double openingBalance, double interestRate) {
//        new BankAccount(accountNumber, openingBalance, interestRate);
//    }

//    public CheckingAccount() {
//        this.balance = 0.0;
//        this.interestRate = 0.0001;
//    }

    /*This checkingAccount method allows for double parameters to be passed in. An opening balance is set
     * using the deposit method, and passing in opening balance. Interest rate is set to 0.0001.
     */


    //This method stores the current balance.
    public double getBalance() {
        return this.balance;
    }

    //This method stores the current interest rate.
    public double getInterestRate() {
        return this.interestRate;
    }

    /* This boolean method rejects a negative amount, but if true, takes the current balance, adds amount, and sets sum
    to new balance. */
    public boolean deposit(double amount) {
        if (amount < 0) { return false; }
        this.balance += amount;
        return true;
    }

    /* This boolean rejects are negative withdraw amount, but if true, takes the current balance, subtracts
     * amount, and  sets the sum  to new balance.
     */
    public boolean withdraw(double amount) {
        if (this.balance - amount < 0) { return false; }
        this.balance -= amount;
        return true;
    }

    /*  This  method  calculates the interest, taking in #  of years as a parameter. It takes the balance,
     * and  multiplies it by the calculated interest rate
     */
    public double futureValue(int years) {
        return this.balance * (Math.pow(1 + this.interestRate, years));
    }

    // this toString method takes all the information and converts it to a string.  The "\n" creates a new line.
    public String toString() {
        return "Checking Account Balance: $" + String.format("%.2f", this.getBalance()) + "\n" +
                "Checking Account Interest Rate: " + String.format("%.4f", this.getInterestRate()) + "\n" +
                "Checking Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3)) + "\n";
    }
}