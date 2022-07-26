class Bike1{
		class Hero{
			public void Display(){
				System.out.println("Inner class of Hero");
			}
		}
		class Honda{
			public void Show(){
				System.out.println("Inner class of Honda");
			}
		}
	}
public class Nested {
	public static void main(String[] args) {
		Bike1.Hero hero = new Bike1().new Hero();
		hero.Display();
		
		Bike1.Honda honda = new Bike1().new Honda();
		honda.Show();
	}
}
