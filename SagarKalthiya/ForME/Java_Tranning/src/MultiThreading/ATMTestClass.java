package MultiThreading;


class BankAccount{
	   private double balance;
	   public BankAccount(double bal) { balance = bal; }
	   public BankAccount() { 
		   this(0);
	   }
	   public synchronized double getBalance() { 
		   return balance;
	   }
	   public synchronized void deposit(double amt) {
	      double temp = balance;
	      temp = temp + amt;
	      try {
	         Thread.sleep(1000); // simulate production time
	      } catch (InterruptedException ie) {
	         System.err.println(ie.getMessage());
	      }
	      System.out.println("after deposit balance = $" + temp);
	      balance = temp;
	      notify();
	   }
	   public synchronized void withdraw(double amt) {
	      while (balance < amt) {
	         try {
	            wait(); // wait for funds
	         } catch (InterruptedException ie) {
	            System.err.println(ie.getMessage());
	         }
	      }
	      double temp = balance;
	      temp = temp - amt;
	      try {
	         Thread.sleep(300); // simulate consumption time
	      } catch (InterruptedException ie) {
	         System.err.println(ie.getMessage());
	      }
	      System.out.println("after withdrawl balance = $" + temp);
	      balance = temp;
	   }
	}



class Producer extends Thread {
	   private BankAccount account;
	   public Producer(BankAccount acct) { account = acct; }
	   public void run() {
	      for(int i = 0; i < 10; i++) {
	         synchronized(account) { account.deposit(10); }
	      }
	   }
	}

	 

	class Consumer extends Thread {
	   private BankAccount account;
	   public Consumer(BankAccount acct){
		   account = acct;
	   }
	   public void run() {
	      for(int i = 0; i < 10; i++) {
	         synchronized(account) { account.withdraw(10); }
	      }
	   }
	}


public class ATMTestClass {
	   public static void main(String[] args) {
	      BankAccount account = new BankAccount(100);
	      int slaveCount = 4;
	      Thread[] slaves = new Thread[slaveCount];
	      for(int i = 0; i < slaveCount; i++) {
	         if (i % 2 == 0) {
	            slaves[i] = new Producer(account);
	         } else {
	            slaves[i] = new Consumer(account);
	         }
	      }
	      for(int i = 0; i < slaveCount; i++) {
	         slaves[i].start();
	      }
	      for(int i = 0; i < slaveCount; i++) {
	         try {
	            slaves[i].join();
	         } catch(InterruptedException ie) {
	               System.err.println(ie.getMessage());
	         } finally {
	            System.out.println("Thread  "+ i + " has died");
	         }
	      }
	      System.out.print("Closing balance = ");
	      System.out.println("$" + account.getBalance());
	   }
}

