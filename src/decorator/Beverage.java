package decorator;

public abstract class Beverage {
    String description = "Unknown beverage";
    private CoffeeSize size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(CoffeeSize size) {
        this.size = size;
    }

    enum CoffeeSize {
        TALL, GRANDE, VENTI
    }
}
