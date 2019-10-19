package fabrykaabstrakcyjna;

public class WloskaFabrykaSkladnikowPizzy implements FabrykaSkladnikowPizzy {

    public Ciasto utworzCiasto() {
        return new CienkieChrupkieCiasto();
    }

    public Sos utworzSos() {
        return new SosMarinara();
    }

    public Ser utworzSer() {
        return new SerReggiano();
    }

    public Warzywo[] utworzWarzywa() {
        Warzywo warzywa[] = { new Czosnek(), new Cebula(), new Pieczarki(),
            new CzerwonaPapryka() };

        return warzywa;
    }

    public Pepperoni utworzPepperoni() {
        return new PlastryPepperoni();
    }

    public Malze utworzMalze() {
        return new SwiezeMalze();
    }
}
