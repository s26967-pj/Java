import java.lang.Math;

class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    protected double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle circumference: " + c.getCircumference());

        Cylinder cy = new Cylinder(3.0, 7.0);
        System.out.println("Cylinder volume: " + cy.getVolume());
    }
}