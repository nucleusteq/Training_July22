package Oops_Programs;
import java.util.*;
abstract class Shape
       {
    int a,b;
       abstract public void perimeter_method();
       abstract public void area_method(); 
       }
class circle extends Shape
{   
    double area_circle;
    public void perimeter_method() {
        
    }
    public void area_method() {
        
    }
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Radius of Circle");
    a = sc.nextInt();
    area_circle=(3.14*a*a);
    System.out.println("Radius of circle"+a);
    System.out.println("The area of circle is :-"+area_circle);   
}
}
class rectangle extends Shape
{
    public int area_rectangle;
    public void perimeter_method() {
    }
    public void area_method(){
        
    }
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length & breadth of rectangle");
        a = sc.nextInt();
        b = sc.nextInt();
        area_rectangle=a*b;
        System.out.println("Length of Rectangle" +a+"Breadth of rectangle"+b);
        System.out.println("The area of Rectangle is:"+area_rectangle);        
  }
}

public class Java_Abstract_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 circle r1 = new circle();
	        r1.perimeter_method();
	        r1.area_method();
	        rectangle r = new rectangle();
	        r.perimeter_method();
	        r.area_method();
	}

}
