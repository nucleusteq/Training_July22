
public class StaticInner {
	static class Hero{
		public void Meth() {
			System.out.println("Static inner class");
		}
	}
	public static void main(String[] args) {
		StaticInner.Hero SI=new StaticInner.Hero();
		SI.Meth();
	}	
	}

