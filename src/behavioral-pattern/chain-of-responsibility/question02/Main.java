package question02;

public class Main {
    public static void main(String[] args) {
        FoodOrderProcessor processor = new FoodOrderProcessor();
        FoodOrder foodOrder = new FoodOrder(FoodType.PIZZA);
        boolean success = processor.processOrder(foodOrder);
        if (success) {
            System.out.println("Food order processed successfully");
        } else {
            System.out.println("Food order processing failed");
        }
    }
}
