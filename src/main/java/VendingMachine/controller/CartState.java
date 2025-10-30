package VendingMachine.controller;

import VendingMachine.products.Product;

import java.util.List;

public class CartState implements VendingState{
    @Override
    public void next(StateContext context) {
        List<Product> products = context.getCart();
        System.out.println("Following items added to cart:" + products);
        context.setCurrentState(new PayState());
    }
}
