package org.iu.dspwa1022.oop.Animals;

public class Penguin extends Bird {

    public Penguin() {
        super("Penguin", false);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin sound");
    }

    @Override
    public void fly() {
        System.out.println("Well, ok ...");
    }

    @Override
    public void layEggs() {
        System.out.println("Penguins lay eggs");
    }

}
