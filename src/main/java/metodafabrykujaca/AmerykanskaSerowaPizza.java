package metodafabrykujaca;

public class AmerykanskaSerowaPizza extends Pizza {

    public AmerykanskaSerowaPizza() {
        nazwa = "Amerykańska metodafabrykujaca.fabrykaabstrakcyjna.Pizza Serowa";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "fabrykaabstrakcyjna.Sos z pomidorów śliwkowych";
        dodatki.add("Grubo tarty ser Mozzarella");
    }

    @Override
    public void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
