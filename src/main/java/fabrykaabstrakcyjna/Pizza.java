package fabrykaabstrakcyjna;

public abstract class Pizza {

    String nazwa;
    Ciasto ciasto;
    Sos sos;
    Warzywo[] warzywa;
    Ser ser;
    Pepperoni pepperoni;
    Malze malze;

//    public void przygotowanie() {
//        System.out.println("Przygotowywanie: " + nazwa);
//        System.out.println("Wyrabianie ciasta...");
//        System.out.println("Dodawanie sosu...");
//        System.out.println("Dodatki: ");
//        for (int i = 0; i < dodatki.size(); i++) {
//            System.out.println(" " + dodatki.get(i));
//        }
//    }

    abstract void przygotowanie();

    public void pieczenie() {
        System.out.println("Pieczenie: 25 minut w temperaturze 350 stopni Celsjusza");
    }

    public void krojenie() {
        System.out.println("Krojenie pizzy na 8 kawałków");
    }

    public void pakowanie() {
        System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzerii.");
    }

    public void ustawNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String pobierzNazwa() {
        return nazwa;
    }
}
