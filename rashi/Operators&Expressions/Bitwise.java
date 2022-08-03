package introduction;

public class Bitwise {
		public static void main(String[] args) {
			  
		      int n1=40,n2=20, r1,r2,r3,r4,r5;
		  
		      // bitwise OR 
		      r1= n1 | n2;
		      System.out.println(r1); 
		      // bitwise And 
		      r2= n1 & n2;
		      System.out.println(r2);
		      //bitwise right shift
		      r3 = n1 << 10;
		      System.out.println(r3);
		      //System.out.println(r3);​
		      //bitwise left shift
		      r4= n2 >> 10;
		      System.out.println(r4);
		       
		      //bitwise compliment
		      r5= ~n1;
		      System.out.println(r5);
		    }
		  }
