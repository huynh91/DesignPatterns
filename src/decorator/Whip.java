package decorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        double extraCost;
        switch (getSize()) {
            case TALL:
                extraCost = 0.10;
                break;
            case GRANDE:
                extraCost = 0.15;
                break;
            default:
                extraCost = 0.20;
                break;
        }
        return beverage.cost() + extraCost;
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }
}
