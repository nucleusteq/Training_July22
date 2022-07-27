


class Phone
{
	
	  public void call(){
		   System.out.println("calling");
	   }
	   public void sms() {
		   System.out.println("SMS");
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
		   System.out.println("Camera clicks");
	   }
   public void record()
		{ 
			System.out.println("recording");
		
		}
   public void play()
	{
		System.out.println("plays");
	}
	public void stop()
	{
		System.out.println("Stops");
		}
	  
}
public class interfaceprog {

	public static void main(String[] args) {
	
		Phone ph =  new SmartPhone();
		               ph.call();
		               ph.sms();
		
		SmartPhone sph = new SmartPhone();
		               sph.click();
		               sph.record();
	                	sph.play();
	                   	sph.stop();
	}

}