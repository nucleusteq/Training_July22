package InnerClass;

abstract class Bike{
    void Display(){}
}
class Hero extends Bike{
   public void Display(){
       System.out.println("hero");
   }
}
public class Anonymous{
   public static void main(String[] args) {
       Bike b = new Bike(){
           void Display(){
               System.out.println(" bike");
           }
       };
       b.Display();
   }
}