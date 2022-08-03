package FileIO;

import java.io.File;

public class directorylist 
{
    public static void main(String a[])
    {
        File file = new File("C:\\Users\\opera\\eclipse-workspace\\javabasics4\\src\\FileIO");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }
    }
}