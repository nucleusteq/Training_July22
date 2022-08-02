package Shape;

public class cylinder implements FindArea {

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		//A=2πrh+2πr2
		return ((2*pi*a*b)+2*pi*a*b*b);
	}

}
