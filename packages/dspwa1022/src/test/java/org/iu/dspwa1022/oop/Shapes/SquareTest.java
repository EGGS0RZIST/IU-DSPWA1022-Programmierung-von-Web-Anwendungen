package org.iu.dspwa1022.oop.Shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    @DisplayName("Square wird erfolgreich erstellt")
    void creation() {
        final var sq = new Square(10);
        assertTrue(sq instanceof Rectangle);
        assertEquals(10, sq.width);
        assertEquals(10, sq.height);
    }

    @Test
    @DisplayName("Fläche wird berechnet")
    void area() {
        final var sq = new Square(10);
        assertEquals(100, sq.getArea());
    }

    @Test
    @DisplayName("Umfang wird berechnet")
    void perimeter() {
        final var sq = new Square(10);
        assertEquals(40, sq.getPerimeter());
    }

    @Test
    @DisplayName("Umfang wird berechnet")
    void perimeter2() {
        final var sq = new Square(10.5);
        assertEquals(42, sq.getPerimeter());
    }

}
