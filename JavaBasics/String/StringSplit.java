public class StringSplit{

	public static void main(String[] args){
		String str="Welcome to NucleusTeq!";
		String[] array=str.split("\\s");
		for(String s:array){
			System.out.println(s);
		}

	}
}