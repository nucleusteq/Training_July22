
import java.io.File;

public class FileList
{
    public static void main(String a[])
    {
        File file = new File("C:\\GIT\\Training_2022\\Training_July22\\Aayushi");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }
    }
}