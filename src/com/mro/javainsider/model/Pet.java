package com.mro.javainsider.model;

public class Pet {
    private String color;

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

    @Override

    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                '}';
    }
}
