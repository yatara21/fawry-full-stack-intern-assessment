import java.util.List;

public class Customer {
    private String name;
    private double balance;
    private Cart cart;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Cart getCart() {
        return cart;
    }

    public void addToCart(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Not enough quantity in stock.");
        }
        cart.addItem(product, quantity);
    }

    public void checkout() {
        if (cart.isEmpty()) {
            throw new IllegalArgumentException("Cart is empty.");
        }
    
        for (CartItem item : cart.getItems()) {
            Product p = item.getProduct();
            if (p.isExpirable() && p.isExpired()) {
                throw new IllegalArgumentException("Product " + p.getName() + " is expired.");
            }
            if (!p.isAvailable(item.getQuantity())) {
                throw new IllegalArgumentException("Product " + p.getName() + " is out of stock.");
            }
        }
    
        double subtotal = cart.getSubtotal();
        double shippingFees = cart.getShippingFees();
        double total = subtotal + shippingFees;
    
        if (balance < total) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    
        List<CartItem> toShip = cart.getShippableCartItems();
        if (!toShip.isEmpty()) {
            System.out.println("** Shipment notice **");
            for (CartItem item : toShip) {
                System.out.println(item.getQuantity() + "x " + item.getProduct().getName() + " " + 
                                 (int)(item.getProduct().getWeight() * 1000) + "g");
            }
            System.out.println("Total package weight " + String.format("%.1f", cart.getTotalWeight()) + "kg");
        }
    
        for (CartItem item : cart.getItems()) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }
    
        balance -= total;
    
        if (!toShip.isEmpty()) {
            ShippingService service = new ShippingService();
            service.ship(toShip);
        }
    
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName() + " " + (int)item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + (int)subtotal);
        System.out.println("Shipping " + (int)shippingFees);
        System.out.println("Amount " + (int)total);
    
        cart = new Cart(); 
    }
    
    
}
