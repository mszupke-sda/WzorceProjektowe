package strategia;

public abstract class Kaczka {

    protected LatanieInterfejs latanieInterfejs;
    protected KwakanieInterfejs kwakanieInterfejs;

    public Kaczka() {

    }

    public abstract void wyswietl();

    public void wykonajLec() {
        latanieInterfejs.lec();
    }

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }

    public void plywaj() {
        System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
    }

    public void ustawLatanieInterfejs(LatanieInterfejs latanieInterfejs) {
        this.latanieInterfejs = latanieInterfejs;
    }

    public void ustawKwakanieInterfejs(KwakanieInterfejs kwakanieInterfejs) {
        this.kwakanieInterfejs = kwakanieInterfejs;
    }
}
