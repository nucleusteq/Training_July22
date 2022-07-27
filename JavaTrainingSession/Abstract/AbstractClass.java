package JavaTrainingSession.Abstract;
abstract class Shape{
	
	abstract double area();
	abstract double perimeter();
	
}

class Circle extends Shape{
	float radius = 10;
	final double PI = 3.14;

	double perimeter() {
		double peri = 2*PI*radius;
		return peri;
	}

	double area() {
		double ar = PI*radius*radius;
		return ar;
	}
}


class Rectangle extends Shape{
	float length = 5;
	float breadth = 2;
	
	double perimeter() {
		float peri = 2*(length+breadth); 
		return peri;
	}
	double area() {
		double ar = length*breadth;
		return ar;
	}

}

public class AbstractClass {
	public static void main(String[] args) {
		Circle circle_ob = new Circle();
		Rectangle rectangle_ob = new Rectangle();

		System.out.println("Perimeter of circle is "+ circle_ob.perimeter());
		System.out.println("Area of circle is "+ circle_ob.area());
		System.out.println("Perimeter of rectangle is "+ rectangle_ob.perimeter());
		System.out.println("Area of rectangle is "+ rectangle_ob.area());

	}

}
