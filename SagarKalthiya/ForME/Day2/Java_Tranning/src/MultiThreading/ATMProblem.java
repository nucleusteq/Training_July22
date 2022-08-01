package MultiThreading;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class Person {
    private String name;

   public Person(String name) {
         this.name = name;
   } 

   public String getName() {
        return name;
   } 

   public void setName(String name) {
         this.name = name;
   }

   @Override
   public String toString() {
        return name;
   }
}

class Account {
     public static Account account;
     private static int balance = 1000;
     private static Person person;

     private Account() {
     }

public static Account getAccount(Person p) {
    if (account == null) {
        account = new Account();
    }
    Account.person = p;
    return account;
}

public static int getBal() {
    return balance;
}

public synchronized void withdraw(int bal) {
    try {

        if (balance >= bal) {
            System.out.println(person.getName() + " " + "is try to withdraw");
            try {
            	//account.notifyAll();
            	Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance - bal;
            System.out.println(person.getName() + " " + "is complete the withdraw");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for withdraw ");
        }
        System.out.println(person.getName() + " " + " withdraw Rs." + balance);
       // account.wait();
    } catch (Exception e) {
        e.printStackTrace();
    }
   
}

public synchronized void deposit(int bal) {
    try {
        if (bal > 0) {
            System.out.println(person.getName() + " " + " is try to deposit");
            try {
            	//account.wait();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance + bal;
            System.out.println(person.getName() + " " + "is complete the deposit");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for deposit");
        }
        System.out.println(person.getName() + " " + " deposit Rs." + balance);
       // account.notifyAll();
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}
public class ATMProblem extends Thread implements Runnable{

	private Person person;

	public ATMProblem(Person p) {
	    this.person = p;
	}
	
	@Override
	public void run() {
		 Account acc = Account.getAccount(person);
	    for (int i = 0; i < 3; i++) {
	        try {
	           
	            acc.withdraw(100);
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException ex) {
	                Logger.getLogger(ATMProblem.class.getName()).log(Level.SEVERE, null, ex);
	            }
	            if (acc.getBal() < 0) {
	                System.out.println("A/c is overdrawn!");
	            }
	            acc.deposit(200);
	            

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println("Final A/c balance is Rs." + Account.getBal());
	    acc.notifyAll();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method 
		    ATMProblem ts1 = new ATMProblem(new Person("Sagar Person 1"));
		    ts1.start();
		    ATMProblem ts2 = new ATMProblem(new Person("Parth person 2"));
		    ts2.start();
		    ATMProblem ts3 = new ATMProblem(new Person("manav person 3"));
		    ts3.start();

	}

}