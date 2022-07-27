class Phone
{
	  public void call()
	   {
		   System.out.println("calling available");
	   }
	   public void sms()
	   {
		   System.out.println("SMS send");
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
		   System.out.println("click by camera");
	   }
   public void record()
		{ 
			System.out.println("record by Camera");
		
		}
   public void play()
	{
		System.out.println("play by Musicplayer");
	}
	public void stop()
	{
		System.out.println("Musicplayer stop");
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