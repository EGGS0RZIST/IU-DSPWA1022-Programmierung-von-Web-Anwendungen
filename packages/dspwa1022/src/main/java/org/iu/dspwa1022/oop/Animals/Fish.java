package org.iu.dspwa1022.oop.Animals;

public class Fish extends Animal {

    public Fish(String species, boolean isExtinct) {
        super(species, "Fish", isExtinct);
    }

    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    public void swim() {
        System.out.println("Fish swim");
    }

    public void layEggs() {
        System.out.println("Fish lay eggs");
    }

}
