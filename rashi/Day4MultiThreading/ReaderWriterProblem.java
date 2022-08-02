package com.nuc;

public class ReaderWriterProblem {
	public static String data="Default";
	
//	public String startReading() {
//		return data;
//	}

	public static void main(String[] args)throws Exception {
		WriterProblem w = new WriterProblem();
		
		ReaderProblem r1 = new ReaderProblem();
		ReaderProblem r2= new ReaderProblem();
		ReaderProblem r3 = new ReaderProblem();
		ReaderProblem r4 = new ReaderProblem();
		ReaderProblem r5 = new ReaderProblem();
		ReaderProblem r6 = new ReaderProblem();
		
		w.setName("Teacher Thread");
		r1.setName("Student Thread 1");
		r2.setName("Student Thread 2");
		r3.setName("Student Thread 3");
		r4.setName("Student Thread 4");
		r5.setName("Student Thread 5");
		r6.setName("Student Thread 6");
		
		w.start();
		//w.sleep(1000);
		w.join();
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		
	}

}
