import java.util.Scanner;
public class AreaOfShapes {
    public static void main(String[] args){
int height=9, breadth=8, length=5, radius=5,side=6,base=9;
        try (Scanner in = new Scanner(System.in)) {
        	System.out.println("Enter Number of Shape that you want to calculate the area for!");
			System.out.println("1. calculate area of circle");
			System.out.println("2. calculate area of square");
			System.out.println("3. calculate area of rectangle");
			System.out.println("4. calculate area of cylinder");
			System.out.println("5. calculate area of cube");
			System.out.println("6. calculate area of pentagon");
			System.out.println("7. calculate area of cone");
			System.out.println("8. calculate area of prism");
			System.out.println("9. calculate area of sphere");
			System.out.println("10. calculate area of triangle");
			System.out.print("Enter your choice: ");
			 int choice = in.nextInt();
			switch(choice) {
			    case 1:
			  
			   double area= 3.14*radius*radius;
			   System.out.println("Area of a circle is:" +area);
			        break;
			        
			    case 2:
			    double area1= side*side;
			    System.out.println("Area of a square is:" +area1);
			        break;
			      
			    case 3:
			    double area3= length *breadth;
			    System.out.println("Area of a rectangle is:" +area3);
			        break;
			      
			    case 4:
			        double area4= 3.14*radius*radius*height;
			        System.out.println("Area of a cylinder is:" +area4);
			            break;
			          
			    case 5:
			    	double area5= 3.14*radius*(radius+length);
			        System.out.println("Area of a cone is:" +area5);
			            break;
			          
			    case 6:
			        double area6= 6*side*side;
			        System.out.println("Area of a cube is:" +area6);
			            break;
			          
			    case 7:
			        double area7= 4*3.14*radius*radius;
			        System.out.println("Area of a sphere is:" +area7);
			            break;
			          
			    case 8:
			        double area8= 2*(breadth*length + length*height + height*breadth);
			        System.out.println("Area of a prism is:" +area8);
			            break;
			          
			    case 9:
			        double area9= (float)(Math.sqrt(5 * (5 + 2
			                * (Math.sqrt(5)))) * side * side) / 4;
			        System.out.println("Area of a pentagon is:" +area9);
			            break;
			    case 10:
			        double area10=(base*height)/2;
			        System.out.println("Area of a triangle is:" +area10);
			             break;
			    default:
			        System.out.println("Wrong choice!");
			}
		}
    }
}