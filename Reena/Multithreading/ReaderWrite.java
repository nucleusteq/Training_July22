package Multithreading;

class ReaderWrite {
	public static String data="Default";
	
	
	public String startReading() {
		return data;
	}
	
	public static void main(String[] args) throws Exception{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Something");
//		String data=sc.nextLine();
		
		WriterThread writerThread=new WriterThread();
		
		Reader readerThread=new Reader();
		Reader readerThread1=new Reader();
		Reader readerThread2=new Reader();
		Reader readerThread3=new Reader();
		Reader readerThread4=new Reader();
		Reader readerThread5=new Reader();
		Reader readerThread6=new Reader();
		Reader readerThread7=new Reader();
		
		
		
		writerThread.setName("Teacher Thread");
		readerThread.setName("Student 1 Thread");
		readerThread1.setName("Student 2 Thread");
		readerThread2.setName("Student 3 Thread");
		readerThread3.setName("Student 4 Thread");
		readerThread4.setName("Student 5 Thread");
		readerThread5.setName("Student 6 Thread");
		readerThread6.setName("Student 7 Thread");
		readerThread7.setName("Student 8 Thread");
	


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
	

	}

}
