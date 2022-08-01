package thread;
public class BankAccount {
public static BankAccount account;
private static int balance = 10000;
private static People person;
private BankAccount() {
}
public static BankAccount getAccount(People p) {
    if (account == null) {
        account = new BankAccount();
    }
    BankAccount.person = p;
    return account;
}
public static int getBal() {
    return balance;
}
public synchronized void withdraw(int bal) {
  
        if (balance >= bal) {
            System.out.println(person.getName() + " " + "is trying to withdraw");
            
            balance = balance - bal;
            System.out.println(person.getName() + " " + "has completed the withdrawal");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for withdrawal ");
        }
        System.out.println(person.getName() + " " + " withdraw Rs." + balance);
  
}
public synchronized void deposit(int bal) {
    
        if (bal > 0) {
            System.out.println(person.getName() + " " + " is trying to deposit");
            
            balance = balance + bal;
            System.out.println(person.getName() + " " + "has completed the deposit");
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for deposit");
        }
        System.out.println(person.getName() + " " + " deposit Rs." + balance);
     
}}