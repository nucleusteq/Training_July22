package Shape;

import java.util.Scanner;

interface FunctionLambda {
	double pi = 3.14159265359;
	void rect(int a,int b);
//	void Circle(int a,int b);
//	void cone(int a,int b);
//	void cyclinder(int a,int b);
//	void Pentanagon_cyclinder(int a,int b);
//	void prism(int a,int b);
//	void sphre(int a,int b);
//	void triangle(int a,int b);
//	



//public double circleOperation(double radius, Circle c) {
	//return c.get(radius);
////}
//double calculate(double a, double b);    
//


}

public class LambdaFunction {
	

	

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		
		String ShapeSet = sc.nextLine();
		switch(ShapeSet) {
		case "Circle":
		{

			FunctionLambda obj =( int a, int b)->{
		
			System.out.println("Enter any shape" +a*b);};
			obj.rect(4,5);
		}
		
		
		}
		
		
		
		
		
	}
}
