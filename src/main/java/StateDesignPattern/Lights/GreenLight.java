package StateDesignPattern.Lights;

import StateDesignPattern.TrafficStateContext;

public class GreenLight implements TrafficLightState{
    @Override
    public void next(TrafficStateContext context) {
        context.setCurrentState(new RedLight());
    }
}
