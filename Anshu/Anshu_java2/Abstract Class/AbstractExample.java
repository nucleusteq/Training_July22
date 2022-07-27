import javax.swing.event.SwingPropertyChangeSupport;

abstract class Shape{
    void perimeter(int l,int b){

    }
    void area(int l,int b){

    }

}
class Rectangle extends Shape{
    void perimeter(int l,int b){
        int P = 2*(l+b);
        
        System.out.println("perimeter is 2(l+b)" +P);
    }
    void area(int l,int b){
        int A= 2*l*b;
        System.out.println("Area is" +A);
    }

}
class Circle extends Shape{
    void perimeter(){
        System.out.println("perimeter of circle"); 
    }
    void area(){
        System.out.println("area of circle ");
    }
}

public class AbstractExample{
    public static void main(String[] args) {
        Rectangle r= new Rectangle();

        r.perimeter(40, 20);
        r.area(30,30);
        Circle c =new Circle();
        c.perimeter();
        c.area();

    }
}
