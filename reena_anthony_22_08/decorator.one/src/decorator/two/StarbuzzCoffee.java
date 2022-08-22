package decorator.two;

public class StarbuzzCoffee {
	
public static void main(String args[]) {
	
	TeaWithHook teawithhook = new TeaWithHook();
	CoffeeWithHook coffeeHook = new CoffeeWithHook();
	
	System.out.println("\nMaking Tea");
	teawithhook.prepareRecipe();
	
	System.out.println("\nMaking Coffee");
	coffeeHook.prepareRecipe();
	
		
	}

}


