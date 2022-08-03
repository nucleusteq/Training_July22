package oops_concept;

public class Staticinnerclass 
{
	static class Hero{
		public void Meth() {
			System.out.println("Static inner class");
		}
	}
	public static void main(String[] args) {
		Staticinnerclass.Hero SI=new Staticinnerclass.Hero();
		SI.Meth();
	}	
	}