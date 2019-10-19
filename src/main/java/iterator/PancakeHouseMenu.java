package iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {

    ArrayList pozycjeMenu;

    public PancakeHouseMenu() {
        pozycjeMenu = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        PozycjaMenu menuItem = new PozycjaMenu(name, description, vegetarian, price);
        pozycjeMenu.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return pozycjeMenu;
    }

    public Iterator utworzIterator() {
        return new PancakeHouseMenuIterator(pozycjeMenu);
    }

    public String toString() {
        return "Pancake House Menu";
    }
}
