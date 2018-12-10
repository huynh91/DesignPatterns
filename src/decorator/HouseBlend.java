package decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this(CoffeeSize.GRANDE);
    }

    public HouseBlend(CoffeeSize size) {
        description = "House Blend Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
