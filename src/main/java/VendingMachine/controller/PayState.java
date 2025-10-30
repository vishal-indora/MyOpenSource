package VendingMachine.controller;

import VendingMachine.payment.PaymentStrategy;
import VendingMachine.payment.UpiPayment;
import VendingMachine.products.Product;

import java.util.List;

public class PayState implements VendingState{
    @Override
    public void next(StateContext context) {
        List<Product> cart = context.getCart();

        System.out.println("Items added : " + cart);
        int total = 0;
        for(Product p: cart) total += p.getPrice();

        System.out.println("Total Price: " + total);

        System.out.println("Choose a payment method: ");

        PaymentStrategy strategy = new UpiPayment();
        strategy.makePayment(total);
        context.setCurrentState(new DispenseState());
    }
}
