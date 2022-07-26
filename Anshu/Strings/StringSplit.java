public class StringSplit{

	public static void main(String[] args){
		String str="Basics on java";
		String[] array=str.split("\\s");
		for(String s:array){
			System.out.println(s);
		}

	}
}