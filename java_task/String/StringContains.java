public class StringContains {
    public static void main(String[] args) {
        String str = "Welcome to basic course on java";
        System.out.println(str.contains("basic"));// it will print true as the string contains basic
        System.out.println(str.contains("manav")); // it will print false as the string does not contains manav
        System.out.println(str.contains("va"));// it will print true as the string contains va in it

    }
}