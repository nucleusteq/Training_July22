package Money;
public class Account {
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
  

        if (balance >= bal) {
            System.out.println(person.getName() + " " + "tried to withdraw");
            
            balance = balance - bal;
            System.out.println(person.getName() + " " + "has completed the withdraw");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for withdraw ");
        }
        System.out.println(person.getName() + " " + " withdraw Rs." + balance);
  
}

public synchronized void deposit(int bal) {
    
        if (bal > 0) {
            System.out.println(person.getName() + " " + " tried to deposit");
            
            balance = balance + bal;
            System.out.println(person.getName() + " " + "has complete the deposit");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for deposit");
        }
        System.out.println(person.getName() + " " + " deposit Rs." + balance);
     
}}
