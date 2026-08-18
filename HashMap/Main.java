import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String searchProduct = "Cheese";
        int shipmentAmount = 15;

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
            inventory.put(searchProduct, (inventory.get(searchProduct) + shipmentAmount));
            System.out.println(searchProduct + " restocked!");
            System.out.println(inventory.get(searchProduct));
        } else {
            System.out.println("Product not found.");
        }
    }

}