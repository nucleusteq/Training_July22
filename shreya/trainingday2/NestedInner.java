package trainingday2;
class Bike {
	
	static {
	System.out.print("This is Outer class.");
	}
	
	class Hero{
		
		 public void Display() {
		System.out.print("This is Inner class 1.");
		} }
	
	class Honda{
		public void Show() {
	    
		System.out.print("This is Inner class 2.");
		} }
	
	void BikeDisplay() {
	Hero h= new Hero();
	h.Display();
	System.out.println(h);
	Honda h1= new Honda();
	h1.Show();
	System.out.println(h1);
} }
public class NestedInner {
	public static void main(String []args) {
		Bike b = new Bike();
		b.BikeDisplay();
		Bike.Hero b1 = new Bike().new Hero();
		b1.Display();
		
		Bike.Honda b2 = new Bike().new Honda();
		b2.Show();
	}
}