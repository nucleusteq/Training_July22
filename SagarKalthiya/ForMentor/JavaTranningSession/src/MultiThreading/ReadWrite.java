package MultiThreading;

class  Reader extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is Reading the files");
	}
}
class Writer extends Thread{
	public void run() {
		System.out.println("Teacher is Writing on File");
	}
}
public class ReadWrite {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Writer W = new Writer();
		W.setName("Teacher");
		Reader R1 = new Reader();
		R1.setName("Student 1");
		Reader R2 = new Reader();
		R2.setName("Student 2");
		Reader R3 = new Reader();
		R3.setName("Student 3");
		
		
		W.setPriority(1);
		W.start();
		
		R1.start();
		R1.sleep(1000);
		System.out.println(R1.getName()+" has read the file");
		
		R2.start();
		R2.sleep(2000);
		System.out.println(R2.getName()+" has read the file");
		
		R3.start();
		R3.sleep(3000);
		System.out.println(R3.getName()+" has read the file");

	}

}
