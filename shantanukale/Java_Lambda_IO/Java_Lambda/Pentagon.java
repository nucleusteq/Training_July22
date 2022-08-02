package Java_Lambda;

class Pentagon implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areapen = 11.84*length*length;
        System.out.println("Area of pentagon is "+areapen);
	}
}
