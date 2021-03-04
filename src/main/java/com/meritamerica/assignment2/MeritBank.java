package com.meritamerica.assignment2;

import java.util.*;

public class MeritBank {

    public static ArrayList<AccountHolder> accounts = new ArrayList();

    static void addAccountHolder(AccountHolder accountHolder){
        accounts.add(accountHolder);
    }



    static AccountHolder[] getAccountHolders(){
        AccountHolder[] result = new AccountHolder[accounts.size()];
        for (int i = 0; i < accounts.size(); i++){
            result[i] = accounts.get(i);
        }
        return result;
    }

    public static Long getNextAccountNumber() {
        return 0L;
    }

    public static void clearCDOfferings() {
    }

    public static Object getCDOfferings() {
    }
}
