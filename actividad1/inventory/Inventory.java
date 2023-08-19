package actividad1.inventory;

import actividad1.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    static Map<String, Product> inventory = new HashMap<>();

    static {
        inventory.put("Food", new Product(1, 28000));
        inventory.put("Clothes", new Product(3, 52000));
        inventory.put("Electronics", new Product(1, 130000));

    }
    public static int retrieveStock(String type) {
        return inventory.get(type).stock;
    }
    public static int retrievePrice(String type) {
        return inventory.get(type).price;
    }


}
