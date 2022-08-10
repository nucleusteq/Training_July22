
public class SingletonFinalClass {
	
	public static void main(String[] args) {
		MySingleton b = MySingleton.getInstance();
		b.mySingleton();
	}

}

class MySingleton {
	private static final MySingleton singletonInstance = new MySingleton();

	public static MySingleton getInstance() {
		return singletonInstance;
	}

	public void mySingleton() {
		
		final double pi = 3.142;
		int radius = 5;
        final double area = pi * radius * radius;
		System.out.println("Area of Circle " + area);
	}
}