package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {


    public CheckingAccount(double openingBalance) {
        super(openingBalance, 0.0001);
    }

    // TODO: 3/4/2021 toString
    public String toString() {
        return "Checking Account Balance: $" + String.format("%.2f", this.getBalance()) + "\n" +
                "Checking Account Interest Rate: " + String.format("%.4f", this.getInterestRate()) + "\n" +
                "Checking Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3)) + "\n";
    }
}