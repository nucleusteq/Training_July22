abstract class Bike{
     void display(){}
}
class Hero extends Bike{
    public void display(){
        System.out.println("hero");
    }
}
public class Anonymous{
    public static void main(String[] args) {
        Bike b = new Bike(){
            void display(){
                System.out.println(" bike");
            }
        };
        b.display();
    }
}
