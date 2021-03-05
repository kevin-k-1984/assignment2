package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {

    private java.util.Date startDate;
    private CDOffering offering;

    public CDAccount(CDOffering offering, double balance) {
        super(balance, offering.getInterestRate());
        this.startDate = new Date();
        this.offering = offering;
    }

//    public double getBalance() {
//        return this.balance;
//    }

//    public double getInterestRate() {
//        return this.offering.getInterestRate();
//    }

    public int getTerm() {
        return this.offering.getTerm();
    }

    public java.util.Date getStartDate() {
        return this.startDate;
    }

//    public long getAccountNumber() {
//        return this.accountNumber;
//    }

//    public double futureValue() {
//        return this.balance * (Math.pow(1 + this.offering.getInterestRate(), this.offering.getTerm()));
//    }

}
