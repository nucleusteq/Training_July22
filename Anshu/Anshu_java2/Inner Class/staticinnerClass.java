


class Bikes{
	static class Hero{
		void show() {
			System.out.println("inner class hero ");
		}
	}
}
public class staticinnerClass {
	public static void main(String[] args) {
		Bikes.Hero b = new Bikes.Hero();
		b.show();
		}
}