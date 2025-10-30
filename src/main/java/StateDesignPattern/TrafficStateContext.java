package StateDesignPattern;

import StateDesignPattern.Lights.RedLight;
import StateDesignPattern.Lights.TrafficLightState;

public class TrafficStateContext {
    private TrafficLightState currentState;

    TrafficStateContext(){
        currentState = new RedLight();
    }

    public TrafficLightState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(TrafficLightState currentState) {
        this.currentState = currentState;
    }

    public void next(){
        currentState.next(this);
    }


}
