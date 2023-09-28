package com.mro.javainsider.Account;

public class CheckingAccount extends Account2 {
    private double rate;
    public CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    @Override
    double rate() {
        return rate;
    }

//    @Override
//    public void updateBalance() {
//        double balance =  getBalance() ;
//    }
}
