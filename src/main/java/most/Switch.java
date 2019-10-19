package most;

public abstract class Switch {

    protected Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public abstract void on();

    public abstract void off();
}
