package Shape;
import java.util.Scanner;

interface Area{
	
	int l=2,b=3,r=3,h=4,p=6,a=7;
	
}
class Rect implements Area{
	public void rect()
	{
		System.out.println(l*b) ;	
	}
}

class Circle implements Area{
	public void circle()
	{
	System.out.println(3.14*r*r) ;
	}
}
class Cube implements Area{
	public void cube()
	 {
		 System.out.println(6*a*a) ;
	}
}
class Cylinder implements Area{
	public void cylinder()
	 {
		 System.out.println(2*3.14*r*h + 2*3.14*r*r) ;
	}
}
class Prism implements Area{
	public void prism()
	 {
		 System.out.println(2*b + p*h) ;
	}
}
class Cone implements Area{
	public void cone()
	 {
		 System.out.println(3.14*r*(r+Math.sqrt((r*r + h*h)))) ;
	}
}
class Sphere implements Area{
	public void sphere()
	{
		System.out.println(4*r*r) ;
	}
}
class PentagonicCylinder implements Area{
	public void pentagonicCylinder()
	{
		System.out.println (5*a*h+((1/2)*Math.sqrt(5*(5+2*Math.sqrt(5))*a*a))) ;
	}
}
public class Shape {
	public static void main(String[] args) {
		System.out.println("enter shape");
		Scanner sc=new Scanner(System.in);
		String AnyShape=sc.nextLine();
		switch(AnyShape) {
		case "Rectangle":
		{
			Rect a=new Rect();
			a.rect();
			break;
		}
		case "Circle":
		{
			Circle c=new Circle();
					c.circle();
					break;
		}
		case "Cube":
		{
			Cube c=new Cube();
			c.cube();
			break;
		}
		case "Cylinder":
		{
			Cylinder c=new Cylinder();
			c.cylinder();
		}
		case "Prism":
		{
			Prism p=new Prism();
			p.prism();
		}
		case "Cone":
		{
			Cone c=new Cone();
			c.cone();
		}
		case "Sphere":
		{
			Sphere s=new Sphere();
			s.sphere();
		}
		case "PentagonicCylinder":
		{
			PentagonicCylinder pc=new PentagonicCylinder();
			pc.pentagonicCylinder();
		}
		}}}
		
		


