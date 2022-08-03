package Oops_Programs;

class Bike1{
	class Hero{
		public void Display(){
			System.out.println("class of Hero");
		}
	}
	class Honda{
		public void Show(){
			System.out.println("class of Honda");
		}
	}
}
public class Java_NestedInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1.Hero hero = new Bike1().new Hero();
		hero.Display();
		
		Bike1.Honda honda = new Bike1().new Honda();
		honda.Show();
	}

}
