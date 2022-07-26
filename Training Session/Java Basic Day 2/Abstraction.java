abstract class Shape {
    abstract void perimeter();
    abstract void area() ;
  }
  class Circle extends Shape{
    void perimeter(){
        System.out.println("perimeter of circle");
    }
    void area(){
        System.out.println("area of circle ");
    }
  }
  class Rectangle extends Shape{
    void perimeter(){
        System.out.println("perimeter of rectangle");
    }
    void area(){
        System.out.println("area of rectangle");
    }
  }
public class Abstraction {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.perimeter();
        s.area();
        Shape r=new Rectangle();
        r.area();
        r.perimeter();
    }
}
