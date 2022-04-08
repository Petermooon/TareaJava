package io.github.petermooon.concretes;

import io.github.petermooon.abstracts.Animal;
import io.github.petermooon.interfaces.Flyable;

public class Bird extends Animal implements Flyable {


    public void trill() {
        System.out.println("trill/sing");
    }



    public void makeSound() {

       trill();
    }



    public void sayName() {
        System.out.println("Piolin");
    }



}