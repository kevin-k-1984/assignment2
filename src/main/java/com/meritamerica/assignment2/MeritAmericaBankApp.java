package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {

		CDOffering[] CDOfferings = new CDOffering[5];

		CDOfferings[0] = new CDOffering(1,1.8/100);
		CDOfferings[1] = new CDOffering(2,1.9/100);
		CDOfferings[2] = new CDOffering(3,2.0/100);
		CDOfferings[3] = new CDOffering(5,2.5/100);
		CDOfferings[4] = new CDOffering(10,2.2/100);

		MeritBank.setCDOfferings(CDOfferings);

		AccountHolder ah1 = new AccountHolder("Tom", "Dallas", "Crank", "123-45-6789");
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);



//		MeritBank.addAccountHolder();

	}
}