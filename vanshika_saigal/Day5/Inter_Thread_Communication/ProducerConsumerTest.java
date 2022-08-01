
public class ProducerConsumerTest {
	public static void main(String[] args) {
	      CubbyHole c = new CubbyHole();
	      Producer p1 = new Producer(c);
	      Consumer c1 = new Consumer(c);
	      p1.start(); 
	      c1.start();
	   }
	}


