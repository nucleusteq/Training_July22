
import java.util.Scanner;
import java.lang.*;
 interface shape 
{
  double pi = 3.14;  
}

class Rectangle implements shape{
	
  public double area(double l, double h) {
	  return l*h;
  }	
}

class Circle implements shape{

	public double area(double l, double h) {
		return (pi*l*h);
	}	
}

class Cube implements shape{
	
	public double area(double l, double h) {
		return 6*l*l;
	}	
}

class Prism implements shape{

	public double area(double l, double h) {
		return 0;	
	}	
}

class Pentagon implements shape{

	public double area(double l, double h) {
		return (Math.sqrt(5+5+2*(Math.sqrt(5)))/4)*l*l;
	}	
}

class Triangle implements shape{

	public double area(double l, double h) {
		return (l*h)/2;
	}	
}

class Cone implements shape{

	public double area(double h, double r) {
		return pi*r*(r+Math.sqrt(h*h+r*r));
	}
}

class Cylinder implements shape{

	public double area(double h, double r) {
		return 2*pi*r*h+2*pi*r*r;
	}	
}

public class CalculateArea
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch(i) 
		{
		case 1:
		Rectangle a1 = new Rectangle();
	    System.out.println("The area of Rectangle is: "+a1.area(5, 10));
		break;
		
        case 2:
        Circle c1 = new Circle();
        System.out.println("The area of Circle is: "+c1.area(5, 10));
	    break;
	   
        case 3:
    	Cube c2 = new Cube();
        System.out.println("The area of Circle is: "+c2.area(5, 10));
    	break;  
    	   
        case 4:
        Prism p1 = new Prism();
        System.out.println("The area of Prism is: "+p1.area(5, 10));
    	break;
    	   
        case 5:
    	Pentagon p2 = new Pentagon();
        System.out.println("The area of Pentagon is: "+p2.area(5, 10));
    	break;
    	   
        case 6:
    	Cylinder c3 = new Cylinder();
        System.out.println("The area of Cylinder is: "+c3.area(5, 10));
    	break;
    	   
        case 7:
    	Triangle t1 = new Triangle();
        System.out.println("The area of Triangle is: "+t1.area(5, 10));
    	break;
    	   
        case 8:
    	Cone c4 = new Cone();
        System.out.println("The area of Cone is: "+c4.area(5, 10));
    	break;
		
	}
}
}
	



