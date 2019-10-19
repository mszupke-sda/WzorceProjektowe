package fasada;

public class BankAccount {

    private BallanceAccount ballanceAccount;
    private MoneySpend moneySpend;
    private MoneyTransfer moneyTransfer;

    public BankAccount() {
        ballanceAccount = new BallanceAccount();
        moneySpend = new MoneySpend();
        moneyTransfer = new MoneyTransfer();
    }

    public void account() {
        ballanceAccount.displayStateAccount();
    }

    public void moneySpend() {
        moneySpend.moneySpendInLastMonth();
    }

    public void moneyTransfer() {
        moneyTransfer.makeMoneyTransfer();
    }
}
