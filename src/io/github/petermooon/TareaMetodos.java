package io.github.petermooon;

import io.github.petermooon.abstracts.Animal;
import io.github.petermooon.concretes.Bird;
import io.github.petermooon.concretes.Cat;
import io.github.petermooon.concretes.Dog;

public class TareaMetodos {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.sayName();
        animal.makeSound();



        animal = new Dog();
        animal.sayName();
        animal.makeSound();



        animal = new Bird();
        animal.sayName();
        animal.makeSound();



    }


}
