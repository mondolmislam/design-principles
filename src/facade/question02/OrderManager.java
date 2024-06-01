public class OrderManager {
    private InventoryManager inventoryManager;
    private OrderTracking orderTracking;
    private ShippingManager shippingManager;
    private PaymentProcessor paymentProcessor;

    public OrderManager() {
        inventoryManager = new InventoryManager();
        shippingManager = new ShippingManager();
        paymentProcessor = new PaymentProcessor();
        orderTracking = new OrderTracking();
    }

    public void processOrder(Order order) {
        if (inventoryManager.checkInventory(order)) {
            paymentProcessor.chargePaymentCart(order);
            shippingManager.shipOrder(order);
            orderTracking.updateOrderStatus(order, "shipped");
        } else {
            orderTracking.updateOrderStatus(order, "out of stock");
        }
    }
}
