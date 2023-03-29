public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
        customer.addOrder(this); // add this order to customer's orders
    }

    // getter and setter for customer
}