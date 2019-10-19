package singleton;

public enum EnumSingleton {

    INSTANCE;

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void doProcess() {
        System.out.println(this.count);
    }
}
