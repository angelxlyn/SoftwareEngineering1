public class Order {
    public static void main(String[] args) {
        Coffee order = new BlackCoffee();
        order = new Milk(order);
        order = new CaramelSyrup(order);

        System.out.println("Order: " + order.getDescription());
        System.out.println("Total Cost: ₱ " + order.getCost());
    }
}