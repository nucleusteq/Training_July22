class Bike{
    void Display(){
        class Hero{
            void show(){
                System.out.println("hero");
            }
        }
        Hero h =new Hero();
        h.show();
    }
}
public class Locallyclass{
    public static void main(String[] args) {
        Bike b = new Bike();
        b.Display();
    }
}