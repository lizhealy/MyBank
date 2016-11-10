package com.netgalaxystudios.intern.mybank;

import android.util.Log;

/**
 * Created by Intern on 11/10/16.
 */

public class SavingsAccount extends BankAccount {
    private static final String TAG = "SavingsAccount";

    @Override
    public void withdraw(double amount){
        if (numberOfWithdraws() >= 3) {
            return;
        }
        super.withdraw(amount);
    }
}
