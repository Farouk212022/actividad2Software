package actividad1.orders;

import actividad1.templateMethod.OrderProcessingTemplate;

public class FoodOrder extends OrderProcessingTemplate{

    public FoodOrder(String name){
        this.name = name;
    }
    @Override
    public boolean checkInventory() {

        return false;
    }

    @Override
    public void shipProduct() {
        System.out.println("SHIPMENT PROCESS STARTS");
        System.out.print("Adding nutritional table on box");
        System.out.print("Adding stickers about care for the box");
        System.out.print("Packing food in the box");
        System.out.print("Box shipped");
        System.out.println("SHIPMENT PROCESS ENDS");

    }
}
