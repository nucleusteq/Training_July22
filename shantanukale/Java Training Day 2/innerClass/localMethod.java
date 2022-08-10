package innerClass;
class Bike1{
	void display() {
		class Hero{
			void show() {
				System.out.println("This is the inner class!");
			}
		}
		Hero h = new Hero();
		h.show();
		System.out.println("This is the outer class!");
	}
}
public class localMethod {
	public static void main(String[] args) {
		Bike1 b = new Bike1();
		b.display();
	}
}
