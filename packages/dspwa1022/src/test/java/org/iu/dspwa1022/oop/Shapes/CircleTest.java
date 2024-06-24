package org.iu.dspwa1022.oop.Shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    @DisplayName("Circle wird erfolgreich erstellt")
    void creation() {
        final var circle = new Circle(10);
        assertEquals(10, circle.radius);
    }

    @Test
    @DisplayName("Fläche wird berechnet")
    void area() {
        final var circle = new Circle(10);
        assertEquals(Math.PI * circle.radius * circle.radius, circle.getArea());
    }

    @Test
    @DisplayName("Umfang wird berechnet")
    void perimeter() {
        final var circle = new Circle(10);
        assertEquals(2 * Math.PI * circle.radius, circle.getPerimeter());
    }

}
