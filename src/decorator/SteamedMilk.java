package decorator;

public class SteamedMilk extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }
}
