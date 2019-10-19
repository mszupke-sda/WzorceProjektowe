package polecenie;

public class MiniPilot {

    Polecenie slot;

    public void ustawPolecenie(Polecenie polecenie) {
        slot = polecenie;
    }

    public void przyciskZostalNacisniety() {
        slot.wykonaj();
    }
}
