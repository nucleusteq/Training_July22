abstract class Bike {
    abstract void display();

    abstract double calculateMilage(int distanceTravelled, double fuelUsed);
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Bike bike = new Bike() {
            void display() {
                System.out.println("Anonymous Inner Class");
            }

            double calculateMilage(int distanceTravelled, double fuelUsed) {
                double milage = distanceTravelled / fuelUsed;
                return milage;
            }
        };
        bike.display();
        System.out.println("Bikes milage is: " + bike.calculateMilage(800, 19));
    }
}