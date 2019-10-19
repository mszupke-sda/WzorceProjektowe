package adapter;

public class TestowanieKaczki {

    public static void main(String[] args) {

        DzikaKaczka dzikaKaczka = new DzikaKaczka();

        DzikiIndyk dzikiIndyk = new DzikiIndyk();
        Kaczka indykAdapter = new IndykAdapter(dzikiIndyk);

        System.out.println("---- Indyk powiada tak ----");
        dzikiIndyk.gulgocz();
        dzikiIndyk.lataj();

        System.out.println("---- Kaczka powiada tak ----");
        testujKaczke(dzikaKaczka);

        System.out.println("---- IndykAdapter powiada tak ----");
        testujKaczke(indykAdapter);
    }

    private static void testujKaczke(Kaczka kaczka) {
        kaczka.kwacz();
        kaczka.lataj();
    }
}
