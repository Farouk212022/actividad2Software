package actividad1.inventory;

import actividad1.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<Product, Integer> inventory;

    public Inventory(Map<Product, Integer> inventory){
        this.inventory = inventory;
    }


//    public static Product retrieveInventory(String type) {
//        return inventory.get(type);
//    }

    public int getProductStock(Product product){
        return inventory.getOrDefault(product, 0);
    }


}
