package obserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

    private ArrayList<Obserwator> obserwatorzy;
    private float temperatura;
    private float cisnienie;
    private float wilgotnosc;

    public DanePogodowe() {
        obserwatorzy = new ArrayList();
    }

    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    public void usunObserwatora(Obserwator o) {
        int index = obserwatorzy.indexOf(o);
        if (index >= 0) {
            obserwatorzy.remove(index);
        }
    }

    public void powiadomObserwatorow() {
        for (Obserwator o : obserwatorzy) {
            o.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void ustawStan(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        powiadomObserwatorow();
    }
}
