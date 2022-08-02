package Java_Lambda;
class Circle implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areacir = pi*radius*radius;
		System.out.println("Area of circle is "+areacir);
	}
}