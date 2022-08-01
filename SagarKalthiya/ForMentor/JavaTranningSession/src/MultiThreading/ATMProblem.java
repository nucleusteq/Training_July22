package MultiThreading;
/*
 * This Code Is not completed Yet I am working on it 
 * In this i am just using withdraw money only i am implementing deposit method also 
 * */
class account {
	private int balance = 500;
	public int getBalance() {
	return balance;
	}
	public void withdraw(int amount) {
	balance = balance - amount;
	}
}
public class ATMProblem implements Runnable {
	account acct = new account();
	public static void main(String[] args) {
		ATMProblem r = new ATMProblem();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		Thread three = new Thread(r);
		Thread four = new Thread(r);
		one.setName("sagar");
		two.setName("rashi");
		three.setName("manav");
		four.setName("parth");
		one.start();
		two.start();
		three.start();
		four.start();
	}
	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}
	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
		}
	}
}

