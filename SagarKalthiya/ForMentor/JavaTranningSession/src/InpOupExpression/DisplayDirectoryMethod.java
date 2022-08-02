package InpOupExpression;
import java.io.File;

public class DisplayDirectoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this location is from my laptop if you want to check set u r desktop path than it will show all the files of desktop as well application too
		File file = new File("C:\\Users\\opera\\OneDrive\\Desktop");
        String[] fileList = file.list();
        for(String name:fileList)
        {
            System.out.println(name);
        }

	}

}
  /*Out put of this program looks loke this
   * demo
desktop.ini
Docker
Docker Desktop.lnk
docker_prac
Eclipse IDE for Java Developers - 2022-06.lnk
First-Project
First.class
First.java
getting-started-master
git2
git_test
JavaTranningSession
Java_Tranning
New Microsoft Word Document.docx
Postman.lnk
RD9700Driver.zip
Sagar Documents
Visual Studio Code.lnk
Zoom.lnk*/
   */