package iterator;

public class MenuTest {

    public static void main(String[] args) {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Kelnerka kelnerka = new Kelnerka(pancakeHouseMenu, dinerMenu);

        kelnerka.drukujMenu();
    }
}
