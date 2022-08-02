package Shapes;
import java.util.Scanner;

interface TypeArea1{  
    public double Area1(double as);  
}  

interface TypeArea2{
    public double Area2(double as,double bs); 
}

interface TypeArea3 {
    public double Area3(double as,double bs,double cs); 
}
  
public class AreaByUsingLambdaEx {
    public static void main(String[] args){
int height=10, breadth=8, length=4, radius=5,side=6,base=9;
        try (Scanner in = new Scanner(System.in)) {
        	System.out.println("Program to calcualte area of shapes");
			System.out.println("Enter 1 to calculate area of circle");
			System.out.println("Enter 2 to calculate area of square");
			System.out.println("Enter 3 to calculate area of rectangle");
			System.out.println("Enter 4 to calculate area of cylinder");
			System.out.println("Enter 5 to calculate area of cone");
			System.out.println("Enter 6 to calculate area of cube");
			System.out.println("Enter 7 to calculate area of sphere");
			System.out.println("Enter 8 to calculate area of prism");
			System.out.println("Enter 9 to calculate area of pentagon");
			System.out.println("Enter 10 to calculate area of triangle");
			System.out.print("Enter the respective number for the desired shape");
			 int choice = in.nextInt();
			switch(choice) {
			    case 1:
			        TypeArea1 a1=(r)->{ return 3.14*r*r; };
			        System.out.println("Area of Circle is: " +a1.Area1(radius));  
			        break;
			        
			    case 2:
				    TypeArea1 a2=(s)->{ return s*s; };
				    System.out.println("Area of square is: " +a2.Area1(side)); 
			        break;
			      
			    case 3:
				    TypeArea2 a3=(l,b)->{ return l*b; };
			        System.out.println("Area of rectangle is: " +a3.Area2(length,breadth));
			        break;
			      
			    case 4:
					TypeArea2 a4=(r,h)->{ return 3.14*r*r*h; };
				    System.out.println("Area of cylinder is: " +a4.Area2(radius,height));
			        break;
			          
			    case 5:
					TypeArea2 a5=(r,l)->{ return 3.14*r*(r+l); };
				    System.out.println("Area of cone is: " +a5.Area2(radius,length));
			        break;
			          
			    case 6:
				    TypeArea1 a6=(s)->{ return 6*s*s; };
				    System.out.println("Area of cube is: " +a6.Area1(side));
			        break;
			          
			    case 7:
			        TypeArea1 a7=(r)->{ return 4*3.14*r*r; };
			        System.out.println("Area of sphere is: " +a7.Area1(radius));  
			        break;
			          
			    case 8:
					TypeArea3 a8=(l,b,h)->{ return 2*(b*l + l*h + h*b); };
				    System.out.println("Area of prism is: " +a8.Area3(length,breadth,height));
			        break;
			          
			    case 9:
				    TypeArea1 a9=(s)->{ return (Math.sqrt(5 *(5+2*(Math.sqrt(5))))*s*s)/4; };
				    System.out.println("Area of pentagon is: " +a9.Area1(side)); 
			            break;
			            
			    case 10:
					TypeArea2 a10=(b,h)->{ return (b*h)/2; };
				    System.out.println("Area of triangle is: " +a10.Area2(radius,height));
			        break;

			    default:
			        System.out.println(" You entered the Wrong choice!");
			}
		}
        catch(Exception ignore) {
        	
        }
    }
   
}