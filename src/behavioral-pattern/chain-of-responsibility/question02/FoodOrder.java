package question02;

public class FoodOrder {
    private String type;

    public FoodOrder(String foodType) {
        this.type=foodType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
