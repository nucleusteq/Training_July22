public class revcopy {
    public static void main(String[] args) {
        int[] arr ={45,12,78,77,12};
        int[] rev =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] =arr[arr.length-i-1];
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]+",");
        }
    }
}