public class SuppressWarning {
    @SuppressWarnings({ "unchecked", "deprecation" })
    public static void display() {
        System.out.println("Here is a Supress Warning");
    }

    public static void main(String[] args) {
        display();
    }
}