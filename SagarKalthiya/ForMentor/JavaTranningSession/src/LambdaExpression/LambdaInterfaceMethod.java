package LambdaExpression;

import java.util.Scanner;

interface ShapeOne{  
    public double AreaSingle(double as);  
}  

interface ShapeTwo{
    public double AreaDouble(double as,double bs); 
}

public class LambdaInterfaceMethod {

	static double pi = 3.14; 
	static double base = 4.0;
	static double hight = 6.0;
	static double side = 5;
    static double radius = 55;
    static double lenght = 8;
    static double widht = 15;
    static double apothem = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    int c = readc.nextInt();
	    
	    switch (c){
		case 1:
			ShapeOne circle=(Radius)->{ return 3.14*Radius*Radius; };
	        System.out.println("Area of Circle is: " +circle.AreaSingle(radius));
		    break;
		case 2:
			ShapeOne sphare=(Radius)->{ return 4*3.14*Radius*Radius; };
	        System.out.println("Area of sphere is: " +sphare.AreaSingle(radius)); 
		    break;
		case 3:
			ShapeTwo tri=(Breadth,Height)->{ return (Breadth*Height)/2; };
		    System.out.println("Area of Triabgle is: " +tri.AreaDouble(radius,hight));
			break;
		case 4:
			ShapeTwo ract=(Length,Breadth)->{ return Length*Breadth; };
		     System.out.println("Area of rectangle is: " +ract.AreaDouble(lenght,base));
		    break;	
		case 5:
			System.out.println("Area of a prism =");
			break;
		case 6:
			ShapeTwo cone=(Radius,Length)->{ return 3.14*Radius*(Radius+Length); };
		    System.out.println("Area of cone is: " +cone.AreaDouble(radius,lenght));
		    break;
		case 7:
			ShapeOne panta=(Side)->{ return (Math.sqrt(5 *(5+2*(Math.sqrt(5))))*Side*Side)/4; };
		    System.out.println("Area of pentagon is: " +panta.AreaSingle(side));
			break;
		case 8:
			ShapeTwo cyclinder=(Radius,Height)->{ return 3.14*Radius*Radius*Height; };
		    System.out.println("Area of cylinder is: " +cyclinder.AreaDouble(radius,hight));
		    break;	
		case 9:
			ShapeOne cube=(Side)->{ return 6*Side*Side; };
		    System.out.println("Area of cube is: " +cube.AreaSingle(side));
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