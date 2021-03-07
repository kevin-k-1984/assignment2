package com.meritamerica.assignment2;

public class AccountHolder {

    //region InstanceVariables

    private String firstName;
    private String middleName;
    private String lastName;
    private String SSN;
    private CheckingAccount[] checkingAccounts;
    private SavingsAccount[] savingsAccounts;
    private CDAccount[] cdAccounts;

    //endregion

    //region Constructors

    /* This method allows for AccountHolder to be defined with parameters passed in.
     * A new object of CheckingAccount and SavingsAccount are created with opening balance parameters passed in.
     */
    public AccountHolder(String firstName, String middleName, String lastName, String SSN) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.checkingAccounts = new CheckingAccount[0];
        this.savingsAccounts = new SavingsAccount[0];
        this.cdAccounts = new CDAccount[0];
    }

    //endregion

    //region Basic Info Getters/Setters

    // This method allows the firstName variable to be called from another class.
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

    //endregion

    //region CheckingAccount Methods

    public CheckingAccount addCheckingAccount(double openingBalance) {
        if (this.getCheckingBalance() + this.getSavingsBalance() + openingBalance < 250000) {
            CheckingAccount[] temp = new CheckingAccount[this.checkingAccounts.length + 1];

            for (int i = 0; i < this.checkingAccounts.length; i++) temp[i] = this.checkingAccounts[i];

            temp[temp.length - 1] = new CheckingAccount(openingBalance);
            this.checkingAccounts = temp;

            return this.checkingAccounts[this.checkingAccounts.length - 1];
        }
        return null;
    }

    public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount){
        if (this.getCheckingBalance() + this.getSavingsBalance() + checkingAccount.getBalance() < 250000){
            CheckingAccount[] temp = new CheckingAccount[this.checkingAccounts.length + 1];

            for (int i = 0; i < this.checkingAccounts.length; i++) temp[i] = this.checkingAccounts[i];

            temp[temp.length - 1] = checkingAccount;
            this.checkingAccounts = temp;

            return checkingAccount;
        }
        return null;
    }

    public CheckingAccount[] getCheckingAccounts() {
        return this.checkingAccounts;
    }

    public int getNumberOfCheckingAccounts(){
        return this.checkingAccounts.length;
    }

    public double getCheckingBalance() {
        double result = 0.0;
        for (CheckingAccount account: this.checkingAccounts){
            result += account.getBalance();
        }
        return result;
    }

    //endregion

    //region SavingsAccount Methods

    public SavingsAccount addSavingsAccount(double openingBalance) {
        if (this.getCheckingBalance() + this.getSavingsBalance() + openingBalance < 250000){
            SavingsAccount[] temp = new SavingsAccount[this.savingsAccounts.length + 1];

            for (int i = 0; i < this.savingsAccounts.length; i++) temp[i] = this.savingsAccounts[i];

            temp[temp.length - 1] = new SavingsAccount(openingBalance);
            this.savingsAccounts = temp;

            return this.savingsAccounts[this.savingsAccounts.length - 1];
        }
        return null;
    }

    public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount){
        if (this.getCheckingBalance() + this.getSavingsBalance() + savingsAccount.getBalance() < 250000){
            SavingsAccount[] temp = new SavingsAccount[this.savingsAccounts.length + 1];

            for (int i = 0; i < this.savingsAccounts.length; i++) temp[i] = this.savingsAccounts[i];

            temp[temp.length - 1] = savingsAccount;
            this.savingsAccounts = temp;

            return this.savingsAccounts[this.savingsAccounts.length - 1];
        }
        return null;
    }

    public SavingsAccount[] getSavingsAccounts() {
        return this.savingsAccounts;
    }

    public int getNumberOfSavingsAccounts(){
        return this.savingsAccounts.length;
    }

    public double getSavingsBalance() {
        double result = 0.0;
        for (SavingsAccount account: this.savingsAccounts){
            result += account.getBalance();
        }
        return result;
    }

    //endregion

    //region CDAccount Methods

    public CDAccount addCDAccount(CDOffering cdOffering, int openingBalance) {
        if (cdOffering == null) return null;

        return this.addCDAccount(new CDAccount(cdOffering, openingBalance));
    }

    public CDAccount addCDAccount(CDAccount cdAccount) {
        if (cdAccount == null) return null;

        CDAccount[] temp = new CDAccount[this.cdAccounts.length + 1];

        for (int i = 0; i < this.cdAccounts.length; i++) temp[i] = this.cdAccounts[i];

        temp[temp.length - 1] = cdAccount;
        this.cdAccounts = temp;

        return this.cdAccounts[this.cdAccounts.length - 1];
    }

    public CDAccount[] getCDAccounts() {
        return this.cdAccounts;
    }

    public int getNumberOfCDAccounts(){
        return this.cdAccounts.length;
    }

    public double getCDBalance(){
        double result = 0.0;
        for (CDAccount account: this.cdAccounts){
            result += account.getBalance();
        }
        return result;
    }

    //endregion

    public double getCombinedBalance(){
        return this.getCheckingBalance() + this.getSavingsBalance() + this.getCDBalance();
    }
}