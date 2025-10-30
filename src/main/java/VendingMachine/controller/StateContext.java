package VendingMachine.controller;

import VendingMachine.products.Product;

import java.util.ArrayList;
import java.util.List;

public class StateContext {
    private VendingState currentState;
    List<Product> products;


    public StateContext() {
        currentState = new IdleState();
        products = new ArrayList<>();
    }
    public VendingState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingState currentState) {
        this.currentState = currentState;
    }

    public void next(){
        currentState.next(this);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getCart() {
        return products;
    }

}
