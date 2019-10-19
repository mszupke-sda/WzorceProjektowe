package dekorator;

public class Mleko extends SkladnikDekorator {

    private final Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleko";
    }

    public float koszt() {
        return napoj.koszt() + 0.99f;
    }
}
