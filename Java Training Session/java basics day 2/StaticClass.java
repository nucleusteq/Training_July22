class Bike{
    static class Hero {
        void display(){
            System.out.println("hero");
        }
    }
}
public class StaticClass{
    Bike.Hero b =new Bike.Hero();
    b.display();
}