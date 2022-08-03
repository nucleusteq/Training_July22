package day2Exercise;
import java.util.*;
abstract class Shape
       {
	int a,b;
	   abstract public void perimeter();
	   abstract public void area(); 
	   }
class circle extends Shape
{   
	double area_circ;
	public void perimeter() {
		
	}
	public void area() {
		
	}
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Radius of Circle");
	a = sc.nextInt();
	area_circ=(3.14*a*a);
	System.out.println("radius of circle"+a);
	System.out.println("The area of circle is:"+area_circ);	
}
}
class rectangle extends Shape
{
	public int area_rect;
	public void perimeter() {
	}
	public void area(){
		
	}
  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length & breadth of rectangle");
		a = sc.nextInt();
		b = sc.nextInt();
		area_rect=a*b;
		System.out.println("Length of Rectangle" +a+"Breadth of rectangle"+b);
		System.out.println("The area of Rectangle is:"+area_rect);		
  }
}


public class AbstractClass 
{
	public static void main(String[] args) 
	{
		circle r1 = new circle();
		r1.perimeter();
		r1.area();
		rectangle r = new rectangle();
		r.perimeter();
		r.area();
		}
}
