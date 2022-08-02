package JavaTrainingSession.IOGenericsLambda;

import java.util.Scanner;

interface Lambda{
	
	
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

class Calcu implements Lambda{
	
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

public class LambdaShapes {
	public static void main(String[] args) {
				
		Calcu cal  = new Calcu();
		
		Scanner sc = new Scanner(System.in);
		int in;
		System.out.println("Available shapes are -");
		System.out.println("1.Triangle\n2.Cube\n3.Rectangle\n4.Circle\n5.Cylinder\n6.Prism\n7.Pentagonic-cyclinder"
				+ "\n8.Cone\n9.Sphere");
		System.out.println("\nChoose any shape -");
		in = sc.nextInt();
		switch (in){
		case 1: {
			System.out.println("Area is "+cal.Triangle());
			break;
		}
		case 2: {
			System.out.println("Area is "+cal.Cube());
			break;
		}
		case 3: {
			System.out.println("Area is "+cal.Rectangle());
			break;
		}
		case 4: {
			System.out.println("Area is "+cal.Circle());
			break;
		}
		case 5: {
			System.out.println("Area is "+cal.Cyclinder());
			break;
		}
		case 6: {
			System.out.println("Area is "+cal.Prism());
			break;
		}
		case 7: {
			System.out.println("Area is "+cal.PentagonicCyclinder());
			break;
		}
		case 8: {
			System.out.println("Area is "+cal.Cone());
			break;
		}
		case 9: {
			System.out.println("Area is "+cal.Sphere());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + in);
		}

	}	

}

