import java.util.Scanner;

class AreaTriangle {
   public static void main(String args[]) {   
      
	   Scanner myObj = new Scanner(System.in);

      System.out.println("Enter the width of the Triangle:");
      double base = myObj.nextDouble();

      System.out.println("Enter the height of the Triangle:");
      double height = myObj.nextDouble();

      double area = (base * height)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}