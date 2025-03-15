// Online Retail Order Management
class Order{
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}
class ShippedOrder extends  Order{
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OROManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-03-15");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-03-14", "TRK98765");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-03-13", "TRK12345", "2025-03-16");

        order.displayOrderDetails();
        System.out.println();
        shippedOrder.displayOrderDetails();
        System.out.println();
        deliveredOrder.displayOrderDetails();
    }
}
