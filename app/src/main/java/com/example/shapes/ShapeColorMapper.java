package com.example.shapes;

public class ShapeColorMapper {

    public String mapShapeToColor(Shape shape) {
        if (shape instanceof Circle) {
            return "Blue"; // Example color for Circle
        } else if (shape instanceof Rectangle) {
            return "Red"; // Example color for Rectangle
        } else {
            throw new IllegalArgumentException("Unsupported shape: " + shape.getClass().getSimpleName());
        }
    }
}
