package wbudowanyObserwator;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceCisnienia implements Observer, WyswietlElement {

    private float cisnienie;

    public WarunkiBiezaceCisnienia(Observable observable) {
        observable.addObserver(this);
    }

    public void wyswielt() {
        System.out.println("Aktualne cisnienie: " + cisnienie + " hPa");
    }

    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe)o;
            this.cisnienie = danePogodowe.getCisnienie();
            wyswielt();
        }
    }
}
