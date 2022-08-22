package IOGenericsLambda;

import java.util.Scanner;

interface tempInterface {
	
	final double PIE = 3.14;
	final double r = 2;
	final double b = 3;
	final double h = 4;
	final double a = 5;
	final double l = 6;
	final double p = 7;

	void commonName();

}

public class LambdaShapes {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String in;
		System.out.println("Available shapes are -");
		System.out.println("1.Triangle\n2.Cube\n3.Rectangle\n4.Circle\n5.Cylinder\n6.Prism\n7.Pentagonic-cyclinder"
				+ "\n8.Cone\n9.Sphere");
		System.out.println("\nChoose any shape -");
		in = sc.next();

		switch (in) {
		case "Triangle": {
			{
				tempInterface t = () -> {
					System.out.println("Area is : " + (tempInterface.b*tempInterface.h)/2);
				};
				t.commonName();
			}
			break;
		}
		case "Cube": {
			{
				tempInterface t = () -> {
					System.out.println("Area is : " + 6*(tempInterface.a*tempInterface.a));
				};
				t.commonName();
			}
			break;
		}
		case "Rectangle": {
			{
				tempInterface t = () -> {
					System.out.println("Area is : " + tempInterface.l*tempInterface.b);
				};
				t.commonName();
			}
			break;
		}
		case "Circle": {
			{
				tempInterface t = () -> {
					System.out.println("Area is : " + tempInterface.PIE*tempInterface.r*tempInterface.r);
				};
				t.commonName();
			}
			break;
		}
		case "Cylinder": {
			{
				tempInterface t = () -> {
					double cal = 2*tempInterface.PIE*tempInterface.r*tempInterface.h + 
							2*tempInterface.PIE*tempInterface.r*tempInterface.r;
					System.out.println("Area is : " + cal);
				};
				t.commonName();
			}
			break;
		}
		case "Prism": {
			{
				tempInterface t = () -> {
					System.out.println("Area is : " + 2*tempInterface.b*tempInterface.p*tempInterface.h);
				};
				t.commonName();
			}
			break;
		}
		case "PentagonicCyclinder": {
			{
				tempInterface t = () -> {
					double ne = 5*tempInterface.a*tempInterface.h+((1/2)*Math.sqrt(5*(5+2*Math.sqrt(5))*tempInterface.a*tempInterface.a));
					System.out.println("Area is : " + ne);
				};
				t.commonName();
			}
			break;
		}
		case "Cone": {
			{
				tempInterface t = () -> {
					double emp = tempInterface.PIE*tempInterface.r*(tempInterface.r+Math.sqrt((tempInterface.h*tempInterface.h)+(tempInterface.r*tempInterface.r)));
					System.out.println("Area is : " + emp);
				};
				t.commonName();
			}
			break;
		}
		case "Sphere": {
			{
				tempInterface t = () -> {
					System.out.println("Area is : " + 4*tempInterface.PIE*tempInterface.r*tempInterface.r);
				};
				t.commonName();
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + in);
		}
		sc.close();
	}
}
