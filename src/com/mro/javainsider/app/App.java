package com.mro.javainsider.app;

import com.mro.javainsider.model.Account;
import com.mro.javainsider.model.SavingAccount;


public class App {
    public static void main(String[] args) {
        Account a1 = new Account("1645", "16370-8", "Marlon");
        a1.print();

        SavingAccount a2 = new SavingAccount("1645", "16370-8", "Marlon Ricardo");
        a2.setBalance(500);
        a2.print();
    }


}
