package JavaTrainingSession.JavaMultiThreading;

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
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class consumerClass extends Thread{

	public void run()
	{
		
		while(true) {

			System.out.println("\nThis is consumer thread :"+ Thread.currentThread().getName()+" "+producerClass.read);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ReaderWriter {
	public static void main(String[] args) {

		producerClass man1 = new producerClass();
		consumerClass man2 = new consumerClass();
		consumerClass man3 = new consumerClass();
		consumerClass man4 = new consumerClass();

		man1.setName("Producer Thread Main");
		man2.setName("Consumer Thread 1");
		man3.setName("Consumer Thread 2");
		man4.setName("Consumer Thread 3");

		man1.start();
		man2.start();
		man3.start();
		man4.start();

	}
}
