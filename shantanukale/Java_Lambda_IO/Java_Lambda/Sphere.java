package Java_Lambda;

class Sphere implements AreaCalculation{
	@Override
	public void areaOfShape(){
		double areasph = 4*pi*radius*radius;
   	    System.out.println("Area of sphere is "+areasph);
	}
}