import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Employee {
    public static void main(String args[]) {
        getData();
        
    }
    public static void getData() {
        
        HashMap<String, Integer> emp = new HashMap<>();
        Scanner obj = new Scanner(System.in);
System.out.println("Enter the number of employees:");
        int N = obj.nextInt();
        obj.nextLine();
        while (N-- > 0) {
System.out.println("Enter employee name: ");
            String name = obj.nextLine();
            System.out.println("Enter employee ID: ");
            int id = obj.nextInt();
            obj.nextLine();
            emp.put(name, id);
        }
        System.out.println(emp);
System.out.println("Enter the employee name of which you want ID: ");
        String search = obj.nextLine();
        if (emp.containsKey(search)) {
            Integer a = emp.get(search);
            System.out.println(search + "=" + a);
        } else {
            System.out.println("Not Found");
        }
    }
            
    }
    
    