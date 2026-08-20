import java.util.Map;

import javax.lang.model.element.QualifiedNameable;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String searchProduct = "Cheese";
        int shipmentAmount = 15;
        String discontinuedProduct = "Cheese";
        String lowQuaProd = "" ;
        int lowQua = 0;
        int totalUnits = 0;

        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Milk", 4);
        inventory.put("Eggs", 4);
        inventory.put("Cereal", 7);
        inventory.put("Bread", 6);

        System.out.println(inventory.get("Bread"));

        System.out.println(inventory.get("Bread"));

        if(inventory.containsKey(searchProduct)) {
            System.out.println(searchProduct + " found! Quantity: " + inventory.get(searchProduct));
        } else {
            System.out.println("Product not found.");
        }

        if(inventory.containsKey(searchProduct)) {
            inventory.put(searchProduct, inventory.get(searchProduct) + shipmentAmount);
            System.out.println(searchProduct + " restocked!");
            System.out.println(inventory.get(searchProduct));
        } else {
            System.out.println("Product not found.");
        }

        if(inventory.containsKey(discontinuedProduct)) {
            System.out.println(inventory.get(discontinuedProduct));
            inventory.remove(discontinuedProduct);
            if(!inventory.containsKey(discontinuedProduct)) {
                System.out.println(discontinuedProduct + " discontinued.");
            }
        } else {
            System.out.println("Product not found.");
        }

        for(Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " units");
        }

        for(Map.Entry<String, Integer> entry : inventory.entrySet()) {
                if(lowQuaProd == "") {
                    lowQua = entry.getValue();
                    lowQuaProd = entry.getKey();
            }   else if(entry.getValue() < lowQua) {
                    lowQua = entry.getValue();
                    lowQuaProd = entry.getKey();
            } else if(entry.getValue() == lowQua) {
                lowQuaProd = entry.getKey() + " & " + lowQuaProd;
            }
        }

        if(lowQuaProd == "") {
            System.out.println("Product not found.");
        } else {
            System.out.println("LOWEST STOCK: " + lowQuaProd);
            System.out.println("Quantity: " + lowQua);
        }

        for(Integer productAmount : inventory.values()) {
            totalUnits += productAmount;
        }

        HashMap<String, Integer> sales = new HashMap<>();

        String soldProduct = "";
        String[] soldProducts = {
            "Bread",
            "Milk",
            "Bread",
            "Eggs",
            "Bread",
            "Milk",
            "Cereal",
            "Bread"
        };

        for(String product : soldProducts) {
            sales.put(product, sales.getOrDefault(product, 0) + 1);
        }

        System.out.println(sales);

        HashMap<String, Integer> purchaseCounts = new HashMap<>();

        String[] customers = {
            "Aden",
            "Sarah",
            "Mike",
            "Aden",
            "Sarah",
            "Aden",
            "Jessica",
            "Mike",
            "Aden"
        };

        for(String customer : customers) {
            purchaseCounts.put(customer, purchaseCounts.getOrDefault(customer, 0) + 1);
        }

        System.out.println(purchaseCounts);

        HashMap<String, Double> prices = new HashMap<>();

        prices.put("Keyboard", 79.99);
        prices.put("Mouse", 29.99);
        prices.put("Monitor", 249.99);
        prices.put("Headphones", 59.99);

        String[] shoppingList = {
            "Mouse",
            "Keyboard",
            "Webcam",
            "Headphones"
        };

        for(String item : shoppingList) {
            prices.put(item, prices.getOrDefault(item, 0.00) + 1.00);
        }

        System.out.println(prices);

        inventory.put("Keyboard", 12);
        inventory.put("Mouse", 7);
        inventory.put("Monitor", 4);
        inventory.put("Headphones", 15);
        inventory.put("Webcam", 6);

        String highestProduct = "";
        int highestQua = 0;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if(highestProduct == null) {
                highestQua = entry.getValue();
                highestProduct = entry.getKey();
            } else if(highestQua < entry.getValue()) {
                highestQua = entry.getValue();
                highestProduct = entry.getKey();
            }
        }

        HashMap<String, String> departments = new HashMap<>();

        departments.put("Aden", "Tech");
        departments.put("Sarah", "Finance");
        departments.put("Aden", "Operations");

        String employeeName = "Jessica";

        System.out.println(employeeName + " - " + departments.getOrDefault(employeeName, "Unassigned"));

        HashMap<String, Integer> orderInventory = new HashMap<>();

        orderInventory.put("Footballs", 24);
        orderInventory.put("Basketballs", 16);
        orderInventory.put("Futbols", 3);
        orderInventory.put("Baseballs", 75);
        orderInventory.put("Gloves", 8);

        String orderedProduct = "Baseballs";
        int orderedQuantity = 90;

        if(orderInventory.containsKey(orderedProduct)) {
            int currentQuantity = orderInventory.get(orderedProduct);
            if(currentQuantity >= orderedQuantity) {
                orderInventory.put(orderedProduct, currentQuantity - orderedQuantity);
                System.out.println("Order Complete.");
            } else {
                System.out.println("Not enough product for order.");
            }
        } else {
            System.out.println("Product not found.");
        }

        HashMap<String, Double> prizes = new HashMap<>();

        prizes.put("Bear", 1.23);
        prizes.put("Turtle", 7.53);
        prizes.put("Bunny", 4.99);
        prizes.put("Elephant", 10.23);
        prizes.put("Tiger", 3.79);

        String productToUpdate = "Bear";
        double priceIncrease = 5.00;

        if(prizes.containsKey(productToUpdate)) {
            double currentPrice = prizes.get(productToUpdate) + priceIncrease;
            prizes.put(productToUpdate, currentPrice );
            System.out.println("Price Updated!");
            System.out.printf("Old price: $%.2f%n", (prizes.get(productToUpdate) - priceIncrease));
            System.out.println("New price: $" + prizes.get(productToUpdate));
        } else {
            System.out.println("Product not found.");
        }


    }

}