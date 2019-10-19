package proxy;

public class CartBank implements Payment {

    Payment bankAccount;
    private int PIN;
    public boolean ifPinIsValid;

    public void getPIN(int pin)
    {
        PIN = pin;
        checkPinIsValid();
    }

    private void checkPinIsValid()
    {
        if (PIN == 1223)
        {
            openAccessToAccount();
            ifPinIsValid = true;
        }
        else
        {
            ifPinIsValid = false;
        }
    }

    private void openAccessToAccount()
    {
        PaymentFactory paymentfactory = new BankAccountFactory();

        bankAccount = paymentfactory.bank();
    }

    public double checkStateAccount()
    {
        return bankAccount.checkStateAccount();
    }

    public void payOutMoneyFromAccount(double amountPayedOutMoney)
    {
        bankAccount.payOutMoneyFromAccount(amountPayedOutMoney);
    }
}
