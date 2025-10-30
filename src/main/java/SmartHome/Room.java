package SmartHome;

import java.util.List;

public class Room implements SmartComponent{
    public List<SmartComponent> appliances;

    @Override
    public void turnOn() {
        for(SmartComponent component:appliances) {
            component.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for(SmartComponent component: appliances) {
            component.turnOff();
        }

    }
}
