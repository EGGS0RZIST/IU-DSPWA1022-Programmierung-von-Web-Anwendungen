package org.iu.dspwa1022.oop.Animals;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArchaeopteryxTest {

    @Test
    @DisplayName("Archaeopteryx-Flug-Test")
    void flight() {
        var a = new Archaeopteryx();
        assertDoesNotThrow(() -> a.fly());
    }
}
