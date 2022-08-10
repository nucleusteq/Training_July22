
abstract class bike{
	 abstract void display();
}

 class Hero {
	public static void main(String[] args) { 
	     bike b=new bike() {
	    	 void display() {
	    		 System.out.print("Hello");
	    	 }
	     };
	     b.display();
	}
}
