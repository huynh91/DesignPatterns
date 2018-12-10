package decorator;

public class Expresso extends Beverage {
    public Expresso() {
        this(CoffeeSize.GRANDE);
    }

    public Expresso(CoffeeSize size) {
        setSize(size);
        description = "expresso";
    }

    public double cost() {
        return 1.99;
    }
}
