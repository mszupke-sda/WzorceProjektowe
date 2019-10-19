package obserwator;

public class WarunkiBiezace implements Obserwator, WyswietlElement {

    private float temperatura;
    private float wilgotnosc;
    private Podmiot danePogodowe;

    public WarunkiBiezace(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura = temp;
        this.wilgotnosc = wilgotnosc;
        wyswielt();
    }

    public void wyswielt() {
        System.out.println("Warunki bieżące " + temperatura + " stopni C oraz " + wilgotnosc + " % wilgotnosci");
    }
}
