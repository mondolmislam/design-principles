package question02;

public class PastaHandler extends FoodHandler{
    @Override
    public boolean handleOrder(FoodOrder foodOrder) {
        if (foodOrder.getType().equals(FoodType.PIZZA)){
            return true;
        }else if (successor!=null){
            successor.handleOrder(foodOrder);
        }
        return false;
    }
}
