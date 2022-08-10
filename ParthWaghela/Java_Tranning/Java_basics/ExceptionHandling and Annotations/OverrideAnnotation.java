class First {
	public void display() {
	    System.out.println("NucleusTeq");
	}
}

class Second extends First {
	
	@Override
  public void display() {
    System.out.println("class second");
  }
}

public class OverrideAnnotation {
	  
	  public static void main(String[] args) {
		  Second d = new Second();
	    d.display();
	  }
	}