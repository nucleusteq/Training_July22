import java.util.Scanner;
final class Circle{
	final double PI=3.14;
	final double areaOfCircle(double radius){
		double area=PI*radius*radius;
		return area;
	}
}	

class finalclass{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius Of Circle");
		double radius=sc.nextDouble();
		Circle circle=new Circle();
		System.out.println("Area of circle is: "+circle.areaOfCircle(radius));
	}
}
