package com.mro.javainsider.Account;

public abstract class Account2 {
    private double balance;

    public Account2(double balance){
        this.balance = balance;
    }

    //public abstract void updateBalance();

    public double getBalance() {
        return balance;
    }
    public void updateBalance(){
        balance += balance  * rate();
    }

    abstract double rate();


}
