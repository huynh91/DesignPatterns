package decorator;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();

    @Override
    public abstract CoffeeSize getSize();
}
