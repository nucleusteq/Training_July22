package CreateThread;
class Writer implements Runnable{
	public void run() {
		System.out.println("Writer has written something");
	} 
}
class Reader implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is reading");
	}	
}
public class readers {

	public static void main(String[] args) throws InterruptedException {

		Writer writer=new Writer();
		Thread  w = new Thread(writer);
		Reader reader1=new Reader();
		Thread  r1 = new Thread(reader1);
		Reader reader2=new Reader();
		Thread  r2 = new Thread(reader2);
		Reader reader3=new Reader();
		Thread  r3 = new Thread(reader3);
		
		w.setName("Writer");
		r1.setName("Reader1");
		r2.setName("Reader2");
		r3.setName("Reader3");
		
		w.currentThread().setPriority(1);
		w.start();
		
		r1.start();
		r1.join();
		r1.sleep(7000);
		System.out.println(r1.getName()+" done reading");
		
		r2.start();
		r2.join();
		r2.sleep(6000);
		System.out.println(r2.getName()+" done reading");
		
		r3.start();
		r3.join();
		r3.sleep(2000);
		System.out.println(r3.getName()+" done reading");
		
		
		
		
		
		
		
	
		
		
}
}
