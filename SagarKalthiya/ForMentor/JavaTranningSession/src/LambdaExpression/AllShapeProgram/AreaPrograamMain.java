package LambdaExpression.AllShapeProgram;

import java.util.Scanner;


public class AreaPrograamMain {

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
			CircleMethod circle = new CircleMethod(); 
			System.out.println(" Area of a Circle =" +circle.areas());
		    break;
		case 2:
			SquareMethod sphare = new SquareMethod();
			System.out.println("Area of a sphere =" +sphare.areas());
		    break;
		case 3:
			Trianglemethod tri = new Trianglemethod();
			System.out.println("Area of a Triangle =" +tri.areas());
			break;
		case 4:
			RectangleMethod ract = new RectangleMethod();
			System.out.println("Area of a Rectangle =" +ract.areas());
		    break;	
		case 5:
			PrismeMethod prism = new PrismeMethod();
			System.out.println("Area of a prism =" +prism.areas());
			break;
		case 6:
			CoreMethod cone = new CoreMethod();
			System.out.println("Area of a cone =" +cone.areas());
		    break;
		case 7:
			PantagoneMethod pntgon = new PantagoneMethod();
			System.out.println("Area of a pantagone =" +pntgon.areas());
			break;
		case 8:
			CylinderMethod cylinder = new CylinderMethod();
			System.out.println("Area of a cylinder =" +cylinder.areas());
		    break;	
		case 9:
			CubeMethod cube = new CubeMethod();
			System.out.println("Area of a cube =" +cube.areas());
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