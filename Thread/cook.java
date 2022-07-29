package demo;
public class cook {
	public static void main(String[] args) throws Exception{
		// Make object of  Runnable
		food a = new food();
		Thread pizza = new Thread(a);
		pizza.setName("pizza");
    	Thread coffee = new Thread(a);
		coffee.setName("coffee");
		Thread fries = new Thread(a);
		fries.setName("fries");
		System.out.println("Thread State of Cat before calling start: "+pizza.getState());
		pizza.start();
	    coffee.start();
	    fries.start();
		System.out.println("Thread State of Cat in Main method before Sleep: " + pizza.getState());
	    System.out.println("Thread State of coffee in Main method before Sleep: " + coffee.getState());
	    System.out.println("Thread State of  fries in Main method before Sleep: " + fries.getState());
		Thread.sleep(10000);
		System.out.println("Thread State of Cat in Main method after sleep: " + pizza.getState());
		System.out.println("Thread State of coffee in Main method after sleep: " + coffee.getState());
		System.out.println("Thread State of fries in Main method after sleep: " +  fries.getState());		
	}
}

class food implements Runnable {
	@Override
	public void run() {
		for (int x = 1; x < 4; x++) {
			System.out.println("Run by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Thread State of: "+ Thread.currentThread().getName()+ " - "+Thread.currentThread().getState());
		System.out.println("Exit of Thread: "
				+ Thread.currentThread().getName());
	}
}