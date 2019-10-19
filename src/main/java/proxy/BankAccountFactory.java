package proxy;

public class BankAccountFactory extends PaymentFactory {

    public Payment bank() {
        return new BankAccount();
    }
}
