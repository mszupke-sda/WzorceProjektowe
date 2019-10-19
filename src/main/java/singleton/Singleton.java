package singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton createSingletonInstance() {

        if (singleton == null) {
            singleton = new Singleton();
            singleton.setValue("Initial value");
        }

        return singleton;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
