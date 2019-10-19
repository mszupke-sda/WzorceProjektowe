package lancuchodpowiedzialnosci;

public class Program {

    public static void main(String[] args) {

        //Initializing objects
        Pay payHundred = new PayHundred();
        Pay payFifty = new PayFifty();
        Pay payTwenty = new PayTwenty();
        Pay payFive = new PayFive();

        //Setting elements of a one-way list
        payHundred.setPayOut(payFifty);
        payFifty.setPayOut(payTwenty);
        payTwenty.setPayOut(payFive);

        String option = "3";

        if (option == "1")
        {
            payHundred.forwardRequest(QuantityPayingMoney.PayHundred);
        }
        else if (option == "2")
        {
            payHundred.forwardRequest(QuantityPayingMoney.PayFifty);
        }
        else if (option == "3")
        {
            payHundred.forwardRequest(QuantityPayingMoney.PayTwenty);
        }
        else if (option == "4")
        {
            payHundred.forwardRequest(QuantityPayingMoney.PayFive);
        }
    }
}
