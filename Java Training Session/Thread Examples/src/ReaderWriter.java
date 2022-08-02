class Writer implements Runnable{
	public void run() {
		System.out.println("Writer has written something");
		
	} 
	public void writer(int wrt) throws InterruptedException {
		wrt=1;
		do {
			wait(wrt);
			signal(wrt);
			
		}while(true);
	}
	private void signal(int wrt) {
		// TODO Auto-generated method stub
		
	}
}
class Reader implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is reading");
//		try {
//			reader();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void reader() throws InterruptedException {
		int wrt=1;
		int mutex=1;
		int readcnt=0;
		do {
		    
			   // Reader wants to enter the critical section
			   wait(mutex);

			   // The number of readers has now increased by 1
			   readcnt++;                          

			   // there is atleast one reader in the critical section
			   // this ensure no writer can enter if there is even one reader
			   // thus we give preference to readers here
			   if (readcnt==1)     
			      wait(wrt);                    

			   // other readers can enter while this current reader is inside 
			   // the critical section
			   signal(mutex);                   

			   // current reader performs reading here
			   wait(mutex);   // a reader wants to leave

			   readcnt--;

			   // that is, no reader is left in the critical section,
			   if (readcnt == 0) 
			       signal(wrt);         // writers can enter

			   signal(mutex); // reader leaves

			} while(true);
		
	}
	private void signal(int mutex) {
		// TODO Auto-generated method stub
		
	}
}
public class ReaderWriter {
	public static void main(String[] args) throws InterruptedException {
		Writer writer=new Writer();
		Thread  w = new Thread(writer);
		Reader reader1=new Reader();
		Thread  r1 = new Thread(reader1);
		Reader reader2=new Reader();
		Thread  r2 = new Thread(reader2);
		Reader reader3=new Reader();
		Thread  r3 = new Thread(reader3);
		
		w.setName("Writer");
		r1.setName("Reader1");
		r2.setName("Reader2");
		r3.setName("Reader3");
		
		
		w.currentThread().setPriority(1);
		w.start();
		
		r1.start();
		r1.join();
		r1.sleep(7000);
		System.out.println(r1.getName()+" done reading");
		
		r2.start();
		r2.join();
		r2.sleep(6000);
		System.out.println(r2.getName()+" done reading");
		
		r3.start();
		r3.join();
		r3.sleep(2000);
		System.out.println(r3.getName()+" done reading");
		
		
		
		
		
		
		
	
		
		
}
}