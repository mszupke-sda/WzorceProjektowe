package lancuchodpowiedzialnosci;

public class PayFive extends Pay {

    public void forwardRequest(QuantityPayingMoney quantitypayingmoney) {
        if (quantitypayingmoney == QuantityPayingMoney.PayFive)
        {
            System.out.println("Pay out five dolars from cashpoint");
        }
        else if (pay != null)
        {
            pay.forwardRequest(quantitypayingmoney);
        }
    }
}
