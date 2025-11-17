package Strategy_Pattern;

public class StrategyMain {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Add items
        cart.addItem(new Item(40));
        cart.addItem(new Item(60));

        // Choose payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876");
        PaymentStrategy paypal = new PayPalPayment("hidhasmoha@example.com");
        PaymentStrategy upi = new UPIPayment("hidhas@upi");
        PaymentStrategy crypto = new cryptoPaymentExtension("abc-wallet-0123");

        // Card Payment
        cart.pay(creditCard);

        // PayPal
        cart.pay(paypal);

        // UPI
        cart.pay(upi);

        // crypto extension
        cart.pay(crypto);

    }
}
