package com.mro.javainsider.app;

import com.mro.javainsider.Account.CheckingAccount;
import com.mro.javainsider.Account.SavingAccount2;

public class App5 {
    public static void main(String[] args) {
        CheckingAccount conta1 = new CheckingAccount(0.05);
        System.out.println(conta1.getBalance());
        conta1.updateBalance();
        conta1.updateBalance();
        System.out.println(conta1.getBalance());

        SavingAccount2 conta2 = new SavingAccount2(100);
        System.out.println(conta2.getBalance());
        conta2.updateBalance();
        conta2.updateBalance();
        System.out.println(conta2.getBalance());




        }
}
