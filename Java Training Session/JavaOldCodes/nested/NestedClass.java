class Bike{
    class Hero{
        public void display(){
            String str="hero";
        }
        
    }
    class Honda{
        public void show(){
            String stri="honda"; 
        }
        
    }
}
public class NestedClass{
    public static void main(String[] args) {
        Bike b =new Bike();
        Bike.Hero h = b.new Hero();
        h.display();
    }
}