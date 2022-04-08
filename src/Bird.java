public class Bird extends Animal implements Flyable  {


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