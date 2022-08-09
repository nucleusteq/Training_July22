
public class PrimitiveDataTypes{

	public static void main(String[] args){
		//variable declarations
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		
				
		float floatNum;
		double doubleNum;

		char ch;
	
		boolean bool;

		//initilizing variables 
		byteNum=786;
		shortNum= 5800;
		intNum=98765;
		longNum=76543278654l;

		floatNum=987.98765f;
		doubleNum=345.56422367;

		ch='H';
		bool=false;


		System.out.println("Byte Data Type :"+byteNum);
		System.out.println("Short Data Type :"+shortNum);
		System.out.println("Int Data Type :"+intNum);
		System.out.println("Long Data Type :"+longNum);
		System.out.println();

		System.out.println("Float Data Type :"+floatNum);
		System.out.println("Double Data Type :"+doubleNum);

		System.out.println();

		System.out.println("Char Data Type :"+ch);
		System.out.println();
		System.out.println("Boolean Data Type :"+bool);	

		//Modifying the values of variables

		System.out.println();
		System.out.println("After Modification");
		System.out.println();
		
		byteNum= -786;
		shortNum= -5800;
		intNum= -98765;
		longNum= -76543278654l

		floatNum=-987.98765f;
		doubleNum=-345.56422367;

		ch='S';
		bool=true;

		System.out.println("Byte Data Type :"+byteNum);
		System.out.println("Short Data Type :"+shortNum);
		System.out.println("Int Data Type :"+intNum);
		System.out.println("Long Data Type :"+longNum);
		System.out.println();

		System.out.println("Float Data Type :"+floatNum);
		System.out.println("Double Data Type :"+doubleNum);

		System.out.println();

		System.out.println("Char Data Type :"+ch);
		System.out.println();
		System.out.println("Boolean Data Type :"+bool);	

		
	}
}