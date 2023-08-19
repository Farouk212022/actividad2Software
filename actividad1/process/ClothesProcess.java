package actividad1.process;

import actividad1.inventory.Inventory;
import actividad1.templateMethod.OrderProcessingTemplate;


public class ClothesProcess extends OrderProcessingTemplate {


    public ClothesProcess(Inventory clothesInventory) {
        super(clothesInventory);
    }

    @Override
    public void shipProduct() {
        System.out.println();
        System.out.println("---SHIPMENT PROCESS STARTS---");
        System.out.println("Packing "+order.getName()+" in a bag");
        System.out.println("Adding bags on a box");
        System.out.println("Box shipped");
        System.out.println("---SHIPMENT PROCESS ENDS---");
        System.out.println();

    }

    @Override
    public void applyDiscount() {
        double discount = 0.10;
        System.out.println("Applying 10% off season sale");
        order.setPrice(order.getPrice() - (int) (order.getPrice()*discount));

    }

}
