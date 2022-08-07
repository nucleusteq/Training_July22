import java.io.File;

public class FileList
{
    public static void main(String a[])
    {
        File file = new File("C:\\GIT 2\\Training_July22\\kiran");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }
    }
}
