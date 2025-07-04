import java.time.LocalDate;

public class Product implements Shippable {
    private String name;
    private double price;
    private int quantity;
    private boolean expirable;
    private LocalDate expiryDate;
    private boolean requiresShipping;
    private double weight;

    public Product(String name, double price, int quantity, boolean expirable,
                   LocalDate expiryDate, boolean requiresShipping, double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirable = expirable;
        this.expiryDate = expiryDate;
        this.requiresShipping = requiresShipping;
        this.weight = weight;
    }

    // Shippable interface methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    // Product-specific methods
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isExpirable() {
        return expirable;
    }

    public boolean isExpired() {
        if (!expirable) return false;
        return expiryDate.isBefore(LocalDate.now());
    }

    public boolean isAvailable(int qty) {
        return qty <= quantity;
    }

    public boolean isShippable() {
        return requiresShipping;
    }

    public void reduceQuantity(int qty) {
        quantity -= qty;
    }
}
