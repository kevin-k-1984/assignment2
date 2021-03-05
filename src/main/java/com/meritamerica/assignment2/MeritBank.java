package com.meritamerica.assignment2;

import java.util.*;

public class MeritBank {

    private static AccountHolder[] accountHolders = new AccountHolder[0];
    private static CDOffering[] cdOfferings = new CDOffering[0];
    private static long nextAccountNumber = 0L;

    static void addAccountHolder(AccountHolder accountHolder){
        AccountHolder[] temp = new AccountHolder[MeritBank.accountHolders.length + 1];

        for (int i = 0; i < MeritBank.accountHolders.length; i++) temp[i] = MeritBank.accountHolders[i];

        temp[temp.length - 1] = accountHolder;
        MeritBank.accountHolders = temp;
    }

    public static AccountHolder[] getAccountHolders(){
        if (accountHolders.length == 0 ) return null;
        return MeritBank.accountHolders;
    }

    public static CDOffering[] getCDOfferings() {
        if (cdOfferings.length == 0) return null;
        return MeritBank.cdOfferings;
    }

    // TODO: 3/5/2021 getBestCDOffering 
    public static CDOffering getBestCDOffering(double depositAmount){
        if (cdOfferings.length == 0) return null;
        double value = 0.0;
        double highestValue = 0.0;
        int index = 0;
        for (int i = 0; i < cdOfferings.length; i++){
            value = futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
            if (value > highestValue){
                highestValue = value;
                index = i;
            }
        }
        return cdOfferings[index];
    }

    // TODO: 3/4/2021 getSecondBestCDOffering
    public static CDOffering getSecondBestCDOffering(double depositAmount){
        return null;
    }

    public static void clearCDOfferings() {
        MeritBank.cdOfferings = new CDOffering[0];
    }

    public static void setCDOfferings(CDOffering[] cdOfferings) {
        MeritBank.cdOfferings = cdOfferings;
    }

    public static long getNextAccountNumber() {
        return nextAccountNumber++;
    }

    public static double totalBalances(){
        double total = 0.0;
        for (AccountHolder holder : accountHolders) {
            total += holder.getCombinedBalance();
        }
        return total;
    }

    public static double futureValue(double presentValue, double interestRate, int term) {
        return presentValue * Math.pow(1 + interestRate, term);
    }






}
