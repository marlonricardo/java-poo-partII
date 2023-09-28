package com.mro.javainsider.app;

import com.mro.javainsider.model.Cat;
import com.mro.javainsider.model.Dog;

public class App4 {
    public static void main(String[] args) {
        Dog au = new Dog();
        au.feed(10);
        au.feed(5);
        System.out.println(au.getAmountEaten());

        Cat miau = new Cat();
        miau.feed(9);
        miau.feed(5);
        System.out.println(miau.getAmountEaten());
    }
}
