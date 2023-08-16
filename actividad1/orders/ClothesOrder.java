package actividad1.orders;

import actividad1.product.Clothes;
import actividad1.templateMethod.OrderProcessingTemplate;

public class ClothesOrder extends OrderProcessingTemplate {

    public ClothesOrder(){

    }
    @Override
    public boolean checkInventory() {
        return false;
    }

    @Override
    public void shipProduct() {

        System.out.println("SHIPMENT PROCESS STARTS");
        System.out.print("Packing Clothes in a bag");
        System.out.print("Adding bags on a box");
        System.out.print("Box shipped");
        System.out.println("SHIPMENT PROCESS ENDS");

    }
}
