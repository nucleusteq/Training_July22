package CreateThread;

class test1 implements Runnable {
	public void run() {
	
	}
	}
	class test2 implements Runnable {
		public void run() {
			
		}
	}
		class test3 implements Runnable {
			public void run() {
				
			}}
	


public class CreateThread  {
	public static void main(String[] args) throws InterruptedException {
		test1 test1 =new test1();
		Thread t1 = new Thread(test1);
		test2 test2 = new test2();
		Thread t2 = new Thread(test2);
		test3 test3 = new test3();
		Thread t3 = new Thread(test3);
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
System.out.println("Current State: " + t1.getState()+ ":"+t1.getName());
		
		System.out.println("Current State : " + t3.getState()+ ":"+t3.getName());
		
		System.out.println("Current state : " + t3.getState()+ ":"+t2.getName());
		
		t1.start();
		t2.start();
		t3.start();
System.out.println("Current State: " + t1.getState()+ ":"+t1.getName());
		
		System.out.println("Current State : " + t3.getState()+ ":"+t3.getName());
		
		System.out.println("Current state : " + t2.getState()+ ":"+t2.getName());
		
		t1.sleep(5000);
		System.out.println("Current state : " + t1.getState()+ ":"+t1.getName());
		t2.sleep(4000);
		System.out.println("Current state : " + t2.getState()+ ":"+t2.getName());
		t3.sleep(2000);
		System.out.println("Current state : " + t3.getState()+ ":"+t3.getName());
		
		
	}
}
