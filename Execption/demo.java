package test;

public class demo {

	int a=0;
	int b=4;
	int c;
	
	void div() {
		try {
		c=a/b;
		}
		catch(Exception e) {
			System.out.println("cant happen");
		}
		
	}
	public static void main(String args[]) {
		
		demo a  = new demo();
		a.div();
	}
}
