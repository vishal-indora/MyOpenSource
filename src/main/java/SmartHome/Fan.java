package SmartHome;

public class Fan implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("Turned ON fan");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned OFF fan");
    }
}
