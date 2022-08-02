
import java.io.File;
public class Listing_Files_Directory 
{
public void FileNames(File[] a, int i, int v)
{
	if(i==a.length)
	{
		return;
	}
	if(a[i].isFile())
	{
		System.out.println(a[i].getName());
	}
	FileNames(a, i+1, v);
}
	public static void main(String[] args) 
	{
		String path = "E://Documents";
		File fobj= new File(path);
		Listing_Files_Directory obj=new Listing_Files_Directory();
		if(fobj.exists() && fobj.isDirectory())
		{
			File a[] = fobj.listFiles();
			System.out.println("Displaying Files from the directory:" +fobj);
			obj.FileNames(a,0,0);
		}
	}

}
