
public class PrimitiveDataTypes{

	public static void main(String...args){
		//declaring variables
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		
				
		float floatNum;
		double doubleNum;

		char ch;
	
		boolean bool;

		//initilizing variables 
		byteNum=125;
		shortNum= 3200;
		intNum=2147483646;
		longNum=9223372036854775806l;

		floatNum=777.1234567f;
		doubleNum=777.12345678987654;

		ch='M';
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

		//Modifying the values of variables

		System.out.println();
		System.out.println("After Modification");
		System.out.println();
		byteNum=-125;
		shortNum= -3200;
		intNum=-2147483646;
		longNum=-9223372036854775806l;

		floatNum=-777.1234567f;
		doubleNum=-777.12345678987654;

		ch='R';
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

		
	}
}