import java.util.List;

public class ShippingService {
    public void ship(List<CartItem> items) {
        System.out.println("Shipping " + items.size() + " items:");
        for (CartItem item : items) {
            System.out.println("  - " + item.getQuantity() + "x " + item.getProduct().getName() + 
                             " (Weight: " + item.getProduct().getWeight() + "kg)");
        }
    }
}
