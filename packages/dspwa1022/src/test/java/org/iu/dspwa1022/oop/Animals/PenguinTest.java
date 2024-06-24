package org.iu.dspwa1022.oop.Animals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PenguinTest {

    @Test
    @DisplayName("Pinguin-Flug-Test")
    void flight() {
        var penguin = new Penguin();
        assertThrows(UnsupportedOperationException.class, () -> penguin.fly());
    }

}
