package Java_Lambda;

class Prism implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areaprism = (2*0.5*breadth*height)+(3*length*breadth);
	    System.out.println("Area of prism is "+areaprism);
	}
}