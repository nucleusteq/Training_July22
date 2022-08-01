package MultiThreading;

public class SetThreadNameClass extends Thread {
	
	public void run() {
		System.out.println("Run method is executed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetThreadNameClass thread1 = new SetThreadNameClass();
		SetThreadNameClass thread2 = new SetThreadNameClass();
		SetThreadNameClass thread3 = new SetThreadNameClass();
		
		System.out.println("Thread name 1 = "+thread1.getName());
		System.out.println("Thread name 2 = "+thread2.getName());
		System.out.println("Thread name 3 = "+thread3.getName());
		thread1.start();
		
		
		thread1.setName("T1");
		thread2.setName("T2");
		thread3.setName("T3");
		
		System.out.println(thread1);
		System.out.println("New T2 is called "+thread2.getName());
		System.out.println("This is T3 "+thread3);

	}

}