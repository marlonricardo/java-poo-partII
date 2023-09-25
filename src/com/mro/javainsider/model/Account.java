package com.mro.javainsider.model;

public class Account{
    private String number;
    private String agency;
    private String owner;
    protected double balance;

    public Account() {
    }

    public Account(String agency, String number, String owner) {
        this.agency = agency;
        this.number = number;
        this.owner = owner;
    }

    public Account(String agency, String number) {
        this(agency, number, null);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalStateException("Você não pode despositar valores negativos...");
        }

    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            throw new IllegalStateException("Saldo insuficiente!");
        }
        balance -= amount;
    }

    public void transfer(Account destNumber, double amount) {
        withdraw(amount);
        destNumber.deposit(amount);
    }

    public void print() {
        System.out.println("Owner: " + owner);
        System.out.println("Agency/Number: " + agency + " - " + number);
        System.out.println("Balance: R$" + balance);
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", agency='" + agency + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}