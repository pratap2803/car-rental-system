public class CreditCardPayment implements PaymentProcessor{
    @Override
    public boolean processPayment(double amount) {
        // Process credit card payment
        return true;
    }
}
