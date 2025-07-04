# Fawry Rise Journey - Full Stack Development Internship Challenge

## 📋 Project Overview

This is my implementation of the **Fawry Quantum Internship Challenge 3** - an e-commerce system designed to demonstrate object-oriented programming concepts and system design skills.

## 🎯 Challenge Requirements

### Core Features Implemented:
- ✅ **Product Management**: Define products with name, price, and quantity
- ✅ **Expiry System**: Some products expire (Cheese, Biscuits) while others don't (TV, Mobile)
- ✅ **Shipping System**: Some products require shipping with weight, others don't (Mobile scratch cards)
- ✅ **Cart Management**: Add products with quantity validation
- ✅ **Checkout Process**: Complete checkout with validation and receipt generation
- ✅ **Error Handling**: Comprehensive error checking for all edge cases

### Console Output Features:
- ✅ **Shipment Notice**: Shows shippable items with weights
- ✅ **Checkout Receipt**: Displays order details, subtotal, shipping, and total
- ✅ **Error Messages**: Clear error messages for validation failures

## 🏗️ System Architecture

### Classes and Their Responsibilities:

1. **`Product`** - Represents products with all attributes
2. **`Customer`** - Manages customer data and checkout process
3. **`Cart`** - Handles shopping cart operations
4. **`CartItem`** - Represents individual items in cart
5. **`Shippable`** - Interface for shippable items
6. **`ShippingService`** - Processes shipping operations
7. **`Main`** - Demonstrates system functionality

### Key Design Patterns:
- **Interface Segregation**: Shippable interface with minimal methods
- **Single Responsibility**: Each class has a specific purpose
- **Encapsulation**: Proper data hiding and access control
- **Validation**: Comprehensive error checking at each step

## 🚀 How to Run

### Prerequisites:
- Java 8 or higher
- Git (for cloning)

### Installation & Execution:
```bash
# Clone the repository
git clone https://github.com/yatara21/fawry-full-stack-intern-assessment
cd fawry-full-stack-intern-assessment

# Compile the code
javac *.java

# Run the program
java Main
```

## 📊 Example Output

```
=== Example 1: Basic Checkout ===
** Shipment notice **
2x Cheese 200g
1x Biscuits 700g
Total package weight 1.1kg
Shipping 2 items:
  - 2x Cheese (Weight: 0.2kg)
  - 1x Biscuits (Weight: 0.7kg)
** Checkout receipt **
2x Cheese 200
1x Biscuits 150
----------------------
Subtotal 350
Shipping 30
Amount 380
```

## 🧪 Test Cases Covered

### Valid Scenarios:
1. **Basic Checkout**: Shippable items with proper validation
2. **Digital Items**: Non-shippable items (no shipping fee)
3. **Mixed Items**: Combination of shippable and non-shippable

### Error Scenarios:
1. **Empty Cart**: Attempting checkout with empty cart
2. **Insufficient Balance**: Customer doesn't have enough money
3. **Out of Stock**: Requesting more items than available
4. **Expired Products**: Attempting to buy expired items

## 📦 Product Examples

| Product | Price | Type | Expirable | Shippable | Weight |
|---------|-------|------|-----------|-----------|---------|
| Cheese | 100 EGP | Food | ✅ Yes | ✅ Yes | 0.2kg |
| Biscuits | 150 EGP | Food | ✅ Yes | ✅ Yes | 0.7kg |
| TV | 5000 EGP | Electronics | ❌ No | ✅ Yes | 15kg |
| Mobile scratch card | 50 EGP | Digital | ❌ No | ❌ No | 0kg |

## 🔧 Technical Implementation

### Key Features:
- **Date Handling**: Uses `LocalDate` for expiry management
- **Collections**: Uses `ArrayList` for cart management
- **Exception Handling**: Custom exceptions for validation errors
- **Interface Implementation**: Proper use of interfaces for abstraction

### Validation Rules: | Test Cases Criteria
- Cart cannot be empty during checkout
- Customer balance must be sufficient
- Product quantities must be available
- Expired products cannot be purchased
- Shipping fees apply only to shippable items

## 📝 Code Quality

- **Clean Code**: Well-structured and readable
- **Comments**: Comprehensive documentation
- **Error Handling**: Robust validation and error messages
- **Modularity**: Separate classes for different responsibilities
- **Extensibility**: Easy to add new features



## 📄 License

This project is created as part of the Fawry Rise Journey Internship Challenge.

---

**Author**: Khalid Elshawadfy  
**Challenge**: Fawry Quantum Internship Challenge 3  
**Date**: 05-07-2025 