package Lamda;

import java.util.Scanner;
interface Parameter1{
	public void Area1(double as);
}
interface Parameter2{
	public void Area2(double input1,double input2);
}
interface Para3{
	public void Area3(double input1,double input2,double input3);
}
public class WithLamda{
	public static void main(String[] args) {
		 int base=5, height=10,radius=2,width=5,length=10;
		 Scanner sc=new Scanner(System.in);
			
		 System.out.println(" For Triangle Enter : 1");
    	 System.out.println(" For Circle Enter : 2");
    	 System.out.println(" For Rectangle Enter : 3");
    	 System.out.println(" For Pentagone Enter : 4");
    	 System.out.println(" For Prism Enter : 5");
    	 System.out.println(" For Cone Enter : 6");
    	 System.out.println(" For Cylinder Enter : 7");
    	 System.out.println(" For Sphere Enter : 8");
    	 System.out.println(" For Cube Enter : 9");
    	 System.out.println();
    	 System.out.println("Enter any number to go Forward");
    	 int num = sc.nextInt();
    	
    	 switch(num) {
    	case 1:
        Parameter2 T=(b)->{System.out.println("Area of Triangle = " + (base*height)/2); };
    	 break;
    	
    	 case 2: Parameter1 Circle=(Radius)->{ return  3.14*radius*radius; };
    	 System.out.println("Area of Circle = " + circle.parameter1(Radius));
    	break;
    	     	 }
	}
}