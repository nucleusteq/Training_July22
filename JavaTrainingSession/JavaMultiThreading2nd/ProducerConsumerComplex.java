package JavaTrainingSession.JavaMultiThreading2nd;

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
	int i=0;
	
	void setCounter(int count) {
		this.counter = count;
	}
	 	 
	 public void run()
	{	
		if(i != counter) {
			System.out.println("\nThis is consumer thread :"+ Thread.currentThread().getName()+" read "+producerClass.read);
			i++;
			
			
		}
		else {
		notifyAll();
	}
		}
}

public class ProducerConsumerComplex {
	public static void main(String[] args) {

		producerClass man1 = new producerClass();
		consumerClass man2 = new consumerClass();
		consumerClass man3 = new consumerClass();
		consumerClass man4 = new consumerClass();
		
		man2.setCounter(3);

		man1.setName("Producer_thread_main");
		man2.setName("CT 1");
		man3.setName("CT 2");
		man4.setName("CT 3");

		man1.start();
		man2.start();
		man3.start();
		man4.start();
		
		
	}
}
