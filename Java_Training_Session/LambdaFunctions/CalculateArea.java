package LambdaFunctions;
import java.util.Scanner;
public class CalculateArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String shape=sc.next().toLowerCase();
		
		switch(shape) {
		case "triangle": Triangle areaOfTriangle=new Triangle();
						System.out.println(areaOfTriangle.area());
						 break;
		case "cube": Cube areaOfCube=new Cube();
					 System.out.println(areaOfCube.area());
					 break;
		case "circle": Circle areaOfCircle=new Circle();
					   System.out.println(areaOfCircle.area());
					   break;
		case "rectangle": Rectangle areaOfRectangle=new Rectangle();
						  System.out.println(areaOfRectangle.area());
			      	      break;
		case "cylinder": Cylinder areaOfCylinder=new Cylinder();
						 System.out.println(areaOfCylinder.area());
						 break;
		case "pentagon": Pentagon areaOfPentagon=new Pentagon();
						 System.out.println(areaOfPentagon.area());
						 break;
		case "cone": Cone areaOfCone=new Cone();
					 System.out.println(areaOfCone.area());
		             break;
		case "sphere":Sphere areaOfSphere=new Sphere();
					  System.out.println(areaOfSphere.area());
					  break;
		}
		sc.close();
	}

}
