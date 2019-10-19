package wbudowanyObserwator;

import java.util.ArrayList;
import java.util.Observable;

public class DanePogodowe extends Observable {

    // private ArrayList<Obserwator> obserwatorzy;
    private float temperatura;
    private float cisnienie;
    private float wilgotnosc;

    public void powiadomObserwatorow() {
        setChanged();
        notifyObservers();
    }

    public void ustawStan(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        powiadomObserwatorow();
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }
}
