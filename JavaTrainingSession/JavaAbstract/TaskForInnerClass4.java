package JavaTrainingSession.JavaAbstract;
class Bike6{
    static int val = 5;
    float far = 3;
    static class Hero{
        void display(){
            System.out.println("This is display method of Hero!  "+ val);
            // System.out.println("This is display second  "+ far);  this will give an error because far variable is a non static.

        }
    }
}
public class TaskForInnerClass4 {
    public static void main(String[] args) {
        Bike6.Hero obj = new Bike6.Hero();
        obj.display();
}
}
