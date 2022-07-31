package CreateThread;

class fibonacci implements Runnable{
	
	public void run() {
		int a =0 ,b =1,c=1;
	System.out.println("The first 10 fibonacci series is : ");
	for(int i=0;i<10;i++) {
		System.out.println(c);
		c=a+b;
		a=b;
		b=c;
		
	}
	}
}
class sum implements Runnable{
	public void run() {
		int total=0;
		for(int i=0;i<=10;i++) {
			total =total+i;
		}
		System.out.println("The sum of 0-10 is : "+total);
	}
}
class printing implements Runnable{
	public void run() {
		System.out.println("Printing number 0 to 10 in reverse order :");
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
	}
}
public class triplethread {
	public static void main(String[] args)throws InterruptedException {
		fibonacci f = new fibonacci();
		Thread fb = new Thread(f);
		sum s=new sum();
		Thread su=new Thread(s);
		printing print =new printing();
		Thread pr = new Thread(print);
		fb.start();
		su.start();
		pr.start();
	}
}
