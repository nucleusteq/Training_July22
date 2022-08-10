//Using setName() to change name of the thread.
public class ThreadNaming extends Thread{
	public void run() {
		System.out.println("Run method is executed");
	}
public static void main(String[] args) {
	ThreadNaming thread1 = new ThreadNaming();
	ThreadNaming thread2 = new ThreadNaming();
	ThreadNaming thread3 = new ThreadNaming();
	
	System.out.println("Thread name 1 = "+thread1.getName());
	System.out.println("Thread name 2 = "+thread2.getName());
	System.out.println("Thread name 3 = "+thread3.getName());
	thread1.start();
	
	
	thread1.setName("MyThread");
	thread2.setName("YourThread");
	thread3.setName("Everyone'sThread");
	
	System.out.println(thread1);
	System.out.println("New thread 2 is called "+thread1.getName());
	System.out.println("This is thread 3 "+thread3);
}

}
