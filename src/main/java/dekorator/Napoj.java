package dekorator;

public abstract class Napoj {

    protected String opis = "Nieznany napój";

    public String pobierzOpis() {
        return opis;
    }

    public abstract float koszt();
}
