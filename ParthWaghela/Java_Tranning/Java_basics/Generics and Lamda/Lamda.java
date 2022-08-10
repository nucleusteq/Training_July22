import java.util.Scanner;

interface Para1{
	public void Area1(double as);
}
interface Para2{
	public void Area2(double input1,double input2);
}
interface Para3{
	public void Area3(double input1,double input2,double input3);
}
public class Lamda {
	public static void main(String[] args) {
		 double base=5, height=10,radius=2,width=5,length=10;
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
        Para2 T=(b,h) ->{System.out.println("Area of Triangle = " + (b*h)/2); };
        T.Area2(base, height);
    	 break;
    	 
    	case 2: 
            Para1 T1=(r) ->{System.out.println("Area of Circle = " + 3.14*r*r); };
            T1.Area1(radius);
        	 break;
    	
    	case 3: 
            Para2 T2=(l,w) ->{System.out.println("Area of Rectangle = " + l*w); };
            T2.Area2(length, width);
        	 break;
    	
    	case 4: 
            Para1 T3=(l) ->{System.out.println("Area of Pentagone = " + 11.84*l*l); };
            T3.Area1(length);
        	 break;
    	
    	case 5: 
            Para3 T4=(l,b,h) ->{System.out.println("Area of Prism = " + (3*l*b)+(2*.5*b*h)); };
            T4.Area3(length, height, base);
        	 break;
    	
    	case 6: 
            Para2 T5=(r,l) ->{System.out.println("Area of Cone = " + 3.14*(l+r) ); };
            T5.Area2(radius,length);
        	 break;
    	
    	case 7: 
            Para2 T6=(r,h) ->{System.out.println("Area of Cylinder = " + 2*3.14*r*(r+h) ); };
            T6.Area2(radius, height);
        	 break;
    	
    	case 8: 
            Para1 T7=(r) ->{System.out.println("Area of Sphere = " + 4*3.14*r*r); };
            T7.Area1(radius);
        	 break;
    	
    	case 9: 
            Para1 T8=(l) ->{System.out.println("Area of Cube = " + 6*l); };
            T8.Area1(length);
        	 break;
    	
    	     	 }
    	 
    	
	}
}
