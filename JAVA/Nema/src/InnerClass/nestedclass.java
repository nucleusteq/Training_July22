package InnerClass;

class Bike{
    class Hero{
        String str="hero";
    }
    class Honda{
        String stri="honda";
    }
}
public class nestedclass{
    public static void main(String[] args) {
        Bike b =new Bike();
        Bike.Hero h = b.new Hero();
        System.out.println(h.str);
    }
}
