package decorator.one;

class Chocolate extends CondimentDecorator {

    private Beverage beverage;

    Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.0D;
    }
}