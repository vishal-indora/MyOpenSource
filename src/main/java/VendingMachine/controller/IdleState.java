package VendingMachine.controller;

public class IdleState implements VendingState{
    @Override
    public void next(StateContext context) {
        context.setCurrentState(new CartState());
    }
}
