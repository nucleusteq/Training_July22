package Java_Lambda;

class Cone implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areacone = (pi*radius*lateral_height)+(pi*radius*radius);
	    System.out.println("Area of cone is "+areacone);
	}
}