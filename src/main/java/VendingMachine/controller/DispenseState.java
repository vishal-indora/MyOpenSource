package VendingMachine.controller;

import VendingMachine.products.Product;

import java.util.List;

public class DispenseState implements VendingState{
    @Override
    public void next(StateContext context) {
        System.out.println("Dispensing items");
        List<Product> products = context.getCart();
        System.out.println("Dispensed these items to user: "+ products);
        // updates
        context.setCurrentState(new IdleState());
    }
}
