package actividad1.main;

import actividad1.process.ClothesProcess;
import actividad1.process.ElectronicsProcess;
import actividad1.process.FoodProcess;


public class Main {

    public static void main(String[] args) {

        FoodProcess foodProcess = new FoodProcess("Pizza", 2);
        ClothesProcess clothesProcess = new ClothesProcess("Skirt", 2);
        ElectronicsProcess electronicsProcess = new ElectronicsProcess("SmartTV", 1);

        foodProcess.processOrder();

        clothesProcess.processOrder();

        electronicsProcess.processOrder();
    }
}   