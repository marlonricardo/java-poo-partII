package com.mro.javainsider.model;

public class Cat extends EarthPet{

    public void swin(){
        System.out.println("I can swin...");
    }

    @Override
    public void speak() {
        System.out.println("Miau, miau, miau...");
    }

    @Override
    public void sleep(int time) {

    }
}
