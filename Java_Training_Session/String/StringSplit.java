public class StringSplit{

	public static void main(String[] args){
		String str="Welcome to basic course on java";
		String[] array=str.split("\\s");
		for(String s:array){
			System.out.println(s);
		}

	}
}