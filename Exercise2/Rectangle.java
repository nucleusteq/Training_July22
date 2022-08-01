package student;

public class Rectangle extends Shape {
int l = 28;
int w = 41;
int p;
int A;
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		p = 2*(l+w);
		System.out.println(p);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		A = w*l;
		System.out.println(A);
	}
	public static void main(String args[]) {
		Rectangle a = new Rectangle();
		a.perimeter();
		a.area();
		
	}


}
