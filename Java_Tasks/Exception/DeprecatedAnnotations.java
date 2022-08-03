public class DeprecatedAnnotations {
    @Deprecated
    public static void displayFirst() {
        System.out.println("first Function");
    }

    public static void displaySecond() {
        System.out.println("second function");
    }

    public static void main(String[] args) {

        displayFirst();
        displaySecond();

    }

}