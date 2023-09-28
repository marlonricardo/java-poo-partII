package com.mro.javainsider.model;

public abstract class Pet {
    private String color;
    private int amountEaten;

    public Pet(){}
    public Pet(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed(int amount){
       amountEaten += amount;
    }

    public int getAmountEaten(){
       return  amountEaten;
    }

    public abstract void sleep(int time);

    @Override

    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                '}';
    }
}
