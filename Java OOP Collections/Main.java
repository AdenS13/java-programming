import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product eggs = new Product("Eggs", 9.99, 12);
        Product milk = new Product("Milk", 4.99, 1);
        Product cereal = new Product("Cereal", 7.99, 1);
        Product diaper = new Product("Diaper", 21.99, 40);

        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(eggs);
        inventory.add(milk);
        inventory.add(cereal);
        inventory.add(diaper);

        double totalWorth = 0;
        int lowStock = 0;
        String purchaseName = "Eggs";
        int purchaseQuantity = 3;
        Product firstPurchase = null;
        String restockName = "Eggs";
        int restockQuantity = 12;
        Product reStock = null;
        Product highestValueProduct = null;
        double totalHighestValue = 0;
        Product needsRestock = null;
        double priorityScore = 0;
        Product discountedProduct = null;
        double invValue = 0;

        for(Product product : inventory) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " - " + product.getQuantity() + " in stock");
        }

        for(Product product : inventory) {
            double currentWorth;
            currentWorth = product.getPrice() * product.getQuantity();
            totalWorth += currentWorth;
        }

        System.out.printf("Total inventory value: $%.2f%n", totalWorth);

        for(Product product : inventory) {
            if(product.getQuantity() < 5) {
                System.out.println("LOW STOCK: " + product.getName() + " - " + product.getQuantity() + " remaining.");
                lowStock++;
            }
        }

        if(lowStock == 0) {
            System.out.println("No products are currently low stock.");
        } else {
            System.out.println("Total low-stock products: " + lowStock);
        }

        for(Product product : inventory) {
            if(product.getName().equals(purchaseName)) {
                firstPurchase = product;
                if(product.getQuantity() - purchaseQuantity < 0) {
                    System.out.println("Not enough inventory.");
                } else {
                    product.purchaseQuantity(purchaseQuantity);
                    System.out.println("Purchase Successful!");
                    System.out.println(product.getName() + " now has " + product.getQuantity() + " remaining.");
                }
                break;
            }
        }

        if(firstPurchase == null) {
            System.out.println("Product not found.");
        }

        for(Product product : inventory) {
            if(product.getName().equals(restockName)) {
                reStock = product;
                product.restockQuantity(restockQuantity);
                System.out.println("Restock Successful!");
                System.out.println(product.getName() + " went from " + (product.getQuantity() - restockQuantity) + " to " + product.getQuantity() + " units." );
                break;
            }
        }

        if(reStock == null) {
            System.out.println("Product not found.");
        }

        for(Product product : inventory) {
            double currentHighestValue = product.getQuantity() * product.getPrice();
            if(highestValueProduct == null) {
                highestValueProduct = product;
                totalHighestValue = highestValueProduct.getQuantity() * highestValueProduct.getPrice();
            } else if(currentHighestValue >  totalHighestValue) {
                highestValueProduct = product;
                totalHighestValue = currentHighestValue;
            }
        }

        System.out.println("Most valuable inventory product: " + highestValueProduct.getName());
        System.out.println("Price: $" + highestValueProduct.getPrice());
        System.out.println("Quantity: " + highestValueProduct.getQuantity());
        System.out.printf("Total value: $%.2f%n", totalHighestValue);

        for(Product product : inventory) {
            double currentScore = product.getPrice() / product.getQuantity();
            if(product.getQuantity() == 0) {
                currentScore = 0;
            }
            if(needsRestock == null) {
                needsRestock = product;
                priorityScore = currentScore;
            } else if(currentScore > priorityScore) {
                needsRestock = product;
                priorityScore = currentScore;
            }
        }

        System.out.println("Highest restock priority: " + needsRestock.getName());
        System.out.println("Quantity: " + needsRestock.getQuantity());
        System.out.println("Priority score: " + priorityScore);

        for(Product product : inventory) {
            double currentValue = product.getQuantity() * product.getPrice();
            if(product.getQuantity() > 5 && product.getPrice() >= 20) {   
                if(currentValue > invValue) {
                    discountedProduct = product;
                    invValue = currentValue;
                }
            }
        }

        if(discountedProduct == null) {
            System.out.println("No products qualify for clearance.");
        } else {
            System.out.println("CLEARANCE PRODUCT: " + discountedProduct.getName());
            System.out.println("Price: $" + discountedProduct.getPrice());
            System.out.println("Quantity: " + discountedProduct.getQuantity());
            System.out.printf("Inventory value: $%.2f%n", invValue);
        }

    }
}