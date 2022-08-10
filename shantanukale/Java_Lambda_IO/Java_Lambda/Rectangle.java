package Java_Lambda;
class Rectangle implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double arearec = length*breadth;
        System.out.println("Area of rectangle is "+arearec);
	}
}