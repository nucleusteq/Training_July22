package JavaTrainingSession.Abstract;
class Bike5{
	void display() {
		class Hero{
			void show() {
				System.out.println("Inner class!");
			}
		}
		Hero hondaa = new Hero();
		hondaa.show();
		System.out.println("Outer class!");
	}
}
public class TaskForInnerClass3 {
	public static void main(String[] args) {
		Bike5 obj = new Bike5();
		obj.display();
	}
}