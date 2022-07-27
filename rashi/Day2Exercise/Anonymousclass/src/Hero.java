
	abstract class Bike{
		abstract void display();
	}
	public class Hero{
		public static void main(String args[]) {
		Bike b1 = new Bike() {
				void display() {
				System.out.println("This class is anonymous");
				}
	};
	b1.display();
	}
}