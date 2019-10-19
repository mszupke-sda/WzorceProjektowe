import polecenie.MiniPilot;
import polecenie.PolecenieWlaczSwiatlo;
import polecenie.Swiatlo;

public class PolecenieApp {

    public static void main(String[] args) {

        MiniPilot miniPilot = new MiniPilot();
        Swiatlo swiatlo = new Swiatlo();

        PolecenieWlaczSwiatlo polecenieWlaczSwiatlo
                = new PolecenieWlaczSwiatlo(swiatlo);

        miniPilot.ustawPolecenie(polecenieWlaczSwiatlo);
        miniPilot.przyciskZostalNacisniety();
    }
}
