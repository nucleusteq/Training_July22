public class BitwiseAndBitShiftingOperators{
	public static void main(String[] args){
		int num1=6;
		int num2=8;
			
		System.out.println("num1 : "+num1 +" num2: "+num2);
		int bitwiseOr= num1 | num2; //bitwise or operator 
		System.out.println("Bitwise or operation : "+ bitwiseOr);
		
		int bitwiseAnd= num1 & num2; //bitwise and operator 
		System.out.println("Bitwise and operation : "+ bitwiseAnd);

		int bitwiseXor= num1 ^ num2; //bitwise xor operator 
		System.out.println("Bitwise xor operation : "+ bitwiseXor);

		int bitwiseComplement= ~num1; //bitwise complement operator 
		System.out.println("Bitwise complement operation : "+ bitwiseComplement);

		int leftShift= num1 << 2;
		System.out.println("Left Shif Operation : "+ leftShift);
		
		int rightShift= num1 >> 2;
		System.out.println("Right Shif Operation : "+ rightShift);
		
	}
}