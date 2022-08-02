

package JavaTrainingSession;

class Bike5{
	void display()throws NullPointerException
	{
		throw new NullPointerException("\nexception using throw.");
	}
	
}


public class JavaThrow{
    public static void main(String[] args){
        try{
        	Bike5 name = new Bike5();
        	name.display();
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        
        finally{
            System.out.println("abc");
        }
    }
}