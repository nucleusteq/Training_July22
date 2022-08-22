package decorator.one;

class Mocha extends CondimentDecorator {

    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.5D;
    }
}
