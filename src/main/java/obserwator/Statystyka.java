package obserwator;

public class Statystyka implements Obserwator, WyswietlElement {

    private float maxTemp = 200;
    private float minTemp = 0;
    private float sumTemp = 0;
    private Podmiot danePogodowe;
    private int iloscOdczytow;

    public Statystyka(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        iloscOdczytow++;
        sumTemp += temp;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        wyswielt();

        if (iloscOdczytow >= 2) {
            danePogodowe.usunObserwatora(this);
        }
    }

    public void wyswielt() {
        System.out.println("średnia/maksymalna/minimalna temperatura = " + (sumTemp / iloscOdczytow) + "/" + maxTemp + "/" + minTemp);
    }
}
