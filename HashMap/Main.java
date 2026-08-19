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




    }

}