package iterator;

public class Kelnerka {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Kelnerka(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void drukujMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.utworzIterator();
        Iterator dinerIterator = dinerMenu.utworzIterator();

        System.out.println("MENU\n----\nŚNIADANIA");
        drukujMenu(pancakeIterator);

        System.out.println("\nLUNCH");
        drukujMenu(dinerIterator);
    }

    private void drukujMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            PozycjaMenu pozycjaMenu = (PozycjaMenu)iterator.next();
            System.out.print(pozycjaMenu.getNazwa() + ", ");
            System.out.print(pozycjaMenu.getCena() + " -- ");
            System.out.println(pozycjaMenu.getOpis());
        }
    }
}
