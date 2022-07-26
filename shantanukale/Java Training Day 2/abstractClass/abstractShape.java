package abstractClass;
abstract class Shape{
	
	abstract double perimeter();
	abstract double area();
	
}
class Rectangle extends Shape{
	int length = 8, breadth = 10;
	
	@Override
	double perimeter() {
		int perimeter = 2*(length+breadth); 
		return perimeter;
	}
	@Override
	double area() {
		double area = length*breadth;
		return area;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	
}
class Circle extends Shape{
	int radius = 10;
	@Override
	double perimeter() {
		double perimeter = 2*3.14*radius;
		return perimeter;
	}

	@Override
	double area() {
		double area = 3.14*radius*radius;
		return area;
	}
	
	
}
public class abstractShape {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.area());
		
		Rectangle rect = new Rectangle();
		System.out.println(rect.perimeter());
	}

}
