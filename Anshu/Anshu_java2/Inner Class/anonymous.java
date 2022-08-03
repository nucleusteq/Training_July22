abstract class Bike{
     void Display(){}
}
class Hero extends Bike{
    public void Display(){
        System.out.println(" hero ");
    }
}
public class anonymous{
    public static void main(String[] args) {
        Bike bike = new Bike(){
            void Display(){
                System.out.println(" bike ");
            }
        };
        bike.Display();
    }
}