package Shape;

public class cone implements FindArea{

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		//A=πr(r+h2+r2)
		return ((pi*a)*(a+b*2+a*2));
	}

}
