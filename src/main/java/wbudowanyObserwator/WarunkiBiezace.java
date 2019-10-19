package wbudowanyObserwator;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements Observer, WyswietlElement {

    private float temperatura;
    private float wilgotnosc;
    // private Podmiot danePogodowe;

    public WarunkiBiezace(Observable observable) {
//        this.danePogodowe = danePogodowe;
//        danePogodowe.zarejestrujObserwatora(this);
        observable.addObserver(this);
    }

    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura = temp;
        this.wilgotnosc = wilgotnosc;
        wyswielt();
    }

    public void wyswielt() {
        System.out.println("Warunki bieżące " + temperatura + " stopni C oraz " + wilgotnosc + " % wilgotnosci");
    }

    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe)o;
            temperatura = danePogodowe.getTemperatura();
            wilgotnosc = danePogodowe.getCisnienie();

            wyswielt();
        }
    }
}
