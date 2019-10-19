package proxy;

public class BankAccount implements Payment {

    private double stateMyAccount = 10000;

    public double checkStateAccount()
    {
        return stateMyAccount;
    }

    public void payOutMoneyFromAccount(double amountPayedOutMoney)
    {
        stateMyAccount = stateMyAccount - amountPayedOutMoney;
    }
}
