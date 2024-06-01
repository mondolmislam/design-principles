package singleton.question01;

import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private static StockManager instance;
    private Map<String,Integer> stock;
    public StockManager(){
        stock=new HashMap<>();
    }

    public static synchronized StockManager getInstance(){
        if (instance==null){
            instance=new StockManager();
        }
        return instance;
    }

    public Map<String,Integer> getStock(){
        return stock;
    }

    public void updateStock(String product,int quantity){
        stock.put(product,quantity);
    }
}
