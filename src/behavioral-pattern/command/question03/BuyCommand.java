package command.question03;

public class BuyCommand implements Command {
    private Stock stock;
    private int quantity;

    public BuyCommand(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        stock.buy(quantity);
    }

    @Override
    public void undo() {
        stock.sell(quantity);
    }
}
