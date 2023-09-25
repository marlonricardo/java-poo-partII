package com.mro.javainsider.model;

public class SavingAccount extends Account{
    private double rate = 1.2;

    public SavingAccount(String agency, String number, String owner){
        super(agency, number, owner);
    }

    public double getRate(){
        return rate;
    }
    public void setRate(double rate){
        this.rate = rate;
    }

    @Override//sobrescrever método da super classe...
    public void setBalance(double balance) {
        this.balance = balance * rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rate: " + rate);
    }
}
