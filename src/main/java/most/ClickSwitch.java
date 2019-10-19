package most;

public class ClickSwitch extends Switch {

    public ClickSwitch(Device device) {
        super(device);
    }

    public void on() {
        device.on();
    }

    public void off() {
        device.off();
    }
}
