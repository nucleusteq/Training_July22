package student;

public class Circle extends Shape {
	double Area;
	final double pie = 3.14;
	double r = 18;
	double perimeter;


	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter = 2*pie*r;
		System.out.println(perimeter);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		Area = pie*r*r;
		System.out.println(Area);
	}
	public static void main(String args[]) {
		Circle a = new Circle();
		a.perimeter();
		a.area();
		
	}

}

