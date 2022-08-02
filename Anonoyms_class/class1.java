package Anonoyms1;

abstract class dbms {

	
	     void display(){}
	}
	class computer extends dbms{
	    public void display(){
	        System.out.println("computer class call");
	    }
	}
	
	
	public class class1{
	    public static void main(String[] args) {
	        dbms a = new dbms(){
	            void display(){
	                System.out.println(" dbms subject ");
	            }
	        };
	        a.display();
	    }
	}

