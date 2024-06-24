package org.iu.dspwa1022.oop.Animals;

public class Cow extends Mammal {

    public Cow() {
        super("Cow", false);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

}
