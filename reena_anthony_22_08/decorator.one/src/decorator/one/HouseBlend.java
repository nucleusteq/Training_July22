package decorator.one;

class HouseBlend extends Beverage {

    HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 3.8;
    }
}