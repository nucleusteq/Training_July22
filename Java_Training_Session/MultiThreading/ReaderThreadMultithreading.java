package MultiThreading;

public class ReaderThreadMultithreading extends Thread{
	static int count=0;
	public void run() {
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		ReaderWriterMultithreading readerWriter=new ReaderWriterMultithreading();
		System.out.println("Student Thread Id :"+Thread.currentThread().getId()+" "+Thread.currentThread().getName()+" Output:  "+readerWriter.startReading());
		count++;
	}
}
