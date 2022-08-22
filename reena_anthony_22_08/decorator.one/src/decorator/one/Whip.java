package decorator.one;

class Whip extends CondimentDecorator {

    private Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5D;
    }
}