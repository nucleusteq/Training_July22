package interfacesExcercise;

class Phone
{
	public void call() {
		System.out.println("Call a number");
	}
	
	public void sms() {
		System.out.println("Send an SMS");
	}
}
interface MP3Player{
	
	 void play();
	
	 void stop();
}
interface Camera{
	
	 void click();
	  void record();
}
class smartPhone extends Phone implements Camera,MP3Player{
	@Override
	public void play() {
		System.out.println("Play Music");
		
	}
	@Override
	public void stop() {
		System.out.println("Stop Music");
		
	}
	@Override
	public void click() {
		System.out.println("Click a photo");
		
	}
	@Override
	public void record() {
		System.out.println("Record a video");
		
	}
	
}
public class interfacePhone {
	public static void main(String[]args) {
		Phone phone = new smartPhone();
		phone.call();
		phone.sms();
		
		smartPhone smart = new smartPhone();
		smart.play();
		smart.stop();
		smart.click();
		smart.record();
		
	}
}