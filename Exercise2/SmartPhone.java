package student;

public class SmartPhone extends Phone  implements Camera, MusicPlayer{
     
	public static void main(String args[]) {
		
		SmartPhone a = new SmartPhone();
		Camera c = new SmartPhone();
		MusicPlayer m = new SmartPhone();
		a.call();
		c.click();
		a.sms();
		c.record();
		c.play();
		m.stop();
	}

	
}
