package trainingday2;

class Bikes{
	static class Hero{
		void show() {
			System.out.println("This is the inner class!");
		}
	}
}
public class StaticInner {
	public static void main(String[] args) {
		Bikes.Hero b = new Bikes.Hero();
		b.show();
		}
}