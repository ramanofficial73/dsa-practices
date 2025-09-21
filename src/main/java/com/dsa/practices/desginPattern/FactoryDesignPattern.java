package com.dsa.practices.desginPattern;

public class FactoryDesignPattern {

    // Step 1: Product Interface
    interface Shape {
        void draw();
    }

    // Step 2: Concrete Products
    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    static class Square implements Shape {
        public void draw() {
            System.out.println("Drawing a Square");
        }
    }


    // Step 3: Factory Class
    public static class ShapeFactory {
        // Factory method
        public Shape getShape(String shapeType) {
            if (shapeType == null) {
                return null;
            }
            switch (shapeType.toUpperCase()) {
                case "CIRCLE":
                    return new Circle();
                case "RECTANGLE":
                    return new Rectangle();
                case "SQUARE":
                    return new Square();
                default:
                    throw new IllegalArgumentException("Unknown shape type: " + shapeType);
            }
        }
    }

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Get Circle object and call its method
        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        // Get Rectangle object and call its method
        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();

        // Get Square object and call its method
        Shape square = factory.getShape("SQUARE");
        square.draw();
    }
}
