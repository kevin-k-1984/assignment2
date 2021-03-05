package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double openingBalance) {
        super(openingBalance, 0.0001);
    }

    // TODO: 3/4/2021 toString
    public String toString() {
        return "Savings Account Balance: $" + String.format("%.2f", this.getBalance()) + "\n" +
                "Savings Account Interest Rate: " + String.format("%.4f", this.getInterestRate()) + "\n" +
                "Savings Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3)) + "\n";
    }

}