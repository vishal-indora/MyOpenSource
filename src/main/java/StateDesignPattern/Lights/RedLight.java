package StateDesignPattern.Lights;

import StateDesignPattern.TrafficStateContext;

public class RedLight implements TrafficLightState{
    @Override
    public void next(TrafficStateContext context) {
        context.setCurrentState(new GreenLight());
    }
}
