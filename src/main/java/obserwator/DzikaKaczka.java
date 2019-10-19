package obserwator;

import strategia.*;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        latanieInterfejs = new LatamBoMamSkrzydla();
        kwakanieInterfejs = new Kwacz();
    }

    public DzikaKaczka(LatanieInterfejs latanieInterfejs, KwakanieInterfejs kwakanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
        this.kwakanieInterfejs = kwakanieInterfejs;
    }

    public void wyswietl() {

    }
}
