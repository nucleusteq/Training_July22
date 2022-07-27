public class Account {
    int accountNo,phoneNo,balance;
    String name,address;
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void Account(int a)
    {
        System.out.println("the account number is " );
    }
    punlic void closeAccount(){
        System.out.println("Close the account ");
    }
    class SavingsAccount extends Account 
    {
        public void withdraw(){
            System.out.println(": ");
        }
        public void deposit(){
            System.out.println(" ");
        }
        public void fixedDeposit(){
            System.out.println(" ");
        }
    }
    class LoanAccount extends Account
    {
        public void payEMI(){
            System.out.println(" ");
        }
        public void topUpLoan(){
            System.out.println(" ");
        }
        public void repayment(){
            System.out.println(" ");
        }
    }

    
}

