public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
}