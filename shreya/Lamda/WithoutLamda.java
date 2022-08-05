package Lamda;
import java.util.*;

interface Shape{
	
	 int r= 5;
	 double pi = 3.14;
	 double l= 4;
	 double b= 4;
	 double h=6;
	 public void area();
 }

public class WithoutLamda {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Shape: ");
	String shape= s.nextLine();
	switch(shape) {
	
	case "Circle": Circle c=new Circle();
	               c.area();
	               break;
	               
	case "Triangle": Triangle t=new Triangle();
                   t.area();
                   break;
    
	case "Sphere": Sphere sp=new Sphere();
                   sp.area();
                   break;
    
	case "Pentagon": Pentagon p=new Pentagon();
                   p.area();
                   break;
    
	case "Cube": Cube cb=new Cube();
                   cb.area();
                   break;
    
	case "Cone": Cone co=new Cone();
                   co.area();
                   break;
    
	case "Prism": Prism pr=new Prism();
                   pr.area();
                   break;
    
	case "Rectangle": Rectangle r=new Rectangle();
                   r.area();
                   break;
    
	case "Cylinder": Cylinder cy=new Cylinder();
                   cy.area();
                   break;
	           }
}
}
