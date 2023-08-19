package actividad1.process;

import actividad1.inventory.Inventory;
import actividad1.templateMethod.OrderProcessingTemplate;

public class FoodProcess extends OrderProcessingTemplate{

    public FoodProcess(String name, int amount){

        this.type = "Food";
        this.name = name;
        this.amount = amount;
        new Inventory();
    }

    @Override
    public void shipProduct() {

        System.out.println();
        System.out.println("---SHIPMENT PROCESS STARTS---");
        System.out.println("A driver is waiting for your "+name);
        System.out.println("The "+name+" is ready for pickup");
        System.out.println("The driver is on your way with the "+name);
        System.out.println("---SHIPMENT PROCESS ENDS---");
        System.out.println();


    }

    @Override
    public void applyDiscount() {
        double discount = 0.05;
        System.out.println("Applying 5% anniversary discount for loyalty to the brand");
        price = price - (int) (price*discount);

    }
}
