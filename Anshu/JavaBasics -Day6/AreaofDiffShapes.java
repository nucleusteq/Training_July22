import java.lang.FunctionalInterface;


	
		 
		 interface FunctionalInterfaceDemo{
				void performCalculation(double h, double w, double l, double r, double s, double b);}
		 public class ShapeClosure {
				public static void main(String[] args) {
					FunctionalInterfaceDemo fi=(h, w)->{
						System.out.println("Area of Rectangle is "+ h * w);
					};
					fi.performCalculation(10, 20);
				}
			}
			
		 try (Scanner in = new Scanner(System.in)){
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

			
