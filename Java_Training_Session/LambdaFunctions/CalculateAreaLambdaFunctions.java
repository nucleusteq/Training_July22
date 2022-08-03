package LambdaFunctions;

import java.util.Scanner;

public class CalculateAreaLambdaFunctions {
	static public double areaOfTriangle() {
		double base=Shapes.base;
		double height=Shapes.height;
		double area=0.5*base*height;
//		System.out.println(area);
		return area;
	}
	
	public double areaOfCube() {
		double area=6*Shapes.side*Shapes.side;
		return area;
	}
	
	public double areaOfCircle() {
		double area=Shapes.PI*Shapes.radius*Shapes.radius;
		return area;
	}
	
	public double areaOfRectangle() {
		double area=Shapes.length*Shapes.width;
		return area;
	}
	
	public double areaOfCylinder() {
		double area=(2*Shapes.PI*Shapes.radius*Shapes.height)+2*Shapes.PI*Shapes.radius*Shapes.radius;
		return area;
	}
	
	public double areaOfPentagon() {
		double num=Math.sqrt(5*(5+2*Math.sqrt(5))*Shapes.side*Shapes.side);
		double area=1/4*num;
		return area;
	}
	
	public double areaOfCone() {
		double area=Shapes.PI*Shapes.radius*(Shapes.radius+Math.sqrt((Shapes.height*Shapes.height)+(Shapes.radius*Shapes.radius)));
		return area;
	}
	
	public double areaOfSphere() {
		double area=4*Shapes.PI*Shapes.radius*Shapes.radius;
		return area;
	}
	
	public static void main(String...args) {
		CalculateAreaLambdaFunctions calculateArea= new CalculateAreaLambdaFunctions();
		
		
		Scanner sc=new Scanner(System.in);
		String shape=sc.next().toLowerCase();
		
		switch(shape) {
		case "triangle": Shapes sh=CalculateAreaLambdaFunctions::areaOfTriangle;
						 System.out.println(sh.area());
						 break;
		case "cube": sh=calculateArea::areaOfCube;
					 System.out.println(sh.area());
					 break;
		case "circle": sh=calculateArea::areaOfCircle;
		 			   System.out.println(sh.area());
					   break;
		case "rectangle":sh=calculateArea::areaOfRectangle;
		 				 System.out.println(sh.area());
			      	      break;
		case "cylinder": sh=calculateArea::areaOfCylinder;
		 				 System.out.println(sh.area());
						 break;
		case "pentagon": sh=calculateArea::areaOfPentagon;
						 System.out.println(sh.area());
						 break;
		case "cone": sh=calculateArea::areaOfCone;
		 			 System.out.println(sh.area());
		             break;
		case "sphere":sh=calculateArea::areaOfSphere;
		 			  System.out.println(sh.area());
					  break;
		}
		sc.close();
		
//		Shapes sh=CalculateAreaLambdaFunctions::areaOfTriangle;
//		System.out.println(sh.area());
//		
//		sh=calculateArea::areaOfCircle;
		
	}
}
