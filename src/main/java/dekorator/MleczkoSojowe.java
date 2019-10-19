package dekorator;

public class MleczkoSojowe extends SkladnikDekorator {

    private final Napoj napoj;

    public MleczkoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", Mleczko sojowe";
    }

    public float koszt() {
        return napoj.koszt() + 1.88f;
    }
}
