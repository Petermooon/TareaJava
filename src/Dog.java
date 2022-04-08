import io.github.petermooon.interfaces.Barkable;

public class Dog extends Animal implements Barkable {



    public void barker() {
        System.out.println("woof");
    }

    public void makeSound() {
        barker();
    }




    public void sayName() {
        System.out.println("Firulais");
    }

}