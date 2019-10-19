package fabrykaabstrakcyjna;

public class SerowaPizza extends Pizza {

    private FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy;

    public SerowaPizza(FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy) {
        this.fabrykaSkladnikowPizzy = fabrykaSkladnikowPizzy;
    }

    /**
     * metoda realizuje kolejne etapy tworzenia pizzy
     * kiedy potrzebuje jakiegoś składnika, prosi o jego wykonanie fabrykę
     */
    void przygotowanie() {
        System.out.println("Przygotowywanie: " + pobierzNazwa());
        ciasto = fabrykaSkladnikowPizzy.utworzCiasto();
        sos = fabrykaSkladnikowPizzy.utworzSos();
        ser = fabrykaSkladnikowPizzy.utworzSer();
    }
}
