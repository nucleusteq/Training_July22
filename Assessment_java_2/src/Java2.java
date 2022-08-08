public class Java2 extends Thread {
	public void run() {
		
	}
	
	
	
	public static void main(String[] args) {
		Set<String> weather = new TreeSet<>();
		
		Java2 thread = new Java2();
		thread.start();
	}
}
