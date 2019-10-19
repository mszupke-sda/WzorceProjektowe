package budowniczy;

public class BuilderApp {

    public static void main(String[] args) {
        Client client = new Builder()
                .FirstName("Slawomir")
                .LastName("Kowalski")
                .ZipCode("34 174")
                .MyWallet(456.32)
                .build();

        System.out.println("Data client: "+"\nFirstName: " + client.getFirstName()+
                "\nKowalski: " +client.getLastName() +
                "\nZip code: " + client.getZipCode() +
                "\nWallet: " + client.getMyWallet());
    }
}
