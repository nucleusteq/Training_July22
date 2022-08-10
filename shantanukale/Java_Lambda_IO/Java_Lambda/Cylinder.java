package Java_Lambda;
class Cylinder implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areacyl = 2*pi*radius*(radius+height);
	    System.out.println("Area of cylinder is "+areacyl);
	}
}