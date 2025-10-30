package VendingMachine.products;

public class Chips implements Product{

    private int quantity;

    public Chips(){
        quantity = 1;
    }

    @Override
    public int getPrice() {
        return quantity * 10;
    }

    public int getQuantity(){
        return quantity;
    }

    public void add(int numbers){
        quantity += numbers;
    }
}
