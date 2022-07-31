class SleepTest implements Runnable
{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("hello users i am here");
		}
	}
}
public class ThreadExample2 {
	public static void main(String[] args) throws InterruptedException {
		SleepTest st =new SleepTest();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		Thread t3 = new Thread(st);
		Thread t4 = new Thread(st);
		System.out.println("inside the main test");
		t1.start();
	//	t2.start();
	//	t3.start();
	//	t4.start();
		t1.setName("Piyush");
		t2.setName("Yuvraj");
		t3.setName("rashi");
		t4.setName("ayush");
		System.out.println("the current thread is" +t1.currentThread().getId()+  " " +t1.getName() +" " +t1.getState());
		t1.sleep(10000);
		System.out.println("the current thread is" +t2.currentThread().getId()+  " " +t2.getName() +" " +t2.getState());
		
		System.out.println("the current thread is" +t3.currentThread().getId()+  " " +t3.getName() +" " +t3.getState());
		
		System.out.println("the current thread is" +t4.currentThread().getId()+  " " +t4.getName() +" " +t4.getState());}}
		