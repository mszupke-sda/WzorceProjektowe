package fasada;

public class BankApp {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.moneySpend();
        bankAccount.moneyTransfer();
        bankAccount.account();
    }
}
