import java.util.*;
public class ArrayOutOfBoundsException {
    
    public static void main(String[] args)
    {
        ArrayList<String> lis = new ArrayList<>();
        lis.add("My");
        lis.add("Name");
        System.out.println(lis.get(2));
    }
    
}


