package budowniczy;

public class Builder {

    private String firstname;
    private String lastname;
    private String zipcode;
    private double myWallet;
    private String town;
    private String street;
    private int homenumber;

    public Builder FirstName(String firstname)
    {
        this.firstname = firstname;
        return this;
    }

    public Builder LastName(String lastname)
    {
        this.lastname = lastname;
        return this;
    }

    public Builder ZipCode(String zipcode)
    {
        this.zipcode = zipcode;
        return this;
    }

    public Builder MyWallet(double myWallet)
    {
        this.myWallet = myWallet;
        return this;
    }

    public Builder Town(String town)
    {
        this.town = town;
        return this;
    }

    public Builder HomeNumber(int homenumber)
    {
        this.homenumber = homenumber;
        return this;
    }

    public Builder Street(String street)
    {
        this.street = street;
        return this;
    }

    public Client build()
    {
        return new Client(this);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public double getMyWallet() {
        return myWallet;
    }

    public void setMyWallet(double myWallet) {
        this.myWallet = myWallet;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(int homenumber) {
        this.homenumber = homenumber;
    }
}
