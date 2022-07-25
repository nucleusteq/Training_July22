package dataatypes;

public class Data1{
		//use different types of literals
		public static void main(String[] args) {
			byte b = 100;
			short s = 'y';
			int i = 2.35f;
			char c = 1;
		    float f = 2.4f;
			double d = 1234.938;
			long l = 19372635;
			boolean flag = false;
			
			System.out.println("byte value=" +b);
			System.out.println("short value=" +s);
			System.out.println("int value=" +i);
			System.out.println("char value=" +c);
			System.out.println("float value=" +f);
			System.out.println("double value=" +d);
			System.out.println("long value=" +l);
			System.out.println("boolean value=" +flag);


		}

	}

/* output- Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Type mismatch: cannot convert from float to int

at dataatypes.Data1.main(Data1.java:8)*/

