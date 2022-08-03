class Over {
    public void display() {
        System.out.println("This is  a Method of parent class");
    }
}

class Over1 extends Over {

    @Override
    public void display() {
        System.out.println("This is  a Method of child class");
    }
}

public class OverRide {

    public static void main(String[] args) {
        Over1 ov = new Over1();
        ov.display();
    }
}
