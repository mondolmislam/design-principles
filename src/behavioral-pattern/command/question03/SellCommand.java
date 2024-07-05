package command.question03;

public class SellCommand implements Command{
    private Stock stock;
    private int quantity;

    public SellCommand(Stock stock,int quantity){
        this.stock=stock;
        this.quantity=quantity;
    }
    @Override
    public void execute() {
        stock.sell(quantity);
    }

    @Override
    public void undo() {
        stock.buy(quantity);
    }
}
