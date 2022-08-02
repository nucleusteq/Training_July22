package Shape;

public class prism implements FindArea{

	@Override
	public double calculate(double a, double b) {
		// TODO Auto-generated method stub
		//S = (2 × Base Area) + (Base perimeter × height) 
		return ((2*a)+(a*b));
	}

}
