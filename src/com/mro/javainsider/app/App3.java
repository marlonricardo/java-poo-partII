package com.mro.javainsider.app;
/*Crie um hierarquia de classes que representam animais de estimacao.
Os animais a serem representados sao dog, cat and fish
todos os animais possuem uma cor associada
O cachorro e o gato podem andar; o peixo pode nadar;
o cachorro e o gato podem falar, cada um a sua maneira; o peixo não
* */

import com.mro.javainsider.model.Dog;
import com.mro.javainsider.model.Cat;
import com.mro.javainsider.model.Fish;

public class App3 {
    public static void main(String[] args) {
        Dog au = new Dog();
        au.setColor("Brown");
        System.out.println(au);
        au.speak();
        au.walk();

        Cat miau = new Cat();
        au.setColor("White");
        System.out.println(au);
        miau.walk();
        miau.speak();

        Fish blu = new Fish();
        blu.setColor("Dourado");
        System.out.println(blu);
        blu.swin();






    }
}
