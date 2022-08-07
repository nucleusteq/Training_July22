
public class DisplayDigits {
	public static void main(String[] args)
    {
        // Declaring the number
        int number = 110102;
 
        // Converting the integer input to string data
        String string_number = Integer.toString(number);
 
        // Traversing through the string using for loop
        for (int i = 0; i < string_number.length(); i++) {
 
            // Printing the characters at each position
            System.out.println(string_number.charAt(i));
        }
    }
}

