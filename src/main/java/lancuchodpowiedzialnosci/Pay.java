package lancuchodpowiedzialnosci;

public abstract class Pay {

    protected Pay pay;

    public void setPayOut(Pay pay)
    {
        this.pay = pay;
    }

    public abstract void forwardRequest(QuantityPayingMoney quantitypayingmoney);
}
