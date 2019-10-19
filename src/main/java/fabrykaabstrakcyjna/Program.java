package fabrykaabstrakcyjna;

public class Program {

    public static void main(String[] args) {


        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        wloskaPizzeria.zamowPizza("serowa");

        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
        amerykanskaPizzeria.zamowPizza("serowa");
    }
}
