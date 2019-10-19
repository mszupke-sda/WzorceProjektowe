package metodaszablonowa;

public abstract class NapojZKofeina {

    public final void recepturaParzenia() {
        gotowanieWody();
        zaparzanie();
        nalewanieDoFilizanki();
        domieszanieDodatkow();
    }

    public abstract void zaparzanie();

    public abstract void domieszanieDodatkow();

    public void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }

    public void nalewanieDoFilizanki() {
        System.out.println("Nalewanie kawy do filiżanki");
    }
}
