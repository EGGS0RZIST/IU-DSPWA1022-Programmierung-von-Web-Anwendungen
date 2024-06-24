package org.iu.dspwa1022.oop.Animals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    @DisplayName("Flug-Test (1)")
    void canFly1() {
        assertFalse(Animal.canFly(new Penguin()));
    }

    @Test
    @DisplayName("Flug-Test (2)")
    void canFly2() {
        assertTrue(Animal.canFly(new Archaeopteryx()));
    }

    @Test
    @DisplayName("Flug-Test (3)")
    void canFly3() {
        assertFalse(Animal.canFly(new Cow()));
    }

    @Test
    @DisplayName("Flug-Test (4)")
    void canFly4() {
        assertFalse(Animal.canFly(new Whale()));
    }

    @Test
    @DisplayName("Flug-Test (5)")
    void canFly5() {
        assertTrue(Animal.canFly(new Dove()));
    }

    @Test
    @DisplayName("Schwimm-Test (1)")
    void canSwim1() {
        assertTrue(Animal.canSwim(new Whale()));
    }

    @Test
    @DisplayName("Schwimm-Test (2)")
    void canSwim2() {
        assertFalse(Animal.canSwim(new Cow()));
    }

    @Test
    @DisplayName("Schwimm-Test (3)")
    void canSwim3() {
        assertTrue(Animal.canSwim(new Penguin()));
    }

    @Test
    @DisplayName("Anzahl Beine (1)")
    void amountOfLegs1() {
        assertEquals(Animal.amountOfLegs(new Cow()), 4);
    }

    @Test
    @DisplayName("Anzahl Beine (2)")
    void amountOfLegs2() {
        assertEquals(Animal.amountOfLegs(new Penguin()), 2);
    }

    @Test
    @DisplayName("Anzahl Beine (3)")
    void amountOfLegs3() {
        assertEquals(Animal.amountOfLegs(new Seahorse()), 0);
    }
}
