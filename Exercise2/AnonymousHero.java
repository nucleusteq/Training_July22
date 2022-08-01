package student;

public class AnonymousHero {
public static void main(String args[]) {
	AnonymousBike a = new AnonymousBike() {
		public void display() {
			System.out.println("Inside AnonymousHero class");
		}
	};
}
}
