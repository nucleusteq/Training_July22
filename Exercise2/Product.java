package student;

public class Product {
	static double GST;
static int price = 100;
static void findTheGSTByCity() {
	GST = 18*(price/100);
	System.out.println(GST);
}

public static void main(String[] args) {
		findTheGSTByCity();
	}
}


