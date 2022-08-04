public class StringStartsWith{
	public static void main(String[] args){
		String str="Welcome to NucleusTeq";
		System.out.println(str.startsWith("Welcome"));// it will print true as the string starts with "Welcome".
		System.out.println(str.startsWith("welcome")); // it will print false as the string does not starts with welcome with "w".
		System.out.println(str.startsWith("W"));// it will print true as the string starts with "W".

	}
}