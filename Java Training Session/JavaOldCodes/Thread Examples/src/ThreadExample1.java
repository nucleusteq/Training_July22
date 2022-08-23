class Mythread implements Runnable{
	int a,b,c;
	public  Mythread(int a , int b) {
		this.a =a;
		this.b=b;
	}
	public void run() {
		c=a+b;
		System.out.println("sum is" +c);
	}
}
public class ThreadExample1 {
	public static void main(String[] args) {
		Mythread mt =new Mythread(5 , 5);
		Thread t =new Thread(mt);
		t.start();
		System.out.println("out of main method");	
	}	
	
}
	