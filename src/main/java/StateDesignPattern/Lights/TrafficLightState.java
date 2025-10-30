package StateDesignPattern.Lights;

import StateDesignPattern.TrafficStateContext;

public interface TrafficLightState {
    void next(TrafficStateContext context);
}
