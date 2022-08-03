package LambdaFunctions;

import java.util.Scanner;

public class CalculateAreaLambdaFunctions1 {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String shape=sc.next().toLowerCase();
		Shapes sh=null;
		switch(shape) {
		case "triangle": Triangle triangle=new Triangle();
			             sh=triangle::area;
						 break;
		case "cube": Cube cube=new Cube();
					 sh=cube::area;
					 break;
		case "circle": Circle circle=new Circle();
					   sh=circle::area;
					   break;
		case "rectangle": Rectangle rectangle=new Rectangle();
						  sh=rectangle::area;
			      	      break;
		case "cylinder": Cylinder cylinder=new Cylinder();
						 sh=cylinder::area;
						 break;
		case "pentagon": Pentagon pentagon=new Pentagon();
						 sh=pentagon::area;
						 break;
		case "cone": Cone cone=new Cone();
					 sh=cone::area;
		             break;
		case "sphere":Sphere sphere=new Sphere();
					  sh=sphere::area;
					  break;
		}
		System.out.println(sh.area());
		sc.close();
		
	}
}
