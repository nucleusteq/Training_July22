
class Bike{
    class Hero{
        void display(){
            System.out.println("This is display method of Hero!");
        }
    }
    class Honda{
        void show(){
            System.out.println("This is show method of Honda!");
        }
    }

}


public class TaskForInnerClass1 {
    public static void main(String[] args) {
        Bike.Hero heroo = new Bike().new Hero();
        Bike.Honda hondaa = new Bike().new Honda();
        heroo.display();
        hondaa.show();    
}
}
