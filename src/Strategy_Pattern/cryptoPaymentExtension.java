package Strategy_Pattern;

public class cryptoPaymentExtension implements PaymentStrategy {
    private String walletAddress;

    public cryptoPaymentExtension(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Crypto Wallet.");
    }
}
