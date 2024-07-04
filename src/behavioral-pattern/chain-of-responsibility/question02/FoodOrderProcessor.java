package question02;

public class FoodOrderProcessor {
    private FoodHandler foodHandler;

    public FoodOrderProcessor(){
        PizzaHandler pizzaHandler=new PizzaHandler();
        BurgerHandler burgerHandler=new BurgerHandler();
        PastaHandler pastaHandler=new PastaHandler();
        pizzaHandler.setSuccessor(burgerHandler);
        burgerHandler.setSuccessor(pastaHandler);

        foodHandler=pizzaHandler;
    }

    public boolean processOrder(FoodOrder foodOrder){
        return foodHandler.handleOrder(foodOrder);
    }
}
