package SmartHome;

public class Light implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("Turn ON light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn OFF light");
    }
}
