package MultiThreading;

public class PrintReverse extends Thread{
	int num;
	PrintReverse(int num){
		this.num=num;
	}
	public void run() {
		System.out.println("Reverse List :");
		for(int i=num;i>=0;i--) {
			System.out.println("Reverse List : "+i);
		}	
	}
	
}
