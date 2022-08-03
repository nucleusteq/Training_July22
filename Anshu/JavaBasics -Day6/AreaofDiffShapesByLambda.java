import java.util.Scanner;

interface ShapeArea1{  
    public double Area1(double as);  
}  

interface ShapeArea2{
    public double Area2(double as,double bs); 
}

interface ShapeArea3 {
    public double Area3(double as,double bs,double cs); 
}
  
public class Areabylambda {
    public static void main(String[] args){
int height=9, breadth=8, length=5, radius=5,side=6,base=9;
        try (Scanner in = new Scanner(System.in)) {
        	System.out.println("Java program to check area of any shape!");
			System.out.println("1. calculate area of circle");
			System.out.println("2. calculate area of square");
			System.out.println("3. calculate area of rectangle");
			System.out.println("4. calculate area of cylinder");
			System.out.println("5. calculate area of cone");
			System.out.println("6. calculate area of cube");
			System.out.println("7. calculate area of sphere");
			System.out.println("8. calculate area of prism");
			System.out.println("9. calculate area of pentagon");
			System.out.println("10. calculate area of triangle");
			System.out.print("Enter your choice: ");
			 int choice = in.nextInt();
			switch(choice) {
			    case 1:
			        ShapeArea1 a1=(r)->{ return 3.14*r*r; };
			        System.out.println("Area of Circle is: " +a1.Area1(radius));  
			        break;
			        
			    case 2:
				    ShapeArea1 a2=(s)->{ return s*s; };
				    System.out.println("Area of square is: " +a2.Area1(side)); 
			        break;
			      
			    case 3:
				    ShapeArea2 a3=(l,b)->{ return l*b; };
			        System.out.println("Area of rectangle is: " +a3.Area2(length,breadth));
			        break;
			      
			    case 4:
					ShapeArea2 a4=(r,h)->{ return 3.14*r*r*h; };
				    System.out.println("Area of cylinder is: " +a4.Area2(radius,height));
			        break;
			          
			    case 5:
					ShapeArea2 a5=(r,l)->{ return 3.14*r*(r+l); };
				    System.out.println("Area of cone is: " +a5.Area2(radius,length));
			        break;
			          
			    case 6:
				    ShapeArea1 a6=(s)->{ return 6*s*s; };
				    System.out.println("Area of cube is: " +a6.Area1(side));
			        break;
			          
			    case 7:
			        ShapeArea1 a7=(r)->{ return 4*3.14*r*r; };
			        System.out.println("Area of sphere is: " +a7.Area1(radius));  
			        break;
			          
			    case 8:
					ShapeArea3 a8=(l,b,h)->{ return 2*(b*l + l*h + h*b); };
				    System.out.println("Area of prism is: " +a8.Area3(length,breadth,height));
			        break;
			          
			    case 9:
				    ShapeArea1 a9=(s)->{ return (Math.sqrt(5 *(5+2*(Math.sqrt(5))))*s*s)/4; };
				    System.out.println("Area of pentagon is: " +a9.Area1(side)); 
			            break;
			            
			    case 10:
					ShapeArea2 a10=(b,h)->{ return (b*h)/2; };
				    System.out.println("Area of triangle is: " +a10.Area2(radius,height));
			        break;

			    default:
			        System.out.println("Wrong choice!");
			}
		}
        catch(Exception ignore) {
        	
        }
    }
   
}
