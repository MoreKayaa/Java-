// Base Class Shape
public abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

// Subclass Circle
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// Subclass Cylinder
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    void draw() {
        System.out.println("Drawing a cylinder with radius " + radius + " and height " + height);
    }

    double calculateArea() {
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        shape1.draw();
        System.out.println("Area of shape1: " + shape1.calculateArea());

        Shape shape2 = new Cylinder(5, 10);
        shape2.draw();
        System.out.println("Area of shape2: " + shape2.calculateArea());
    }
}