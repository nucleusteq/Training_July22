package Oops;

abstract class Bike{
	abstract void display();
}
public class AnonymouseHeroClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike(){
			void display(){
				System.out.println("Anonymous Inner Class");
			}
		};
		bike.display();

	}

}
