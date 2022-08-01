package student;

public class StaticInnerBike {
static class Hero{
	void display() {
		System.out.println("inside display");
	}
	public static void main(String args[]){  
		  StaticInnerBike.Hero s =new StaticInnerBike.Hero();  
		  s.display();  
}
}
}