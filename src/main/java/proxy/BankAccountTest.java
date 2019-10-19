package proxy;

public class BankAccountTest {

    public static void main(String[] args) {
        int pin = 1223;

        CartBank cartbank = new CartBank();
        cartbank.getPIN(pin);

        if (cartbank.ifPinIsValid)
        {
            System.out.println("The correct pin has been entered, what do you want to do?");
            System.out.println("Withdraw 4,000 USD from the bank");
            cartbank.payOutMoneyFromAccount(4000);
            System.out.println("You have: " + cartbank.checkStateAccount() + " USD left in your account");
        }
        else
        {
            System.out.println("Incorrect pin entered, try again");
        }
    }
}
