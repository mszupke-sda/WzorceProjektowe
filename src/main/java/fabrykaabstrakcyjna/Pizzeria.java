package fabrykaabstrakcyjna;

public abstract class Pizzeria {

//    private metodafabrykujaca.ProstaFabrykaPizzy prostaFabrykaPizzy;
//
//    public metodafabrykujaca.fabrykaabstrakcyjna.Pizzeria(metodafabrykujaca.ProstaFabrykaPizzy prostaFabrykaPizzy) {
//        this.prostaFabrykaPizzy = prostaFabrykaPizzy;
//    }

    public Pizza zamowPizza(String type) {

//        WloskaFabrykaPizzy wloskaFabrykaPizzy = new WloskaFabrykaPizzy();
//        metodafabrykujaca.fabrykaabstrakcyjna.Pizzeria wloskaPizzeria = new metodafabrykujaca.fabrykaabstrakcyjna.Pizzeria(wloskaFabrykaPizzy);
//        wloskaPizzeria.zamowPizza("wegetariańska");
//
//        AmerykanskaFabrykaPizzy amerykanskaFabrykaPizzy = new AmerykanskaFabrykaPizzy();
//        metodafabrykujaca.fabrykaabstrakcyjna.Pizzeria amerykanskaPizzeria = new metodafabrykujaca.fabrykaabstrakcyjna.Pizzeria(amerykanskaFabrykaPizzy);
//        amerykanskaPizzeria.zamowPizza("wegetariańska");

        Pizza pizza = utworzPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    protected abstract Pizza utworzPizza(String type);

}
