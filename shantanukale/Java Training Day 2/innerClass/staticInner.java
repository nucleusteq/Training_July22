package innerClass;
class Bike{
	static class Hero{
		void show() {
			System.out.println("This is the inner class!");
		}
	}
}
public class staticInner {
	public static void main(String[] args) {
		Bike.Hero bh = new Bike.Hero();
		bh.show();
		}
}
