package challenges.Shapes;

import java.util.ArrayList;
import java.util.List;

public final class ShapeUtils {

    public static boolean hasCorners(Shape shape) {
        if (shape instanceof Circle) {
            return false;
        }
        else {
            return true;
        }
    }

    public static double getTotalArea(List<Shape> shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static int countCircles(List<Shape> shapes) {
        int countCircles = 0;

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                countCircles++;
            }
        }
        return countCircles;
    }

    /**
     * Wenn mehrere Formen die gleiche Fläche haben, wird die erste Form
     * zurückgegeben.
     */
    public static Shape findLargestArea(List<Shape> shapes) {
        Shape largestShape = shapes.get(0);

        for (Shape shape : shapes) {
            if (shape.getArea() > largestShape.getArea()) {
                largestShape = shape;
            }
        }
        return largestShape;
    }

}
