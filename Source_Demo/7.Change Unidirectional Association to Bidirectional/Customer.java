public class Customer {
    private List<Order> orders = new ArrayList<>();

    // other properties and methods

    public void placeOrder(Order order) {
        // code to place an order
        orders.add(order); // add the order to the customer's orders
        order.setCustomer(this); // set this customer as the order's customer
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
        order.setCustomer(null); // remove this customer from the order
    }
}





