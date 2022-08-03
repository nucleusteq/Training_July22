package abstractuse;

abstract class Shape {
    private String name;

    public Shape() {
        this.name = "Unknown shape";
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {

        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a circle...");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}

class ShapeUtil {
    public static void drawShapes(Shape[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i].draw();
        }
    }

    public static void printShapeDetails(Shape[] list) {
        for (int i = 0; i < list.length; i++) {
            String name = list[i].getName();
            double area = list[i].getArea();
            double perimeter = list[i].getPerimeter();

            // Print details
            System.out.println("Name: " + name);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}

public class Shaper {

    public static void main(String[] args) {
        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Rectangle(2.0, 4.0);
        shapeList[1] = new Circle(5.0);
        ShapeUtil.drawShapes(shapeList);
        ShapeUtil.printShapeDetails(shapeList);
    }
}