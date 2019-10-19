package metodafabrykujaca;

import java.util.ArrayList;

public abstract class Pizza {

    String nazwa;
    String ciasto;
    String sos;
    ArrayList dodatki = new ArrayList();

    public void przygotowanie() {
        System.out.println("Przygotowywanie: " + nazwa);
        System.out.println("Wyrabianie ciasta...");
        System.out.println("Dodawanie sosu...");
        System.out.println("Dodatki: ");
        for (int i = 0; i < dodatki.size(); i++) {
            System.out.println(" " + dodatki.get(i));
        }
    }

    public void pieczenie() {
        System.out.println("Pieczenie: 25 minut w temperaturze 350 stopni Celsjusza");
    }

    public void krojenie() {
        System.out.println("Krojenie pizzy na 8 kawałków");
    }

    public void pakowanie() {
        System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzerii.");
    }

    public String pobierzNazwa() {
        return nazwa;
    }
}
