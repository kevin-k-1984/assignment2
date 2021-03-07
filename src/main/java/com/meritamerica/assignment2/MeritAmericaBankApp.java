package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {

		// Add 5 CDOfferings to MeritBank
		CDOffering[] CDOfferings = new CDOffering[5];

		CDOfferings[0] = new CDOffering(1,1.8/100);
		CDOfferings[1] = new CDOffering(2,1.9/100);
		CDOfferings[2] = new CDOffering(3,2.0/100);
		CDOfferings[3] = new CDOffering(5,2.5/100);
		CDOfferings[4] = new CDOffering(10,2.2/100);

		MeritBank.setCDOfferings(CDOfferings);

		//Instantiate a new AccountHolder (ah1)
		AccountHolder ah1 = new AccountHolder("Tom", "Dallas", "Crank", "123-45-6789");

		//Add a checking account with an opening balance of $1,000
		//as well as a savings account with an opening balance of $10,000 to ah1
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);

		//Add a checking account with an opening balance of $5,000
		//as well as a savings account with an opening balance of $50,000 to ah1
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);

		//Add a checking account with an opening balance of $50,000
		//as well as a savings account with an opening balance of $500,000 to ah1
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);

		//Add a checking account with an opening balance of $5,000
		//as well as a savings account with an opening balance of $50,000 to ah1
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);

		// Confirm last checking and savings accounts were not created
		CheckingAccount[] ca = ah1.getCheckingAccounts();
		SavingsAccount[] sa = ah1.getSavingsAccounts();

		for (CheckingAccount acc: ca){
			System.out.println("Checking Balance in ah1: " + acc.getBalance());
		}
		System.out.println();
		for (SavingsAccount acc: sa){
			System.out.println("Savings Balance in ah1: " + acc.getBalance());
		}
		System.out.println();

		//Add the best CD offering as a CD account on ah1
		ah1.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);

		//Add ah1 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah1);

		//Instantiate a new AccountHolder (ah2)
		AccountHolder ah2 = new AccountHolder("Grayson", "Ray", "West", "789-45-6123");

		//Add a checking account with an opening balance of $1,000
		//as well as a savings account with an opening balance of $10,000 to ah2
		ah2.addCheckingAccount(new CheckingAccount(1000));
		ah2.addSavingsAccount(new SavingsAccount(10000));

		//Add the second best CD offering as a CD account on ah2
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);

		//Add ah2 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah2);

		//Clear the CDs being offered by MeritBank
		MeritBank.clearCDOfferings();

		//Instantiate a new AccountHolder (ah3)
		AccountHolder ah3 = new AccountHolder("Obi", "Wan", "Kenobi", "222-22-2222");

		//Add the second best CD offering as a CD account on ah3
		ah3.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);

		// Confirm a CD account was not created on ah3
		System.out.println("Number of CD Accounts in ah3: " + ah3.getCDAccounts().length + "\n");

		//Add a checking account with an opening balance of $1,000
		//as well as a savings account with an opening balance of $10,000 to ah3
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);

		//Add ah3 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah3);

		//Get the total balance of all accounts held by Merit Bank’s account holders
		System.out.println("Total cash with Merit Bank: " + MeritBank.totalBalances() + "\n");
	}
}