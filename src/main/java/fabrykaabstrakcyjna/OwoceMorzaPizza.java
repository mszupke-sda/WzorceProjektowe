package fabrykaabstrakcyjna;

public class OwoceMorzaPizza extends Pizza {

    private FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy;

    public OwoceMorzaPizza(FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy) {
        this.fabrykaSkladnikowPizzy = fabrykaSkladnikowPizzy;
    }

    void przygotowanie() {
        System.out.println("Przygotowywanie: " + nazwa);
        ciasto = fabrykaSkladnikowPizzy.utworzCiasto();
        sos = fabrykaSkladnikowPizzy.utworzSos();
        ser = fabrykaSkladnikowPizzy.utworzSer();
        malze = fabrykaSkladnikowPizzy.utworzMalze();
    }
}
