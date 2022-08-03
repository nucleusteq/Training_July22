package Lamda;
import java.util.Scanner;


	interface area{
		double pi=3.14;
		double x= 7;
		double y=9;
		double area(double a,double b);
		
	}
	class circle implements area{
		public double area(double x,double y) {
			return pi *x *x;
		}
		
	}
	class rect implements  area{
		public double area(double x, double y) {
			return x*y;
		}
	}
	class square implements  area{
		public double area(double x, double y) {
			return 5*5;
		}
	}
	class trian implements  area{
		public double area(double x, double y) {
			return (x*y)/2;
		}
	}
	class cyl implements  area{
		public double area(double x, double y) {
			return 2*pi*x*(x+y);
		}
	}
	class prism implements area{
		public double area(double x,double y) {
			return (2*x*y) +(x*y);
		}
		
	}
	class cone implements  area{
		public double area(double x, double y) { 
			return pi*x*(x+Math.sqrt((x*x + y*y)));
		}
	}
	class pentcyl implements  area{
		public double area(double x, double y) {
			return x;
		}
	}
	class cube implements  area{
		public double area(double x, double y) {
			return 6*x*x;
		}
	}
	public class CalculateArea {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter shape for Calculate Area :");
		String s= sc.next();
		circle c= new circle();
		rect r= new rect();
		trian t=new trian();
		square sq= new square();
		cyl l= new cyl();
		pentcyl pc= new pentcyl();
		cone co= new cone();
		prism pr=new prism();
		cube cb= new cube();
		double a=0;
		switch(s) {
	case "Circle" :
			System.out.println("Area of Circle :" +c.area(2.5, 2.5));
			break;
			
		
	case "Rectangle" :
		System.out.println("Area of Rectangle :" + r.area(7, 8));
		break;

	case "Square" :
		System.out.println("Area of Square :" + sq.area(7, 8));
		break;
		
	
	case "Triangle" :
		System.out.println("Area of Triangle :" + t.area(7, 8));
		break;
		
	
	case "Cylinder":
		System.out.println("Area of Cylinder :" + l.area(7, 8));
		break;
		
	
	case "Cone":
		System.out.println("Area of Cone :" +co.area(2.5, 2.5));
		break;
		
	
	case "Prism" :
		System.out.println("Area of Prism :" +pr.area(2.5, 2.5));
		break;
		
	
	case "Pentagnal cylinder" :
		System.out.println("Area of Pentagonal cyl:" +pc.area(2.5, 2.5));
		break;
		
	case "Cube" :
		System.out.println("Area of Cube :" +cb.area(2.5, 2.5));
		break;
		
	
		default:
		System.out.println("Better Luck Next Time ");
			
		}
	}
}
