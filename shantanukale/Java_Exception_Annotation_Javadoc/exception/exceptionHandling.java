package exception;
class division{
	int x,y;
	int z;
	int div(int x, int y) {
		z =x/y;
		return z;
	}
	
}
public class exceptionHandling {
	public static void main (String[] args) {
		division d = new division();
		try {
		System.out.println(d.div(50,0));
		}
		catch(ArithmeticException e) {
			System.out.println("A number cannot be divided by zero");
		}
	}
}
