
class Cicle{  
	final double area(double rad){
		final double PI = 3.14;
		final double total = PI*rad*rad;
		return total;
	}
  }  

class TaskForSingleton2{  
	public static void main(String args[])
	{  
	Cicle obj = new Cicle();
	System.out.println(obj.area(2));
	}  
  } 