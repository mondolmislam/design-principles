package command.question03;

public class TradingApp {
    private CommandHistory commandHistory = new CommandHistory();
    private Stock stock = new Stock("AAPL", 100);

    // Method to buy a stock
    public void buyStock(int quantity) {
        BuyCommand command = new BuyCommand(stock, quantity);
        command.execute();
        if (commandHistory.isUndoable()) {
            commandHistory.addCommand(command);
        }
    }

    // Method to sell a stock
    public void sellStock(int quantity) {
        SellCommand command = new SellCommand(stock, quantity);
        command.execute();
        if (commandHistory.isUndoable()) {
            commandHistory.addCommand(command);
        }
    }

    // Method to undo the last trade
    public void undoLastTrade() {
        if (commandHistory.isUndoable()) {
            Command command = commandHistory.remove();
            command.undo();
        }
    }

    public static void main(String[] args) {
        TradingApp app = new TradingApp();
        app.buyStock(50);
        app.sellStock(25);
        app.buyStock(75);
        app.undoLastTrade();
    }

}
