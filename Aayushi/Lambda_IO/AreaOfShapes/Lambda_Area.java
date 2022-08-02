
import java.util.Scanner;

interface MyInterface{    
	double getArea();}

public class Lambda_Area {

    public static void main(String[] args){
    	int side=10,length=5,breadth=4,radius=3,base=2,height=6,slength=3;
    	
    	Lambda reference = new Lambda();
    	Scanner in = new Scanner(System.in);
		System.out.println("Enter circle to calculate area of circle");
		System.out.println("Enter rectangle to calculate area of rectangle");
		System.out.println("Enter square to calculate area of square");
		System.out.println("Enter triangle to calculate area of triangle");
		System.out.println("Enter cube to calculate area of cube");
		System.out.println("Enter cuboid to calculate area of cuboid");
		System.out.println("Enter sphere to calculate area of sphere");
		System.out.println("Enter cylinder to calculate area of cylinder");
		
		String choice = in.nextLine();
		
		switch(choice) {
	   
		case "square":
        MyInterface ref;
        ref = () -> Math.multiplyFull(side, side);
        System.out.println("Area os square = " + ref.getArea());
        break;
    
	    case "rectangle":
	    ref = () -> Math.multiplyFull(length, breadth);
	    System.out.println("Area of rectangle = " + ref.getArea());
	    break;
	    	
	    case "circle":
		    ref = () -> Math.PI * radius * radius;
		    System.out.println("Area of circle = " + ref.getArea());
		    break;
		    	
	    case "triangle":
		    ref = () -> 0.5*base*height;
		    System.out.println("Area of triangle = " + ref.getArea());
		    break;
		    	    
	    case "cube":
		    ref = () -> side*side*side;
		    System.out.println("Area of cube = " + ref.getArea());
		    break;
		    
    	    
	    case "cuboid":
		    ref = () -> 2*((length*breadth)+(breadth*height)+(height*length));
		    System.out.println("Area of cuboid = " + ref.getArea());
		    break;
		    
	    case "sphere":
		    ref = () -> 4*3.14*radius*radius;
		    System.out.println("Area of sphere = " + ref.getArea());
		    break;
		    
	    case "cylinder":
		    ref = () -> 3.14*radius*radius*height;
		    System.out.println("Area of cylinder = " + ref.getArea());
		    break;
		    
	    case "cone":
		    ref = () -> 3.14*radius*(radius+slength);
		    System.out.println("Area of cone = " + ref.getArea());
		    break;
		    	    
	    
	    default:
	        System.out.println("Wrong choice!");
         
} } }