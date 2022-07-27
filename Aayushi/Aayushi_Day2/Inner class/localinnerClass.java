
class BIKES{
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
public class localinnerClass{
    public static void main(String[] args) {
        BIKES bike = new BIKES();
        bike.Display();
    }
}