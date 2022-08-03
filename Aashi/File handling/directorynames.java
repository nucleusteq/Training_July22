package fileIO;

import java.io.File;
 
public class directorynames 
{
    public static void main(String a[])
    {
        File file = new File("C:\\Users\\opera\\eclipse-workspace\\Java 3\\src\\fileIO");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }
    }
}