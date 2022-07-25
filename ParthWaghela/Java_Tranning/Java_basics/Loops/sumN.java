import java.util.*;
public class sumN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int num = sc.nextInt();
        int sum=0;
        
        for(int i=0 ; i <= num ; i++){
            sum = sum + i;
        }
        System.out.print("sum = " +sum);
    }
}
