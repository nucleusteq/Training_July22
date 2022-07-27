package inherit;

public class Account {
   int accountNo;
   String name,address;
   int phoneNo;
   int dob;
   int balance;
   
   public int getAccountNo() {
	return accountNo;
}

public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
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

public int getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
}

public int getDob() {
	return dob;
}

public void setDob(int dob) {
	this.dob = dob;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

public Account(int accountNo,int phoneNo,int dob,int balance,String address,String name)
{
	this.accountNo=accountNo;
	this.phoneNo=phoneNo;
	this.dob=dob;
	this.balance=balance;
	this.address=address;
	this.name=name;
	
	}
public void closeAccount()
{
	this.accountNo=0;
	this.phoneNo=0;
	this.dob=0;
	this.balance=0;
	this.address=null;
	this.name=null;
}

   
     
   
}
