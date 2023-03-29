public class Payment {
    private PaymentStrategy paymentStrategy;
    private double amount;


    public Payment(PaymentStrategy paymentStrategy, double amount) {
        this.paymentStrategy = paymentStrategy;
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void processPayment() {
        paymentStrategy.processPayment(amount);
    }
}
