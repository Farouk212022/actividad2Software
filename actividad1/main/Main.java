package actividad1.main;

import actividad1.orders.ClothesOrder;
import actividad1.orders.ElectronicsOrder;
import actividad1.orders.FoodOrder;
import actividad1.product.Food;

public class Main {

    public static void main(String[] args) {

        Food stockFood = new Food(12);

        FoodOrder ordenComida = new FoodOrder("Sushi");
        ClothesOrder ordenRopa = new ClothesOrder();
        ElectronicsOrder ordenElectronicos = new ElectronicsOrder();

        System.out.println();
        ordenComida.processOrder("Sushi");
        System.out.println();
        ordenElectronicos.processOrder("iPhone");
        System.out.println();
        ordenRopa.processOrder("Pant");
    }
}   