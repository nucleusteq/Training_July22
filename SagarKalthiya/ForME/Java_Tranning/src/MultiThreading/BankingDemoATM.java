package MultiThreading;
import java.util.*;

class ac {
	private int balance = 5000;
	public int getBalance() {
	return balance;
	}
	public void withdraw(int amount) {
	balance = balance - amount;
	}
}
public class BankingDemoATM implements Runnable {
	ac acct = new ac();
	public static void main(String[] args) {
		BankingDemoATM r = new BankingDemoATM();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		Thread three = new Thread(r);
		Thread four = new Thread(r);
		one.setName("Ranjeet");
		two.setName("Reema");
		three.setName("sagar");
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
