package decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this(CoffeeSize.GRANDE);
    }

    public DarkRoast(CoffeeSize size) {
        description = "Dark Roast Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
