package GenaricsLambdaI_O;

interface Shapes {
   void cirecle(double radius);
   void Cone(double r);
   void cube(double r ,double l);
   void cylinder(double r ,double l);
   void pantagon(double r ,double l);
   void prism(double r ,double l);
   void ract(double r ,double l);
   void tri(double r ,double l);
   
}
public class LambdaInterfaceMethod {

	static double pi = 3.14; 
	static double base = 4.0;
	static double hight = 6.0;
	static double side = 5;
    static double radius = 55;
    static double lenght = 8;
    static double widht = 15;
    static double apothem = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Shapes demoInterface = () -> System.out.println((radius*radius)*Math.PI);
		demoInterface.cirecle(radius);
		
		Shapes result = (radius, radius) ->
	      { return n1 + n2;}; 
	      result.apply(n1, n2);
		
	/*	Shapes myFunc = (radius) -> {
		      int c = 0;
		     return c;
		    };*/
		 

	}

}
