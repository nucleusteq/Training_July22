class Bike{
    static class Hero {
        void Display(){
            System.out.println("hero");
        }
    }
}
public class StaticClass{
    Bike.Hero b =new Bike.Hero();
    b.Display();
}