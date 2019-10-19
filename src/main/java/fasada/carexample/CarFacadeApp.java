package fasada.carexample;

public class CarFacadeApp {

    public static void main(String[] args) {
        CarFacade facade = new CarFacade(
                new CarAccessoriesImpl(),
                new CarBodyImpl(),
                new CarEngineImpl(),
                new CarModelImpl());

        facade.createCompleteCar();
    }
}
