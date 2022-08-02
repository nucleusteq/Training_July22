import java.util.Scanner;

interface Shape {
	 int base=5, height=10,radius=2,width=5,length=10;
	 public void area();
	
}
 class Triangle implements Shape{
	@Override
	public void area() {
		System.out.println("Area of Triangle = " + (base*height)/2);
	}
 }
 
 class Circle implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Circle = " + 3.14*radius*radius);
	}
	 
 }
 class Rectangle implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Rectangle = " + length*width);
	}
	 
 }
 
class Pentagone implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Pentagone = " + 11.84*length*length);
	}
	 
 }
class Prism implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Prism = " + (3*length*base)+(2*.5*base*height));
	}
	 
}
class Cone implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Cone = " + 3.14*(length+radius) );
	
	}
	 
}
class Cylinder implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Cylinder = " + 2*3.14*radius*(radius+height) );
	}
	 
}
class Sphere implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Sphere = " + 4*3.14*radius*radius);
	}
	 
}
class Cube implements Shape{

	@Override
	public void area() {
		System.out.println("Area of Cube = " + 6*length);
	}
	 
 }
public class WithInterface 
{
    public static void main(String[] args)
    {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println(" For Triangle Enter : 1");
    	 System.out.println(" For Circle Enter : 2");
    	 System.out.println(" For Rectangle Enter : 3");
    	 System.out.println(" For Pentagone Enter : 4");
    	 System.out.println(" For Prism Enter : 5");
    	 System.out.println(" For Cone Enter : 6");
    	 System.out.println(" For Cylinder Enter : 7");
    	 System.out.println(" For Sphere Enter : 8");
    	 System.out.println(" For Cube Enter : 9");
    	 System.out.println();
    	 System.out.println("Enter any number to go Forward");
    	 int num = sc.nextInt();
     switch(num) {
     case 1: {
    	 Shape A=new Triangle();
         A.area();
         break;
     }
     case 2:{
    	 Shape A=new Circle();
         A.area();
         break;
     }
     case 3:{
    	 Shape A=new Rectangle();
         A.area();
         break;
     }
     case 4:{
    	 Shape A=new Pentagone();
         A.area();
         break;
     }
     case 5:{
    	 Shape A=new Prism();
         A.area();
         break;
         }
     case 6:{
    	 Shape A=new Cone();
         A.area();
         break;
         }
     case 7:{
    	 Shape A=new Cylinder();
         A.area();
         break;
         }
     case 8:{
    	 Shape A=new Sphere();
         A.area();
         break;
         }
     case 9:{
    	 Shape A=new Cube();
         A.area();
         break;
         }
     }
 
    }
}