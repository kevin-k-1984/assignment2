package com.meritamerica.assignment2;

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

    public static CDOffering getBestCDOffering(double depositAmount){
        if (cdOfferings.length == 0) return null;

        double value;
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

    public static CDOffering getSecondBestCDOffering(double depositAmount){
        if (cdOfferings.length <= 1) return null;

        double[] offeringValues = new double[cdOfferings.length];
        int[] index = new int[cdOfferings.length];
        double tempDouble;
        int tempInt;

        for (int i = 0; i < cdOfferings.length; i++){
            offeringValues[i] = MeritBank.futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
            index[i] = i;
        }

        for(int i = 0; i < cdOfferings.length; i++ ){
            for(int j = i + 1; j < cdOfferings.length; j++){

                if(offeringValues[i] > offeringValues[j]){
                    tempDouble = offeringValues[i];
                    offeringValues[i] = offeringValues[j];
                    offeringValues[j] = tempDouble;

                    tempInt = index[i];
                    index[i] = index[j];
                    index[j] = tempInt;
                }
            }
        }

        return cdOfferings[index[index.length - 2]];
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
