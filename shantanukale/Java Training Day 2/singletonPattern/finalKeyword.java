package singletonPattern;
final class Circle{
	final double PI = 3.141592;
	final double areaOfCircle(double radius) {
		double area = PI*radius*radius;
		return area;
	}
	
}
public class finalKeyword {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.areaOfCircle(10.0));
	}

}
