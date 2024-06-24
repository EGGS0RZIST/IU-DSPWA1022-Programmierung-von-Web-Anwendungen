package org.iu.dspwa1022.oop.Animals;

public abstract class Animal {

    final String species;
    final String biologicalClass;
    final boolean isExtinct;

    protected Animal(
            String species,
            String biologicalClass,
            boolean isExtinct) {
        this.species = species;
        this.biologicalClass = biologicalClass;
        this.isExtinct = isExtinct;
    }

    public abstract void makeSound();

    public static boolean canSwim(Animal animal) {
        return animal.species.equals("Fish");
    }

    public static boolean canFly(Animal animal) {
        return false;
    }

    public static int amountOfLegs(Animal animal) {
        return 4;
    }

}
