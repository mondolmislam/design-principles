package command.question03;

public class Stock {
    private String name;
    private int quantity;
    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public void buy(int quantity){
        System.out.println("Buy..");
    }
    public void sell(int quantity){
        System.out.println("Selling.........");
    }
}
