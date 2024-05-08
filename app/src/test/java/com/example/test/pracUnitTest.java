package com.example.test;

import static org.junit.Assert.assertEquals;

import com.example.shapes.Circle;
import com.example.shapes.Rectangle;
import com.example.shapes.Shape;
import com.example.shapes.ShapeColorMapper;

import org.junit.Test;

public class pracUnitTest {
    @Test
    public void testCalculateArea() {
        // Mock user input
        String selectedShape = "Circle";
        // For Circle
        double circleRadius = 5;
        // For Rectangle
        double rectangleWidth = 4;
        double rectangleLength = 6;

        // Create shape objects based on user input
        Shape shape;
        if (selectedShape.equals("Circle")) {
            shape = new Circle(circleRadius);
        } else if (selectedShape.equals("Rectangle")) {
            shape = new Rectangle(rectangleWidth, rectangleLength);
        } else {
            // Handle unsupported shape
            throw new IllegalArgumentException("Unsupported shape: " + selectedShape);
        }

        // Invoke method under test
        double area = shape.calculateArea();

        // Assert
        // Verify that the correct area is calculated
        if (selectedShape.equals("Circle")) {
            assertEquals(78.5398, area, 0.0001); // Expected area for circle with radius 5
        } else if (selectedShape.equals("Rectangle")) {
            assertEquals(24, area, 0.0001); // Expected area for rectangle with width 4 and length 6
        }
    }
    @Test
    public void testShapeColorMapping() {
        // Create Circle and Rectangle objects
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Create a ShapeColorMapper object
        ShapeColorMapper mapper = new ShapeColorMapper();

        // Map the shapes to colors
        String circleColor = mapper.mapShapeToColor(circle);
        String rectangleColor = mapper.mapShapeToColor(rectangle);

        // Assert
        // Verify that the shapes are correctly mapped to their corresponding colors
        assertEquals("Blue", circleColor); // Expected color for Circle
        assertEquals("Red", rectangleColor); // Expected color for Rectangle
    }


}
