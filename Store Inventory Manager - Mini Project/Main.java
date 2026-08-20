import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {

        Product footBall = new Product("Football", 7.99, 18);
        Product basketBall = new Product("Basketball", 9.99, 40);
        Product soccerBall = new Product("Soccer", 4.99, 15);
        Product baseBall = new Product("Baseball", 3.99, 125);
        Product tennisBall = new Product("Tennis", 1.99, 250);

        HashMap<String, Product> inventory = new HashMap<>();
        inventory.put(footBall.getName(), footBall);
        inventory.put(basketBall.getName(), basketBall);
        inventory.put(soccerBall.getName(), soccerBall);
        inventory.put(baseBall.getName(), baseBall);
        inventory.put(tennisBall.getName(), tennisBall);

        HashMap<String, Integer> sales = new HashMap<>();

        String searchProduct = "Baseball";

        String productToSell = "Baseball";
        int amountToSell = 3;

        String productToRestock = "Football";
        int amountToRestock = 25;

        if(inventory.containsKey(searchProduct)) {
            Product foundProduct = inventory.get(searchProduct);
            System.out.println("PRODUCT FOUND");
            System.out.println("Name: " + foundProduct.getName());
            System.out.printf("Price: $%.2f%n", foundProduct.getPrice());
            System.out.println("Quantity: " + foundProduct.getQuantity());
        } else {
            System.out.println("Product not found.");
        }

        if(!inventory.containsKey(productToSell)) {
            System.out.println("Product not found.");
        } else {
            Product foundProductToSell = inventory.get(productToSell);
            if(foundProductToSell.getQuantity() < amountToSell) {
                System.out.println("Not enough " + foundProductToSell.getName() + " in stock.");
                System.out.println("Available: " + foundProductToSell.getQuantity());
                System.out.println("Requested: " + amountToSell);
            } else {
                foundProductToSell.sellQuantity(amountToSell);
                int previouslySold = sales.getOrDefault(foundProductToSell.getName(), 0);
                previouslySold += amountToSell;
                sales.put(foundProductToSell.getName(), previouslySold);
                System.out.println("SALE COMPLETE");
                System.out.println("Product: " + foundProductToSell.getName());
                System.out.println("Quantity Sold: " + amountToSell);
                System.out.println("Remaining: " + foundProductToSell.getQuantity());
            }
        }



        if(!inventory.containsKey(productToRestock)) {
            System.out.println("Product not found.");
        } else {
            Product foundProductToRestock = inventory.get(productToRestock);
            foundProductToRestock.restockProduct(amountToRestock);
            System.out.println("RESTOCK COMPLETE");
            System.out.println("Product: " + foundProductToRestock.getName());
            System.out.println("Added: " + amountToRestock);
            System.out.println("New Quantity: " + foundProductToRestock.getQuantity());
        }





    }


}
