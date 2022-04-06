public abstract class Bird extends Animal implements Flyable {

    public abstract void sayName();{
        System.out.println("Piolin");}

    public abstract void makeSound();{
        System.out.println("trill");}

    public abstract void move();{
        System.out.println("fly");}

}