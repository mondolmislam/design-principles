package question02;

public abstract class FoodHandler {
    protected FoodHandler successor;
    public void setSuccessor(FoodHandler successor){
        this.successor=successor;
    }
    public abstract boolean handleOrder(FoodOrder foodOrder);
}
