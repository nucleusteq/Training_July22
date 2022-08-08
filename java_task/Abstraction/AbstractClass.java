package Abstraction;

import java.util.Scanner;

abstract class Shape {
    abstract double area(double length, double width);

    abstract double area(double radius);

    abstract double perimeter(double length, double width);

    abstract double perimeter(double radius);
}

class Rectangle extends Shape {
    double area(double length, double width) {
        double areaOfRectangle = length * width;
        return areaOfRectangle;
    }

    double perimeter(double length, double width) {
        double perimeterOfRectangle = 2 * (length + width);
        return perimeterOfRectangle;
    }

    double area(double radius) {
        return 0.0;
    }

    double perimeter(double radius) {
        return 0.0;
    }
}

class Circle extends Shape {
    final double PIE_VALUE = 3.14;

    double area(double radius) {
        double areaOfCircle = PIE_VALUE * radius * radius;
        return areaOfCircle;
    }

    double perimeter(double radius) {
        double perimeterOfCircle = 2 * PIE_VALUE * radius;
        return perimeterOfCircle;
    }

    double area(double length, double width) {
        return 0.0;
    }

    double perimeter(double length, double width) {
        return 0.0;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        double lengthOfRectangle = sc.nextDouble();
        System.out.println("Enter Width of Rectangle:");
        double widthOfRectangle = sc.nextDouble();
        System.out.println("Enter Radius of Circle:");
        double radiusOfCircle = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        System.out.println("Area of rectangle is: " + rectangle.area(lengthOfRectangle, widthOfRectangle));
        System.out.println("Perimeter of rectangle is: " + rectangle.perimeter(lengthOfRectangle, widthOfRectangle));

        Circle circle = new Circle();
        System.out.println("Area of Circle is: " + circle.area(radiusOfCircle));
        System.out.println("Perimeter of Circle is: " + circle.perimeter(radiusOfCircle));
    }
}