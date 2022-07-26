package trainingday2;

abstract class Bikes1{
	abstract void display();
}

class Hero{
	
	void Display() {
		Bikes1 b = new Bikes1() {

			@Override
			void display() {
				System.out.println("Hello I am Abstract class Function");

			}
		};
		b.display();
	}
}

public class AnonymousInner  {
public static void main(String[] args) {
	new Hero().Display();
}
}
