
import java.util.Scanner;
public class AreaOfShapes{
    public static void main(String[] args){
int height=7, breadth=2, length=5, radius=7,side=2,base=4;
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter circle to calculate area of circle");
			System.out.println("Enter square to calculate area of square");
			System.out.println("Enter rectangle to calculate area of rectangle");
			System.out.println("Enter cylinder to calculate area of cylinder");
			System.out.println("Enter cube to calculate area of cube");
			System.out.println("Enter pentagon to calculate area of pentagon");
			System.out.println("Enter cone to calculate area of cone");
			System.out.println("Enter prism to calculate area of prism");
			System.out.println("Enter sphere to calculate area of sphere");
			System.out.print("Enter your choice: ");
			 String choice = in.nextLine();
			switch(choice) {
			    case "circle":
			   
			   double area= 3.14*radius*radius;
			   System.out.println("Area of a circle is:" +area);
			        break;
			       
			   
			       
			    case "square":
			    double area1= side*side;
			    System.out.println("Area of a square is:" +area1);
			        break;
			       
			    case "rectangle":
			    double area3= length *breadth;
			    System.out.println("Area of a rectangle is:" +area3);
			        break;
			       
			    case "cylinder":
			        double area4= 3.14*radius*radius*height;
			        System.out.println("Area of a cylinder is:" +area4);
			            break;
			           
			    case "cone":
			    	double area5= 3.14*radius*(radius+length);
			        System.out.println("Area of a cone is:" +area5);
			            break;
			           
			    case "cube":
			        double area6= 6*side*side;
			        System.out.println("Area of a cube is:" +area6);
			            break;
			           
			    case "sphere":
			        double area7= 4*3.14*radius*radius;
			        System.out.println("Area of a sphere is:" +area7);
			            break;
			           
			    case "prism":
			        double area8= 2*(breadth*length + length*height + height*breadth);
			        System.out.println("Area of a prism is:" +area8);
			            break;
			           
			    case "pentagon":
			        double area9= (float)(Math.sqrt(5 * (5 + 2
			                * (Math.sqrt(5)))) * side * side) / 4;
			        System.out.println("Area of a pentagon is:" +area9);
			            break;
			    case "triangle":
			       
			        double area10=1/2*base*height;
			        System.out.println("Area of a triangle is:" +area10);
			             break;
			    default:
			        System.out.println("Wrong choice!");
			}
		}
    }
}