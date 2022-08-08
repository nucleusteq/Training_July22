package InnerClass;

import java.util.Scanner;

public class Bike {

	private String brandName = "Hero";
	int distanceTravelled;
	double fuelUsed;

	void display() {
		class Hero {
			double calculateMilage() {
				double milage = distanceTravelled / fuelUsed;
				return milage;
			}
		}
		Hero hero = new Hero();
		System.out.println("Milage of your bike is :" + hero.calculateMilage());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distanceTravelled = sc.nextInt();
		double fuelUsed = sc.nextDouble();

		Bike bike = new Bike();
		bike.distanceTravelled = distanceTravelled;
		bike.fuelUsed = fuelUsed;
		bike.display();
	}
}
