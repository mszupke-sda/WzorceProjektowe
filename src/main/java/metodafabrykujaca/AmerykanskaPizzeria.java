package metodafabrykujaca;

public class AmerykanskaPizzeria extends Pizzeria {

    public Pizza utworzPizza(String type) {

        Pizza pizza = null;

        if (type.equals("serowa")) {
            pizza = new AmerykanskaSerowaPizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new AmerykanskaPepperoniPizza();
//        } else if (type.equals("owoceMorza")) {
//            pizza = new AmerykanskaOwoceMorzaPizza();
//        } else if (type.equals("wegetarianska")) {
//            pizza = new AmerykanskaWegetarianskaPizza();
        } else {
            pizza = null;
        }

        return pizza;
    }
}
