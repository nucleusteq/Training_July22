package Java_Lambda;
class Triangle implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areat = 0.5*breadth*height;
		System.out.println("Area of triangle is "+areat);
	}
}