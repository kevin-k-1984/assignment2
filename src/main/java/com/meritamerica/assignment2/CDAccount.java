package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {

    private java.util.Date startDate;
    private CDOffering offering;
    private double balance;
    private Long accountNumber;

    public CDAccount(CDOffering offering, double balance) {
        this.offering = offering;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.offering.getInterestRate();
    }

    public int getTerm() {
        return this.offering.getTerm();
    }

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double futureValue() {
        return this.balance * (Math.pow(1 + this.offering.getInterestRate(), this.offering.getTerm()));
    }

}
