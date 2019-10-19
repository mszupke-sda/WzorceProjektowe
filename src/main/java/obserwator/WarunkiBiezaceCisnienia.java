package obserwator;

public class WarunkiBiezaceCisnienia implements Obserwator, WyswietlElement {

    private float cisnienie;
    private Podmiot danePogodowe;

    public WarunkiBiezaceCisnienia(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.cisnienie = cisnienie;
        wyswielt();
    }

    public void wyswielt() {
        System.out.println("Aktualne cisnienie: " + cisnienie + " hPa");
    }
}
