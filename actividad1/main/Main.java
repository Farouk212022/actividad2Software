package actividad1.main;

import actividad1.order.ClothesOrder;
import actividad1.order.ElectronicsOrder;
import actividad1.order.FoodOrder;


public class Main {

    public static void main(String[] args) {

        FoodOrder foodProcess = new FoodOrder("Pizza", 1);
        ClothesOrder clothesProcess = new ClothesOrder("Skirt", 2);
        ElectronicsOrder electronicsProcess = new ElectronicsOrder("SmartTV", 2);

        System.out.println();
        foodProcess.processOrder();
        System.out.println();
        clothesProcess.processOrder();
        System.out.println();
        electronicsProcess.processOrder();
    }
}   