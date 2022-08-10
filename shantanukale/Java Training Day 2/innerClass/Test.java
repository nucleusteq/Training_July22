package innerClass;

class nestedInner {
	class Hero{
		void display() {
			System.out.print("Hero Class");
		}
			
	}
	
	class Honda{
		void show() {
			System.out.print("Honda Class");
		}
			
	}	
}

public class Test {
	public static void main(String[] args) {
		nestedInner.Hero iHero=new nestedInner().new Hero();
		iHero.display();
	}
	
}
