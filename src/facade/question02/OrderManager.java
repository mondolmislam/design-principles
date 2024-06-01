public class OrderManagement {
    private InventoryManagement inventoryManagement=new InventoryManagement();
    private OrderTracking orderTracking=new OrderTracking();
    private ShippingManagement shippingManagement=new ShippingManagement();
    private PaymentProcessor paymentProcessor=new PaymentProcessor();

    public OrderFacade() {
        inventoryManager = new InventoryManager();
        shippingManager = new ShippingManager();
        paymentProcessor = new PaymentProcessor();
        orderTracking = new OrderTracking();
    }

    public void processOrder(Order order) {
        if (inventoryManager.checkInventory(order)) {
            paymentProcessor.chargeCreditCard(order);
            shippingManager.shipOrder(order);
            orderTracking.updateOrderStatus(order, "shipped");
        } else {
            orderTracking.updateOrderStatus(order, "out of stock");
        }
    }
}
