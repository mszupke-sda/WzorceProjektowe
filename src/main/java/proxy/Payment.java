package proxy;

public interface Payment {

    double checkStateAccount();
    void payOutMoneyFromAccount(double amountPayedOutMoney);
}
