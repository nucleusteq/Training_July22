package decorator.one;

class Espresso extends Beverage {

    Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 5.7;
    }
}