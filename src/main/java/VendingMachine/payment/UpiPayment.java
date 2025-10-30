package VendingMachine.payment;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void makePayment(int amount) {
        System.out.println("Scanning QR code");
        System.out.println("Making payment");
    }
}
