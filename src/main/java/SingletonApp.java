import singleton.EnumSingleton;

public class SingletonApp {

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.setCount(1);
        EnumSingleton.INSTANCE.setCount(2);
        EnumSingleton.INSTANCE.doProcess();
        EnumSingleton.INSTANCE.doProcess();
        EnumSingleton.INSTANCE.doProcess();
    }
}
