package org.iu.dspwa1022.oop.Shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    @DisplayName("Rectangle wird erfolgreich erstellt")
    void creation() {
        final var rect = new Rectangle(2, 3);
        assertEquals(2, rect.width);
        assertEquals(3, rect.height);
    }

    @Test
    @DisplayName("Fläche wird berechnet")
    void area() {
        final var rect = new Rectangle(2, 3);
        assertEquals(6, rect.getArea());
    }

    @Test
    @DisplayName("Umfang wird berechnet")
    void perimeter() {
        final var rect = new Rectangle(2, 3);
        assertEquals(10, rect.getPerimeter());
    }

}
