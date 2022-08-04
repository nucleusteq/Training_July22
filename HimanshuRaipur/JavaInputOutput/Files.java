package shapes;

import java.io.File;

public class Files {
     public static void main(String a[])
     {
        File file = new File("C:\\GIT\\Training_July22\\HimanshuRaipur");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}