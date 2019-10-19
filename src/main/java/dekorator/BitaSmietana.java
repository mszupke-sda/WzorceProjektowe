package dekorator;

public class BitaSmietana extends SkladnikDekorator {

    private final Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Bita śmietana";
    }

    public float koszt() {
        return napoj.koszt() + 1.22f;
    }
}
