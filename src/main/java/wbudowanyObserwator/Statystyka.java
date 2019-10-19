package wbudowanyObserwator;

import java.util.Observable;
import java.util.Observer;

public class Statystyka implements Observer, WyswietlElement {

    private float maxTemp = 200;
    private float minTemp = 0;
    private float sumTemp = 0;
    private int iloscOdczytow;

    public Statystyka(Observable observable) {
//        this.danePogodowe = danePogodowe;
//        danePogodowe.zarejestrujObserwatora(this);
        observable.addObserver(this);
    }

//    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
//        iloscOdczytow++;
//        sumTemp += temp;
//
//        if (temp > maxTemp) {
//            maxTemp = temp;
//        }
//
//        if (temp < minTemp) {
//            minTemp = temp;
//        }
//
//        wyswielt();
//    }

    public void wyswielt() {
        System.out.println("średnia/maksymalna/minimalna temperatura = " + (sumTemp / iloscOdczytow) + "/" + maxTemp + "/" + minTemp);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe)o;
            iloscOdczytow++;
            sumTemp += danePogodowe.getTemperatura();
            float temp = danePogodowe.getTemperatura();

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            wyswielt();
        }
    }
}
