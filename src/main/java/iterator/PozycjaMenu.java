package iterator;

public class PozycjaMenu {

    private String nazwa;
    private String opis;
    private boolean wegetarianskie;
    private double cena;

    public PozycjaMenu(String nazwa,
                       String opis,
                       boolean wegetarianskie,
                       double cena) {

        this.nazwa = nazwa;
        this.opis = opis;
        this.wegetarianskie = wegetarianskie;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public boolean isWegetarianskie() {
        return wegetarianskie;
    }

    public double getCena() {
        return cena;
    }
}
