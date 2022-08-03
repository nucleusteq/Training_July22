package GenaricsLambdaI_O;
import java.util.*;

interface Areas{
	/* double pi = 3.14; 
	 double length = 10;
	 double base = 20;
	 double side =5;
	 double radius = 10;
	 double lenghth = 50;
	 double width = 50;
     double calc(double x,double y); */
	double circle();
	double tri();
	double cube();
	double ract();
	double cylinder();
	double prism();
	double cone();
	double pantagon();
	double sphere();
}

class Shape implements Areas {
    double base = 4.0;
    double hight = 6.0;
    double side = 5;
    double radius = 55;
    double lenght = 8;
    double widht = 15;
    double apothem = 8;
    double area;
    
/*
    //triangle method
    void area(int base, int height) {
        int triArea = 
        System.out.println("Area of Triangle = " + triArea);
    }

    //square method
    void area(int side) {
        int sqrArea = side * side;
        System.out.println("Area of Square = " + sqrArea);
    }

    //circle method
    void area(double radius) {
        double cirArea = Math.PI * radius * radius;
        System.out.println("Area of circle = " + cirArea);
    }*/

	@Override
	public double circle() {
		// TODO Auto-generated method stub
		area = (radius*radius)*Math.PI;
		return area;
	}
	@Override
	public double tri() {
		// TODO Auto-generated method stub
		area = (base * hight) / 2;
		return area;
	}
	@Override
	public double cube() {
		// TODO Auto-generated method stub
		area = 6*side*side;
		return area;
	}
	@Override
	public double prism() {
		// TODO Auto-generated method stub
		
		return 0;
	}
	@Override
	public double cylinder() {
		// TODO Auto-generated method stub
		area =  (2*22*(radius + hight))/7;
		return area;
	}
	@Override
	public double cone() {
		// TODO Auto-generated method stub
		area = Math.PI  * radius * (radius + lenght);
		return area;
	}
	@Override
	public double pantagon() {
		// TODO Auto-generated method stub
		area=(5.0/2.0)*side*apothem;
		return area;
	}
	@Override
	public double sphere() {
		// TODO Auto-generated method stub
		 area=4*Math.PI*(radius*radius); 
		return area;
	}
	@Override
	public double ract() {
		// TODO Auto-generated method stub
		area=widht*hight;
		return area;
	}
}
public class lambdaMethod extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean done = false;
		System.out.println("What would you like to do? Type the number of your desired function.");

	    System.out.println("1. Area of a Circle");

	    System.out.println("2. Area of a sphere");

	    System.out.println("3. Area of a Triangle");

	    System.out.println("4. Area of a Rectangle");
	    
	    System.out.println("5. Area of a prism");

	    System.out.println("6. Area of a cone");

	    System.out.println("7. Area of a pantagone");

	    System.out.println("8. Area of a cylinder");
	    
	    System.out.println("9. Area of a cube");

	    System.out.println("10. Quit");

	    Scanner readc = new Scanner(System.in);

	    int c = readc.nextInt(); //This is the choice method 1-4
	    Shape shape = new Shape();
	   
	 

	switch (c){
	case 1:
		System.out.println(" Area of a Circle =" +shape.circle());
	    break;
	case 2:
		System.out.println("Area of a sphere =" +shape.sphere());
	    break;
	case 3:
		System.out.println("Area of a Triangle =" +shape.tri());
		break;
	case 4:
		System.out.println("Area of a Rectangle =" +shape.ract());
	    break;	
	case 5:
		System.out.println("Area of a prism =" +shape.prism());
		break;
	case 6:
		System.out.println("Area of a cone =" +shape.cone());
	    break;
	case 7:
		System.out.println("Area of a pantagone =" +shape.pantagon());
		break;
	case 8:
		System.out.println("Area of a cylinder =" +shape.cylinder());
	    break;	
	case 9:
		System.out.println("Area of a cube =" +shape.cube());
		break;	
	case 10:
		//done = true;
		System.out.println("Please re Run program again");
	    break;
	default:
	    System.out.println("I'm sorry, you didn't select a function.");
	    System.out.println("Please choose again");
	  }
    
  }

}
