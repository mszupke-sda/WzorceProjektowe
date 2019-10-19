package budowniczy;

public class Client {

    public String firstName;
    public String lastName;
    public String zipCode;
    public double myWallet;

    public Client(Builder builder)
    {
        firstName = builder.getFirstname();
        lastName = builder.getLastname();
        zipCode = builder.getZipcode();
        myWallet = builder.getMyWallet();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getMyWallet() {
        return myWallet;
    }

    public void setMyWallet(double myWallet) {
        this.myWallet = myWallet;
    }
}
