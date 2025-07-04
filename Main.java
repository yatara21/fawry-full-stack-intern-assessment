import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       
        // prodcut 1: cheese
        Product cheese = new Product(
                "Cheese",
                100.0,  
                10,     
                true,   
                LocalDate.of(2025, 12, 31), 
                true,   
                0.2     
        );

        // prodcut 2: biscuits
        Product biscuits = new Product(
                "Biscuits",
                150.0,  
                5,      
                true,   
                LocalDate.of(2025, 12, 31), 
                true,   
                0.7     
        );
        
        // prodcut 3: tv
        Product tv = new Product(
                "TV",
                5000.0, 
                3,      
                false,  
                null,   
                true,   
                15.0    
        );
        
        // prodcut 4: mobile scratch card
        Product mobileScratchCard = new Product(
                "Mobile scratch card",
                50.0,  
                100,    
                false,  
                null,   
                false,  
                0.0     
        );

        
        System.out.println("=== Example 1: Basic Checkout ===");
        Customer customer1 = new Customer("khalid nada", 1000);
        customer1.addToCart(cheese, 2);           
        customer1.addToCart(biscuits, 1);         
        customer1.checkout();
        
        
        // System.out.println("\n=== Example 2: Digital Items Only ===");
        // Customer customer2 = new Customer("sayed nada", 1000);
        // customer2.addToCart(mobileScratchCard, 5); 
        // customer2.checkout();
        
        
        // System.out.println("\n=== Example 3: Mixed Items ===");
        // Customer customer3 = new Customer("ahmed nada", 10000);
        // customer3.addToCart(tv, 1);               // 1x TV = 5000 EGP
        // customer3.addToCart(mobileScratchCard, 2); // 2x Mobile scratch card = 100 EGP
        // customer3.checkout();
        

        // Test corner cases
        System.out.println("\n=== Testing Corner Cases ===");
        
        // Test 1: Empty cart
        // Customer emptyCustomer = new Customer("David", 1000);
        // try {
        //     emptyCustomer.checkout();
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Test 1 - Empty cart: " + e.getMessage());
        // }
        
        // Test 2: Insufficient balance
        // Customer poorCustomer = new Customer("Eve", 100);
        // poorCustomer.addToCart(tv, 1);
        // try {
        //     poorCustomer.checkout();
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Test 2 - Insufficient balance: " + e.getMessage());
        // }
        
        // Test 3: Out of stock
        // Customer stockCustomer = new Customer("Frank", 1000);
        // stockCustomer.addToCart(cheese, 15); // Only 10 available
        // try {
        //     stockCustomer.checkout();
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Test 3 - Out of stock: " + e.getMessage());
        // }
        
        // Test 4: Expired product
        // Product expiredCheese = new Product(
        //         "Expired Cheese",
        //         100.0,
        //         5,
        //         true,
        //         LocalDate.of(2020, 1, 1), // Expired date
        //         true,
        //         0.2
        // );
        // Customer expiryCustomer = new Customer("Grace", 1000);
        // expiryCustomer.addToCart(expiredCheese, 1);
        // try {
        //     expiryCustomer.checkout();
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Test 4 - Expired product: " + e.getMessage());
        }
    }

