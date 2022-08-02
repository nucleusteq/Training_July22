import java.util.Scanner;

public class Area {
	 public static void main(String[] args){

	     int height=5,breadth=4,side=6,length=3,radius=5,base=4; 
	     double slantheight=50^1/2;
		 
		 Scanner in = new Scanner(System.in);
	        
	        System.out.println("Enter 1 to calculate area of Circle");
	        System.out.println("Enter 2 to calculate area of Square");
	        System.out.println("Enter 3 to calculate area of Rectangle");
	        System.out.println("Enter 4 to calculate area of Triangle");
	        System.out.println("Enter 5 to calculate area of cylinder");
	        System.out.println("Enter 6 to calculate area of cube");
	        System.out.println("Enter 7 to calculate area of cone");
	        System.out.println("Enter 8 to calculate area of sphere");
	        System.out.println("Enter 9 to calculate area of pentagon");
	        System.out.println("Enter 10 to calculate area of cuboid");
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
	       double area4= 0.5*base*height;
	       System.out.println("Area of a triangle is:" +area4);
	                break;
	                
	        case 5:	            
	        double area5= 3.14*radius*radius*height;
	        System.out.println("Area of a cylinder is:" +area5);
	                break;
                
	        case 6:	           
	        double area6= side*side*side;
	        System.out.println("Area of a cube is:" +area6);
	                break;
	                
	        case 7:
	        double area7= 3.14*radius*(radius+slantheight);
	        System.out.println("Area of a cone is:" +area7);
	                break;
	                
	        case 8:
	        double area8= 4*3.14*radius*radius;
	        System.out.println("Area of a sphere is:" +area8);
	                break;
	                
	        case 9:
	        double area9= area = (float)(Math.sqrt(5 * (5 + 2
	                * (Math.sqrt(5)))) * side * side) / 4;
	        System.out.println("Area of a pentagon is:" +area9);
	                break;
	                
	        case 10:
		        double area10= 2*(breadth*length + length*height + height*breadth);
		        System.out.println("Area of a cuboid is:" +area10);
		                break;
			      
		    default:
                System.out.println("Wrong choice!");
        }
    }
}
	 
	 
	 
	 
