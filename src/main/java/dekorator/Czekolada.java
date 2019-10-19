package dekorator;

public class Czekolada extends SkladnikDekorator {

    private final Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Czekolada";
    }

    public float koszt() {
        return napoj.koszt() + 1.11f;
    }
}
