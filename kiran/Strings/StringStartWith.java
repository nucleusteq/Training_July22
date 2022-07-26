
public class StringStartWith {

		public static void main(String[] args){
			String str="Welcome to basic course on java";
			System.out.println(str.startsWith("Welcome"));// it will print true as the string starts with Welcome
			System.out.println(str.startsWith("welcome")); // it will print false as the string does not starts with welcome with a small w
			System.out.println(str.startsWith("Wel"));// it will print true as the string starts with wel

		}
	}

