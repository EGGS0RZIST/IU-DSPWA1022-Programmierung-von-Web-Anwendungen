package org.iu.dspwa1022.oop.Animals;

public class Seahorse extends Fish {

    public Seahorse() {
        super("Seahorse", false);
    }

    @Override
    public void makeSound() {
        System.out.println("Whinny");
    }

    @Override
    public void swim() {
        System.out.println("Seahorse swim");
    }

    @Override
    public void layEggs() {
        System.out.println("Seahorse lay eggs");
    }

}
