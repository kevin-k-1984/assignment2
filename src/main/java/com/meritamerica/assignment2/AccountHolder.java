package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.HashMap;

public class AccountHolder {

    // Instance variables created for the class, for account information to be processed by methods.
    private String firstName;
    private String middleName;
    private String lastName;
    private String SSN;
//    private final CheckingAccount checkingAccount;
//    private final SavingsAccount savingsAccount;
    private HashMap<String, CheckingAccount> checkingAccounts;
    private HashMap<String, SavingsAccount> savingsAccounts;

    //  This method allows to be called with no information passed in.
    public AccountHolder() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.SSN = "";
        this.checkingAccounts = new HashMap<>();
        this.savingsAccounts = new HashMap<>();

//        this.checkingAccount = new CheckingAccount();
//        this.savingsAccount = new SavingsAccount();
    }

    /* This method allows for AccountHolder to be defined with parameters passed in.
     * A new object of CheckingAccount and SavingsAccount are created with opening balance parameters passed in.
     */
    public AccountHolder(String firstName, String middleName, String lastName, String SSN,
                         double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.checkingAccounts = new HashMap<>();
        this.savingsAccounts = new HashMap<>();
//        this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
//        this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);

    }

    public AccountHolder(String sam, String john, String houston, String s) {
    }

    //This method allows the firstName variable to be called from another class.
    public String getFirstName() {
        return this.firstName;
    }

    //This sets whatever is is passed in to this class' variable.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //This method allows the middleName variable to be called from another class.
    public String getMiddleName() {
        return middleName;
    }

    //This sets whatever is passed in to this class' variable.
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    //This method allows the lastName variable to be called from another class.
    public String getLastName() {
        return this.lastName;
    }

    //This sets whatever is is passed in to this class' variable.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //This method allows the SSN variable to be called from another class.
    public String getSSN() {
        return this.SSN;
    }

    //This sets whatever is is passed in to this class' variable.
    public void setSSN(String ssn) {
        this.SSN = ssn;
    }

    //This method allows the CheckingAccount variable to be called from another class.
    public CheckingAccount getCheckingAccount() {
        return this.checkingAccount;
    }

    //This method allows the SavingsAccount variable to be called from another class.
    public SavingsAccount getSavingsAccount() {
        return this.savingsAccount;
    }

    //This method concatenates the information and prints as a string.
    public String toString() {
        return "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n" +
                "SSN: " + this.SSN + "\n" +
                this.checkingAccount.toString() + this.savingsAccount.toString();
    }

    public void addCDAccount(CDAccount cdAccount) {
    }

    public CDAccount[] getCDAccounts() {
    }

    public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
        return null;
    }

    public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
        return null;
    }

    public double getCheckingBalance() {
        return 0.0;
    }

    public double getSavingsBalance() {
        return 0.0;
    }

    public Object getCheckingAccounts() {
    }

    public Object getSavingsAccounts() {
    }
}