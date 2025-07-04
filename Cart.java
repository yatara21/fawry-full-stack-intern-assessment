import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        CartItem item = new CartItem(product, quantity);
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<CartItem> getItems() {
        return new ArrayList<>(items);
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (CartItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public double getShippingFees() {
        for (CartItem item : items) {
            if (item.getProduct().isShippable()) {
                return 30.0; 
            }
        }
        return 0.0; 
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (CartItem item : items) {
            if (item.getProduct().isShippable()) {
                totalWeight += item.getProduct().getWeight() * item.getQuantity();
            }
        }
        return totalWeight;
    }

    public List<CartItem> getShippableCartItems() {
        List<CartItem> shippables = new ArrayList<>();
        for (CartItem item : items) {
            if (item.getProduct().isShippable()) {
                shippables.add(item);
            }
        }
        return shippables;
    }
}
