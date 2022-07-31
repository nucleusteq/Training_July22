package MultiThreading;
//import java.util.Scanner;
public class ReaderWriterMultithreading {
	public static String data="Default";
	
	
	public String startReading() {
		return data;
	}
	
	public static void main(String[] args) throws Exception{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Something");
//		String data=sc.nextLine();
		
		WriterThreadMultithreading writerThread=new WriterThreadMultithreading();
		
		ReaderThreadMultithreading readerThread=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread1=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread2=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread3=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread4=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread5=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread6=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread7=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread8=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread9=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread10=new ReaderThreadMultithreading();
		ReaderThreadMultithreading readerThread11=new ReaderThreadMultithreading();
		
		
		writerThread.setName("Teacher Thread");
		readerThread.setName("Student 1 Thread");
		readerThread1.setName("Student 2 Thread");
		readerThread2.setName("Student 3 Thread");
		readerThread3.setName("Student 4 Thread");
		readerThread4.setName("Student 5 Thread");
		readerThread5.setName("Student 6 Thread");
		readerThread6.setName("Student 7 Thread");
		readerThread7.setName("Student 8 Thread");
		readerThread8.setName("Student 9 Thread");
		readerThread9.setName("Student 10 Thread");
		readerThread10.setName("Student 11 Thread");
		readerThread11.setName("Student 12 Thread");


		writerThread.start();
		writerThread.join();

		readerThread.start();
		readerThread1.start();
		readerThread2.start();
		readerThread3.start();
		readerThread4.start();
		readerThread5.start();
		readerThread6.start();
		readerThread7.start();
		readerThread8.start();
		readerThread9.start();
		readerThread10.start();
		readerThread11.start();

//		sc.close();
	}

}
