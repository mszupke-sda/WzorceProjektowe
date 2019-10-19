package fasada.carexample;

public class CarFacade {

    private final CarAccessories accessories;
    private final CarBody body;
    private final CarEngine engine;
    private final CarModel model;

    public CarFacade(CarAccessories accessories, CarBody body, CarEngine engine, CarModel model)
    {
        this.accessories = accessories;
        this.body = body;
        this.engine = engine;
        this.model = model;
    }

    public void createCompleteCar()
    {
        System.out.println("Creating a Car\n");
        model.setModel();
        engine.setEngine();
        body.setBody();
        accessories.setAccessories();

        System.out.println("\nCar creation is completed.");
    }
}
