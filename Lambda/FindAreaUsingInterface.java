package Shape;

//import java.awt.Rectangle;
import java.util.Scanner;

public class FindAreaUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape");
		 Rectangle rect = new Rectangle();    
	     Circle cir = new Circle(); 
	     prism pri = new prism();
	     cone c = new cone();
	     cylinder cyl = new cylinder();
	     Pentanagon_cyclinder pent = new  Pentanagon_cyclinder();
	     sphere  s = new sphere();
	     triangle tri = new triangle();
	     FindArea area;
	   String n = sc.nextLine();

	   
	   
	    //  area = rect;    
	      //System.out.println("Area of rectangle is: " + area.calculate(50, 30));      
	  //    area = cir;    
	   //   System.out.println("Area of circle is: " + area.calculate(10, 10));
	    switch(n)
	    {	
	    case "Rectangle":
	    {
	    	System.out.println(" Area of Rectange is  "+rect.calculate(2.9,4.9));
	    	break;
	    }
	    case "Circle":
	    {
	    	System.out.println(" Area of Circle is  "+cir.calculate(2.9,4.9));
	    	break;
	    }
	    case "cone":
	    {
	    	System.out.println(" Area of cone is  "+c.calculate(2.9,4.9));
	    	break;
	    }
	    case "cylinder":
	    {
	    	System.out.println(" Area of cyclinder is  "+cyl.calculate(2.9,4.9));
	    	break;
	    }
	    case "Pentanagon_cyclinder":
	    {
	    	System.out.println(" Area of pentanagon_cyclinder is  "+pent.calculate(2.9,4.9));
	    	break;
	    }
	    case "prism":
	    {
	    	System.out.println(" Area of prism is  "+pri.calculate(2.9,4.9));
	    	break;
	    }
	    case "sphere":
	    {
	    	System.out.println(" Area of sphere is  "+s.calculate(2.9,4.9));
	    	break;
	    }
	    case "triangle":
	    {
	    	System.out.println(" Area of triangle is  "+tri.calculate(2.9,4.9));
	    	break;
	    }
	    default :{
	    	System.out.println(" Wrong shape enter ");
	    }
	    }
	 }
	    

}
