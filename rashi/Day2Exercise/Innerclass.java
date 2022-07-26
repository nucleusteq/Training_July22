package oops_concept;

public class Innerclass 
{
	void display() {
		class Hero{
			void show() {
				System.out.println("My name is Localinner method");
			}
		}
		Hero h=new Hero();
		h.show();
	}
	public static void main(String[] args) {
		Innerclass LI= new Innerclass();
	    LI.display();
	}
}