package Oops;

class MySingleton{
	 private static final MySingleton instance = new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }
//pi value  can not be change it is final and instance s also final
	public void MySingleton() {
		// TODO Auto-generated method stub
		final double pi = 3.142,area;
		int radius = 5;
       area = pi * radius * radius;
		 System.out.println("Area of circle"+area);
	}
}
public class SingletonFinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton b = MySingleton.getInstance();
		b.MySingleton();

	}

}
