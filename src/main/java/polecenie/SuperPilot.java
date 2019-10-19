package polecenie;

public class SuperPilot {

    Polecenie[] poleceniaWlacz;
    Polecenie[] poleceniaWylacz;
    Polecenie polecenieWycofaj;

    public SuperPilot() {

        poleceniaWlacz = new Polecenie[7];
        poleceniaWylacz = new Polecenie[7];

        Polecenie brakPolecenia = new BrakPolecenia();
        for (int i = 0; i < 7; i++) {
            poleceniaWlacz[i] = brakPolecenia;
            poleceniaWylacz[i] = brakPolecenia;
        }
        polecenieWycofaj = new BrakPolecenia();
    }

    public void ustawPolecenie(int slot, Polecenie polecenieWlacz, Polecenie polecenieWylacz) {
        poleceniaWlacz[slot] = polecenieWlacz;
        poleceniaWylacz[slot] = polecenieWylacz;
    }

    public void wcisnietoPrzyciskWlacz(int slot) {
        poleceniaWlacz[slot].wykonaj();
        polecenieWycofaj = poleceniaWylacz[slot];
    }

    public void wcisnietoPrzyciskWylacz(int slot) {
        poleceniaWylacz[slot].wykonaj();
        polecenieWycofaj = poleceniaWlacz[slot];
    }

    public void wcisnietoPrzyciskWycofaj() {
        polecenieWycofaj.wycofaj();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- SuperPilot -----\n");
        for (int i = 0; i < poleceniaWlacz.length; i++) {
            stringBuffer.append("[slot" + i + "]" + poleceniaWlacz[i].getClass().getName()
            + "         " + poleceniaWylacz[i].getClass().getName());
        }

        return stringBuffer.toString();
    }
}
