package adapter;

public class IndykAdapter implements Kaczka {

    Indyk indyk;

    public IndykAdapter(Indyk indyk) {
        this.indyk = indyk;
    }

    public void kwacz() {
        indyk.gulgocz();
    }

    public void lataj() {
        indyk.lataj();
    }
}
