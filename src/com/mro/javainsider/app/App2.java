package com.mro.javainsider.app;

import com.mro.javainsider.model.Account;

public class App2 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setOwner("Carlos");
        a1.setNumber("123");
        a1.setAgency("1645");
        a1.setBalance(1000);
        //toda classe herda Objects, portanto, podemos sobrescrever métodos de Objects, por exemplo o método toString()
        System.out.println(a1);


    }
}
