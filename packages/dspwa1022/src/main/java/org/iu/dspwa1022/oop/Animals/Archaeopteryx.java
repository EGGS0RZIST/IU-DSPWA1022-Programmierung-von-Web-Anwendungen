package org.iu.dspwa1022.oop.Animals;

public class Archaeopteryx extends Bird {

    public Archaeopteryx() {
        super("Archaeopteryx", true);
    }

    @Override
    public void makeSound() {
        System.out.println("Archaeopteryx sound");
    }

    @Override
    public void fly() {
        final int ANCIENT_FLIGHT_CALCULATION = 1 / 0;
        System.out.println("Archaeopteryx flies " + ANCIENT_FLIGHT_CALCULATION + " meters");
    }

    @Override
    public void layEggs() {
        System.out.println("Archaeopteryx lays eggs");
    }

}
