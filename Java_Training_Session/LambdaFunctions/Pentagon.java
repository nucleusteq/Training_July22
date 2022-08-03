package LambdaFunctions;

public class Pentagon implements Shapes {
	public double area() {
		double num=Math.sqrt(5*(5+2*Math.sqrt(5))*side*side);
		double area=1/4*num;
		return area;
	}
}
