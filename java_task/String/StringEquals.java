public class StringEquals {

    public static void main(String[] args) {
        String s1 = "nucleusteq";
        String s2 = "nucleusteq";
        String s3 = "NUCLEUSTEQ";
        String s4 = "nucleus";
        System.out.println(s1.equals(s2));// prints true as content of both string is same
        System.out.println(s1.equals(s3));// prints false as content of both the string are same but their case is
                                          // different
        System.out.println(s1.equals(s4));// prints false as content is not same

    }
}