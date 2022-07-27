package test;

public class Exception2 {
	public static void main (String[] args)
    {
      
        String ptr = null;
        try
        {
            if (ptr.equals("Yuvraj"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("You cant compare a null String to a String");
        }
    }
}
