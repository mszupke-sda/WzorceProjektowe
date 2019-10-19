package polecenie;

public class Swiatlo {

    String name;

    public Swiatlo(String name) {
        this.name = name;
    }

    public Swiatlo() {

    }

    public void wlacz() {
        System.out.println("włącz światło");
    }

    public void wylacz() {
        System.out.println("wyłącz światło");
    }
}
