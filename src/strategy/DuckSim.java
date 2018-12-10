package strategy;

public class DuckSim {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.fly();
        mallard.quack();

        Duck modelDuck = new ModelDuck();
        modelDuck.fly();
        modelDuck.setFlyBehavior(new RocketFly());
        modelDuck.fly();
    }
}
