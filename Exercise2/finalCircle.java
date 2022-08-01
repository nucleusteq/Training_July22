package student;

final class finalCircle {
	double area;
	double r = 4.5;
	
	final double pi = 3.14;
	 void Area() {
		area = pi*r*r;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		finalCircle f = new finalCircle();
		f.Area();
	}
}
