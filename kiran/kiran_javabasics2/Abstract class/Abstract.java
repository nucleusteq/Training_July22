
public class Abstract {

	public static void main(String[] args) {

abstract class Shape{
			
			abstract double perimeter();
			abstract double area();
			
		}
		class Rectangle extends Shape{
			int length = 10, breadth = 5;
			
			
			double perimeter() {
				int perimeter = 2*(length+breadth); 
				return perimeter;
			}
			
			
			double area() {
				double area = length*breadth;
				return area;
			}


			public String toString() {
				return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
			}
			
			
		}
		class Circle extends Shape{
			int r = 6;
			
			
			double perimeter() {
				double perimeter = 2*3.14*r;
				return perimeter;
			}

			
			
			double area() {
				double area = 3.14*r*r;
				return area;
			}
			
			


	}

	}
	}
