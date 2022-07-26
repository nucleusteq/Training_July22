package tasks_oops;

class Phone
{
	  public void call()
	   {
		   System.out.println("Phone can call");
	   }
	   public void sms()
	   {
		   System.out.println("Phone can send SMS");
		}
}
interface camera{
	public void click();
	public void record();
}
	
interface MusicPlayer{
	 void play();
	 void stop();
}
class SmartPhone extends Phone implements camera, MusicPlayer
{
   public void click()
	   {
		   System.out.println("Camera can click");
	   }
   public void record()
		{ 
			System.out.println("Camera can record");
		
		}
   public void play()
	{
		System.out.println("Musicplayer can play");
	}
	public void stop()
	{
		System.out.println("Musicplayer can Stop");
		}
	  
}
public class Interface 
{
	public static void main(String args[])
	{
		Phone phn =  new SmartPhone();
		phn.call();
		phn.sms();
		
		SmartPhone smph = new SmartPhone();
		smph.click();
		smph.record();
		smph.play();
		smph.stop();
	
		
	}
}