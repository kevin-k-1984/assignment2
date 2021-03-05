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

    public int getTerm() {
        return this.offering.getTerm();
    }

    public java.util.Date getStartDate() {
        return this.startDate;
    }
}
