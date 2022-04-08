package io.github.petermooon.concretes;

import io.github.petermooon.abstracts.Animal;
import io.github.petermooon.interfaces.Meowable;

public class Cat extends Animal implements Meowable {


    public void meow() {
        System.out.println("miauuuuuuuuuu");
    }

    public void makeSound() {
   meow();
}

    public void sayName() {
        System.out.println("dante");
    }



}