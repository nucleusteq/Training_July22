class  Reader extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" reads file");
	}
}
class Writer extends Thread{
	public void run() {
		System.out.println("File written");
	}
}
public class ReaderWriter {
	public static void main(String[] args) throws InterruptedException {
		Writer W = new Writer();
		W.setName("Writer");
		Reader R1 = new Reader();
		R1.setName("Reader 1");
		Reader R2 = new Reader();
		R2.setName("Reader 2");
		Reader R3 = new Reader();
		R3.setName("Reader 3");
		
		
		W.setPriority(1);
		W.start();
		
		R1.start();
		R1.sleep(2000);
		System.out.println(R1.getName()+" has read the file");
		
		R2.start();
		R2.sleep(4000);
		System.out.println(R2.getName()+" has read the file");
		
		R3.start();
		R3.sleep(6000);
		System.out.println(R3.getName()+" has read the file");
	
	}

}
