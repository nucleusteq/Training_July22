package JavaMultiThreading2nd;

class producerClass extends Thread{

	String empty_string="This is Producer";
	static String read;
	int i=0;
	public void run()
	{
		while(true) {

			read = empty_string +" "+ i ;
			System.out.println("\n"+empty_string +" "+ i);
			i++;
			try {
				Thread.currentThread().wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class consumerClass extends Thread{
	
	private int counter;
	int x=0;
	
	void setCounter(int count) {
		this.counter = count;
	}

	 public void run()
	{	
		
		while (x != counter) {
		System.out.println("\nThis is consumer thread :"+ Thread.currentThread().getName()+" read -"
				+ " "+producerClass.read);
		
		Thread.currentThread().notifyAll();
		x++;
		}
	}
}

public class SingleProducerConsumerComplex {
	public static void main(String[] args) {
		
		producerClass man1 = new producerClass();
		consumerClass man2 = new consumerClass();
		
		man1.setName("Producer_thread_main");
		man2.setName("CT 1");

		man1.start();
		man2.start();
		
		
	}
}
