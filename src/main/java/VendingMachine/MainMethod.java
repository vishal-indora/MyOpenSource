package VendingMachine;

import VendingMachine.controller.StateContext;
import VendingMachine.products.Chips;
import VendingMachine.products.Product;

public class MainMethod {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        // I have initiated my machine in idle state
        // user is being shown different products here

        System.out.println("Add products"); // here i can sort of have a UI or cli to add different products
        Product chips = new Chips();
        context.addProduct(chips);

        // move to next Cart State
        context.next();

        // move to payment
        context.next();

        // move to dispense
        context.next();
        context.next();

        System.out.println("Doing it only once, this will be an infinite loop");
    }
}
