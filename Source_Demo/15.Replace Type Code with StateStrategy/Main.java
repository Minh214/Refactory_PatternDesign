public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new Payment(new CreditCardPaymentStrategy(), 100.00);
        creditCardPayment.processPayment();

    }
}