public class CaramelSyrup extends CoffeeDecorator {
    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    public double getCost() {
        return wrappedCoffee.getCost() + 40.00;
    }
}