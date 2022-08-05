package JavaTrainingSession.IOGenericsLambda;

import java.util.Scanner;

interface shapeInterface{
	
	final double PIE = 3.14;
	final double r = 2;
	final double b = 3;
	final double h = 4;
	final double a = 5;
	final double l = 6;
	final double p = 7;	
	
	double Triangle();
	double Cube();
	double Rectangle();
	double Circle();
	double Cyclinder();
	double Prism();
	double PentagonicCyclinder();
	double Cone();
	double Sphere();
}

class Calculate implements shapeInterface{
	
	public double Triangle() {
		double val = (b*h)/2;
		return val ;
	}
	

	public double Cube() {
		double val = 6*a*a;
		return val ;
	}

	public double Rectangle() {
		double val = l*b;
		return val ;
	}

	public double Circle() {
		double val = PIE*r*r;
		return val ;
	}
	
	public double Cyclinder() {
		double val = 2*PIE*r*h + 2*PIE*r*r;
		return val ;
	}

	public double Prism() {
		double val = 2*b + p*h;
		return val ;	
	}

	public double PentagonicCyclinder() {
		double val = 5*a*h+((1/2)*Math.sqrt(5*(5+2*Math.sqrt(5))*a*a));
		return val ;	
	}

	public double Cone() {
		double val = PIE*r*(r+Math.sqrt((h*h)+(r*r)));
		return val ;	
	}

	public double Sphere() {
		double val = 4*PIE*r*r;
		return val ;	
	}
}

public class Shapes {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		Calculate cal  = new Calculate();
		
		Scanner sc = new Scanner(System.in);
		String in;
		System.out.println("Available shapes are -");
		System.out.println("1.Triangle\n2.Cube\n3.Rectangle\n4.Circle\n5.Cylinder\n6.Prism\n7.PentagonicCyclinder"
				+ "\n8.Cone\n9.Sphere");
		System.out.println("\nChoose any shape -");
		in = sc.next();
		switch (in){
		case "Triangle": {
			System.out.println("Area is "+cal.Triangle());
			break;
		}
		case "Cube": {
			System.out.println("Area is "+cal.Cube());
			break;
		}
		case "Rectangle": {
			System.out.println("Area is "+cal.Rectangle());
			break;
		}
		case "Circle": {
			System.out.println("Area is "+cal.Circle());
			break;
		}
		case "Cylinder": {
			System.out.println("Area is "+cal.Cyclinder());
			break;
		}
		case "Prism": {
			System.out.println("Area is "+cal.Prism());
			break;
		}
		case "PentagonicCyclinder": {
			System.out.println("Area is "+cal.PentagonicCyclinder());
			break;
		}
		case "Cone": {
			System.out.println("Area is "+cal.Cone());
			break;
		}
		case "Sphere": {
			System.out.println("Area is "+cal.Sphere());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + in);
		}	
		sc.close();
	}	

}

