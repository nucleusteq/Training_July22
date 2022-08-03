package LambdaFunctions;

public class Cylinder implements Shapes{
	public double area() {
		double area=(2*PI*radius*height)+2*PI*radius*radius;
		return area;
	}
}
