package Java_Lambda;
import java.util.*;
@FunctionalInterface
interface LambdaUsed{
	
	public void areaOfDiffShapes(String input); 
		
}
public class WithLambda {
	public static void main(String[] args) {
		double pi = 3.14;
		double length = 10.0, breadth = 8.0, height = 5.0, radius = 7.0, lateral_height = 10.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a shape to print it's area: ");
		String input = scan.nextLine();
		
		LambdaUsed lu1 = (shape)-> System.out.println("Area of circle is "+pi*radius*radius);
		lu1.areaOfDiffShapes(input);
		
		LambdaUsed lu2 = (shape)-> System.out.println("Area of rectangle is "+length*breadth);
		lu2.areaOfDiffShapes("Rectangle");
		
		LambdaUsed lu3 = (shape)-> System.out.println("Area of triangle is "+0.5*breadth*height);
		lu3.areaOfDiffShapes("Triangle");
		
		LambdaUsed lu4 = (shape)-> System.out.println("Area of cube is "+6*length*length);
		lu4.areaOfDiffShapes("Cube");
		
		LambdaUsed lu5 = (shape)-> System.out.println("Area of sphere is "+4*pi*radius*radius);
		lu5.areaOfDiffShapes("Sphere");
		
		LambdaUsed lu6 = (shape)-> System.out.println("Area of pentagon is "+11.84*length*length);
		lu6.areaOfDiffShapes("Pentagon");
		
		LambdaUsed lu7 = (shape)-> System.out.println("Area of cone is "+pi*radius*(lateral_height+radius));
		lu7.areaOfDiffShapes("Cone");
		
		LambdaUsed lu8 = (shape)-> System.out.println("Area of cylinder is "+2*pi*radius*(radius+height));
		lu8.areaOfDiffShapes("Cylinder");
		
		LambdaUsed lu9 = (shape)-> System.out.println("Area of prism is "+((2*0.5*breadth*height)+(3*length*breadth)));
		lu9.areaOfDiffShapes("Prism");
	}
}
