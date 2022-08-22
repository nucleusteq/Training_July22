package decorator.one;

abstract class Beverage {
    String description = "Beverage";

    String getDescription() {
        return description;
    }

    public abstract double cost();
}