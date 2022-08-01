package thread;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	public class Thread extends Thread implements Runnable {
	private People person;
	public Thread(People p) {
	    this.person = p;
	}
	public static void main(String[] args) {
	    Thread ts1 = new Thread(new People("Husband"));
	    ts1.start();
	    Thread ts2 = new Thread(new People("Wife"));
	    ts2.start();
	   
	}
	@Override
	public void run() {
	    for (int i = 0; i < 3; i++) {
	        
	            BankAccount acc = BankAccount.getAccount(person);
	            acc.withdraw(100);
	           
	            if (acc.getBal() < 0) {
	                System.out.println("account is empty!");
	            }
	            acc.deposit(200);
	       
	    }
	    System.out.println("Final Account balance is Rs." + BankAccount.getBal());
	}
	}

