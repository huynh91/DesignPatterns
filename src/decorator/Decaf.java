package decorator;

public class Decaf extends Beverage {
    public Decaf() {
        this(CoffeeSize.GRANDE);
    }

    public Decaf(CoffeeSize size) {
        description = "Decaf Coffee";
        setSize(size);
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
