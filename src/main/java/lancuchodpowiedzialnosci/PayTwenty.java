package lancuchodpowiedzialnosci;

public class PayTwenty extends Pay {

    public void forwardRequest(QuantityPayingMoney quantitypayingmoney) {
        if (quantitypayingmoney == QuantityPayingMoney.PayTwenty)
        {
            System.out.println("Pay out twenty dolars from cashpoint");
        }
        else if (pay != null)
        {
            pay.forwardRequest(quantitypayingmoney);
        }
    }
}
