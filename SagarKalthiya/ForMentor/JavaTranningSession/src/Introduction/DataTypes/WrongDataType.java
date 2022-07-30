package Introduction.DataTypes;

public class WrongDataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = true;
		short s = 'y';
		int i = 2.35f;
		char c = 1;
	    float f = 2.4f;
		double d = 1234938;
		long l = 1937.2635;
		boolean flag = 6985;
		
		System.out.println("Byte = " +b);
		System.out.println("Short = " +s);
		System.out.println("Int = " +i);
		System.out.println("Char = " +c);
		System.out.println("Float = " +f);
		System.out.println("Double = " +d);
		System.out.println("Long = " +l);
		System.out.println("Boolean = " +flag);
	}
}
/*Result of the program - Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from boolean to byte
	Type mismatch: cannot convert from float to int
	Type mismatch: cannot convert from double to long
	Type mismatch: cannot convert from int to boolean

	at Introduction.DataTypes.WrongDataType.main(WrongDataType.java:6)
*/
//Type mismatch: cannot convert from float to int
//Syntax error, insert ";" to complete Statement