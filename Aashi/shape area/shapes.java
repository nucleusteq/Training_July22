package Shapes;
import java.util.Scanner;
public class shapes {
    public static void main(String[] args){
    	int rad=7;double side=8.3,slant=5;  int length = 6, breadth=8,base=3,height=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to calculate area of circle");
        System.out.println("Enter 2 to calculate area of square");
        System.out.println("Enter 3 to calculate area of rectangle");
        System.out.println("Enter 4 to calculate area of cylinder");
        System.out.println("Enter 5 to calculate area of cube");
        System.out.println("Enter 6 to calculate area of sphere");
        System.out.println("Enter 7 to calculate area of pentagon");
        System.out.println("Enter 8 to calculate area of prism");
        System.out.println("Enter 9 to calculate area of cone");
        System.out.println("Enter 10 to calculate area of triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt() ;      
        switch(choice) {
            case 1:
           double area1= 3.14*rad*rad;
           System.out.println("Area of a circle is:" +area1);
                break;
            case 2:
            double area2= side*side;
            System.out.println("Area of a square is:" +area2);
                break;
            case 3:
          
            double area3= length *breadth;
            System.out.println("Area of a rectangle is:" +area3);
                break;
            case 4:
                double area4=3.24*rad*rad*height;
                System.out.println("Area of a cylinder is:" +area4);
                    break;
            case 5:
                double area5= side*side*side;
                System.out.println("Area of a cube is:" +area5);
                    break;
            case 6:
                double area6= 4*3.14*rad*rad;
                System.out.println("Area of a sphere is:" +area6);
                    break;
            case 7:
            	double area7=(float)(Math.sqrt(5 * (5 + 2
                        * (Math.sqrt(5)))) * side*side) / 4;
                System.out.println("Area of a pentagon is:" +area7);
                    break;
        
            case 8:
                double area8=2*((length*breadth)+(breadth*height)+(height*length));
                System.out.println("Area of a prism is:" +area8);
                    break;
            case 9:                
                double area9= 3.14* rad*(rad+slant);
                System.out.println("Area of cone is:" +area9);
                    break;
            case 10:              
                double area10= 1/2*base*height;
                System.out.println("Area of a triangle is:" +area10);
                    break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}