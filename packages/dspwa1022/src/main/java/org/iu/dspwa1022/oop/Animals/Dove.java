package org.iu.dspwa1022.oop.Animals;

public class Dove extends Bird {

    public Dove() {
        super("Dove", false);
    }

    @Override
    public void makeSound() {
        System.out.println("Gruu gruuu");
    }

    public void fly() {
        System.out.println("The dove is flying");
    }

    @Override
    public void layEggs() {
        System.out.println("The dove is laying eggs");
    }

}
