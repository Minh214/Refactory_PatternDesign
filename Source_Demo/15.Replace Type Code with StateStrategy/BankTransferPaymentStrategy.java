public class BankTransferPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println(Processing bank transfer payment...);
    }
}
