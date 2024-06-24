package org.iu.dspwa1022.oop.Shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeUtilsTest {

    @Test
    @DisplayName("Kreis hat keine Ecken")
    void circleHasCorners() {
        assertFalse(ShapeUtils.hasCorners(new Circle(42)));
    }

    @Test
    @DisplayName("Rechteck hat Ecken")
    void rectangleHasCorners() {
        assertTrue(ShapeUtils.hasCorners(new Rectangle(1, 2)));
    }

    @Test
    @DisplayName("Quadrat hat Ecken")
    void squareHasCorners() {
        assertTrue(ShapeUtils.hasCorners(new Square(2)));
    }

    @Test
    @DisplayName("Gesamtfläche (1)")
    void totalArea1() {
        final var shapes = new ArrayList<Shape>();
        shapes.add(new Square(1));
        assertEquals(ShapeUtils.getTotalArea(shapes), 1);
    }

    @Test
    @DisplayName("Gesamtfläche (2)")
    void totalArea2() {
        final var shapes = new ArrayList<Shape>();
        shapes.add(new Square(10));
        shapes.add(new Rectangle(2, 3));
        assertEquals(ShapeUtils.getTotalArea(shapes), 10 * 10 + 2 * 3);
    }

    @Test
    @DisplayName("Anzahl Kreise (1)")
    void countCircles1() {
        final var shapes = new ArrayList<Shape>();
        shapes.add(new Square(10));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Circle(2));
        assertEquals(ShapeUtils.countCircles(shapes), 1);
    }

    @Test
    @DisplayName("Anzahl Kreise (2)")
    void countCircles2() {
        final var shapes = new ArrayList<Shape>();
        shapes.add(new Square(10));
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Circle(2));
        shapes.add(new Circle(2));
        shapes.add(new Circle(2));
        shapes.add(new Circle(2));
        assertEquals(ShapeUtils.countCircles(shapes), 5);
    }

    @Test
    @DisplayName("Größte Fläche (1)")
    void largestArea1() {
        final var shapes = new ArrayList<Shape>();

        var square = new Square(10);
        var rect = new Rectangle(2, 3);
        var circle = new Circle(2);

        shapes.add(rect);
        shapes.add(circle);
        shapes.add(square);

        assertEquals(ShapeUtils.findLargestArea(shapes), square);
    }

    @Test
    @DisplayName("Größte Fläche (2)")
    void largestArea2() {
        final var shapes = new ArrayList<Shape>();

        var square = new Square(10);
        var rect = new Rectangle(2, 5);

        shapes.add(square);
        shapes.add(rect);

        assertEquals(ShapeUtils.findLargestArea(shapes), square);
    }

    @Test
    @DisplayName("Größte Fläche (3)")
    void largestArea3() {
        final var shapes = new ArrayList<Shape>();

        var square = new Square(10);
        var rect = new Rectangle(2, 5);
        var rect2 = new Rectangle(12, 12);
        var rect3 = new Rectangle(12, 12);

        shapes.add(rect);
        shapes.add(square);
        shapes.add(rect3);
        shapes.add(rect2);

<<<<<<< HEAD:packages/Challenges/app/src/test/java/challenges/Shapes/ShapeUtilsTest.java
        assertEquals(ShapeUtils.findLargestArea(shapes), square);
=======
        assertEquals(ShapeUtils.findLargestArea(shapes), rect3);
>>>>>>> 41631325515f9cb81468990f6cdfac5de022116f:packages/dspwa1022/src/test/java/org/iu/dspwa1022/oop/Shapes/ShapeUtilsTest.java
    }
}
