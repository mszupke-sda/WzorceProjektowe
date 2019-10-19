package most;

public class MostApp {

    public static void main(String[] args) {
        Switch tvButton = new ClickSwitch(new TV());

        tvButton.on();
        tvButton.off();

        Switch radioButton = new ClickSwitch(new Radio());

        radioButton.on();
        radioButton.off();

        Switch lampButton = new ClickSwitch(new Lamp());

        lampButton.on();
        lampButton.off();
    }
}
