public class StringToCharArray {

    public static void main(String[] args) {
        String str = "Welcome to NucleusTeq";
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

    }
}