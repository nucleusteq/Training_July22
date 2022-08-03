package LambdaFunctions;

public class Cone implements Shapes {
	public double area() {
		double area=PI*radius*(radius+Math.sqrt((height*height)+(radius*radius)));
		return area;
	}
}
