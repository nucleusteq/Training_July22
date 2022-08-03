

class Bike{
	class Hero{
		
		public void Display(){
			System.out.println("class Hero");
		}
	}
	class Honda{
		public void Show(){
			System.out.println("class Honda");
		}
	}
}
public class nestedClass {

	public static void main(String[] args) {
		
		Bike.Hero hero = new Bike().new Hero();
		hero.Display();
		
		Bike.Honda honda = new Bike().new Honda();
		honda.Show();
	}

}