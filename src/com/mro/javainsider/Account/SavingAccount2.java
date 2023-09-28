package com.mro.javainsider.Account;

public class SavingAccount2 extends Account2 {
    public SavingAccount2(double balance) {
        super(balance);
    }

    @Override
    double rate() {
        return 0.05;
    }

}
