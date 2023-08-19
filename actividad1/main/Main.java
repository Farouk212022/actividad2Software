package actividad1.main;

import actividad1.inventory.Inventory;
import actividad1.order.ClothesOrderProcess;
import actividad1.order.ElectronicsOrder;
import actividad1.order.FoodOrder;
import actividad1.product.Product;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

        Inventory foodInventory = new Inventory(new HashMap<Product, Integer>() {{
            put(Product.HAMBURGER, 80);
            put(Product.PIZZA, 6);
            put(Product.HOTDOG, 3);
        }});

        Inventory clothesInventory = new Inventory(new HashMap<Product, Integer>() {{
            put(Product.HAMBURGER, 80);
            put(Product.PIZZA, 6);
            put(Product.HOTDOG, 3);
        }});

        FoodOrder foodProcessor = new FoodProcess(foodInventory);
        ClothesOrderProcess clothesOrderProcess = new ClothesOrderProcess(clothesInventory);
        ElectronicsOrder electronicsProcess = new ElectronicsOrder("SmartTV", 2);

        System.out.println();
        foodProcessor.processOrder(Product.HAMBURGER, 3);
        System.out.println();
        clothesProcess.processOrder();
        System.out.println();
        electronicsProcess.processOrder();
    }
}   