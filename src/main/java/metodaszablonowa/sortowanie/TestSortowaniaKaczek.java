package metodaszablonowa.sortowanie;

import java.util.Arrays;

public class TestSortowaniaKaczek {

    public static void main(String[] args) {

        Kaczka[] kaczki = {
                new Kaczka("Kaczor Daffy", 8),
                new Kaczka("Kaczor Dewey", 2),
                new Kaczka("Kaczor Howard", 7),
                new Kaczka("Kaczor Louie", 2),
                new Kaczka("Kaczor Donald", 10),
                new Kaczka("Kaczor Huey", 2)
        };

        System.out.println("Przed sortowaniem:");
        wyswietlaj(kaczki);

        Arrays.sort(kaczki);

        System.out.println("\nPo zakończeniu sortowania:");
        wyswietlaj(kaczki);
    }

    private static void wyswietlaj(Kaczka[] kaczki) {
        for (Kaczka kaczka : kaczki) {
            System.out.println(kaczka);
        }
    }
}
