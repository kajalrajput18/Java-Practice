// Polymorphism:-) Allows objects to behave differently based on their specific
// class type.
// Types:- 1. Compile-time Polymorphism (Method Overloading) 2. Run-time
// Polymorphism (Method Overriding)
// 1. Method Overloading:-) Same method name but different parameters (number,
// type, or order).
// 2. Method Overriding:-) It allows Subclass to provide a specific
// implementation of a method that is already defined in its parent class.

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    double calculateArea() {
        return length * width;
    }
}

public class day4 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

    }
}