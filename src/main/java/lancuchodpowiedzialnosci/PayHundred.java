package lancuchodpowiedzialnosci;

public class PayHundred extends Pay {

    public void forwardRequest(QuantityPayingMoney quantitypayingmoney) {
        if (quantitypayingmoney == QuantityPayingMoney.PayHundred)
        {
            System.out.println("Pay out hundred dolars from cashpoint");
        }
        else if (pay != null)
        {
            pay.forwardRequest(quantitypayingmoney);
        }
    }
}
