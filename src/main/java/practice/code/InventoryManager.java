package practice.code;

import java.util.HashMap;
import java.util.Map;

//inventory manager class that uses a Map that adds, removes , list and updates products
public class InventoryManager {
    private Map<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    // Remove a product from the inventory
    public void removeProduct(int id) {
        inventory.remove(id);
    }

    // List all products in the inventory
    public void listProducts() {
        for (Product product : inventory.values()) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuantity());
        }
    }

    // Update a product in the inventory
    public void updateProduct(int id, String name, int quantity) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setName(name);
            product.setQuantity(quantity);
        }
    }

}
