package fabrykaabstrakcyjna;

public class WloskaPizzeria extends Pizzeria {

    public Pizza utworzPizza(String type) {

        Pizza pizza = null;
        FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy = new WloskaFabrykaSkladnikowPizzy();

        if (type.equals("serowa")) {

            pizza = new SerowaPizza(fabrykaSkladnikowPizzy);
            pizza.ustawNazwa("Włoska pizza serowa");
        }

        return pizza;
    }
}
