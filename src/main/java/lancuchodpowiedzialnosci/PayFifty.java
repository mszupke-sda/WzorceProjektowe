package lancuchodpowiedzialnosci;

public class PayFifty extends Pay {

    public void forwardRequest(QuantityPayingMoney quantitypayingmoney) {
        if (quantitypayingmoney == QuantityPayingMoney.PayFifty)
        {
            System.out.println("Pay out fifty dolars from cashpoint");
        }
        else if (pay != null)
        {
            pay.forwardRequest(quantitypayingmoney);
        }
    }
}
