package Java_Lambda;
import java.util.*;
interface AreaCalculation{
	double pi = 3.14;
	double length = 10.0, breadth = 8.0, height = 5.0, radius = 7.0, lateral_height = 10.0;
	void areaOfShape();
}

public class WithoutLambda{
	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a shape to find it's area : ");
	String shape = scan.nextLine();
	switch(shape) {
	case "Circle":    Circle c = new Circle();
				      c.areaOfShape();
				      break;
	case "Triangle":  Triangle t = new Triangle();
					  t.areaOfShape();
					  break;
	case "Cube":      Cube cub = new Cube();
				      cub.areaOfShape();
				      break;
	case "Rectangle": Rectangle rect = new Rectangle();
					  rect.areaOfShape();
	                  break;
	case "Cylinder":  Cylinder cyl = new Cylinder();
					  cyl.areaOfShape();
					  break;
	case "Prism":     Prism p = new Prism();
					  p.areaOfShape();
					  break;
	case "Cone":      Cone cone = new Cone();
					  cone.areaOfShape();
                      break;
	case "Pentagon":  Pentagon pent = new Pentagon();
					  pent.areaOfShape();
	                  break;
	case "Sphere":    Sphere sph = new Sphere();
					  sph.areaOfShape();
					  break;
	default: System.out.println("Invalid response");
	}	
}
}

