package loops;

public class factorial {
    public static void main(String[] args)
    {
        int n=4,fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is " + fact);
        
        
    }
    
}
