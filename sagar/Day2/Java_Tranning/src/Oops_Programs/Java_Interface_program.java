package Oops_Programs;


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
public class Java_Interface_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
