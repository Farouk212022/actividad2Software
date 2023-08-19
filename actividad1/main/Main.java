package actividad1.main;

import actividad1.inventory.Inventory;
import actividad1.process.ClothesProcess;
import actividad1.process.ElectronicsProcess;
import actividad1.process.FoodProcess;
import actividad1.product.Product;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        Inventory foodInventory = new Inventory(new HashMap<>() {{
            put(Product.HAMBURGER, 8);
            put(Product.PIZZA, 6);
            put(Product.HOTDOG, 3);
        }});

        Inventory clothesInventory = new Inventory(new HashMap<>() {{
            put(Product.SKIRT, 3);
            put(Product.JEANS, 8);
            put(Product.POLO, 1);
        }});

        Inventory electronicsInventory = new Inventory(new  HashMap<>() {{
            put(Product.SMARTTV, 3);
            put(Product.COMPUTER, 8);
            put(Product.AIRPODS, 1);
        }});

        FoodProcess foodProcessor = new FoodProcess(foodInventory);
        ClothesProcess clothesProcess = new ClothesProcess(clothesInventory);
        ElectronicsProcess electronicsProcess = new ElectronicsProcess( electronicsInventory);

        System.out.println();
        foodProcessor.processOrder(Product.HAMBURGER, 2);
        System.out.println();
        clothesProcess.processOrder(Product.POLO, 1);
        System.out.println();
        electronicsProcess.processOrder(Product.AIRPODS, 1);
    }
}   