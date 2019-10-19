package metodaszablonowa.sortowanie;

public class Kaczka implements Comparable {

    private final String nazwa;
    private final int waga;

    public Kaczka(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return nazwa + " waży " + waga;
    }

    public int compareTo(Object o) {

        Kaczka innaKaczka = (Kaczka)o;

        if (this.waga < innaKaczka.waga) {
            return -1;
        } else if (this.waga == innaKaczka.waga) {
            return 0;
        } else {
            return 1;
        }
    }
}
