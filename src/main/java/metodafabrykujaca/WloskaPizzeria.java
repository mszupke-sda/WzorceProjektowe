package metodafabrykujaca;

public class WloskaPizzeria extends Pizzeria {

    public Pizza utworzPizza(String type) {

        Pizza pizza = null;

        if (type.equals("serowa")) {
            pizza = new WloskaSerowaPizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new WloskaPepperoniPizza();
//        } else if (type.equals("owoceMorza")) {
//            pizza = new WloskaOwoceMorzaPizza();
//        } else if (type.equals("wegetarianska")) {
//            pizza = new WloskaWegetarianskaPizza();
        } else {
            return null;
        }

        return pizza;
    }
}
