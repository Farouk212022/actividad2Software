package actividad1.process;

import actividad1.inventory.Inventory;
import actividad1.templateMethod.OrderProcessingTemplate;

public class ElectronicsProcess extends OrderProcessingTemplate {

    public ElectronicsProcess(Inventory electronicsInventory){

        super(electronicsInventory);

    }
    @Override
    public void shipProduct() {

        System.out.println();
        System.out.println("---SHIPMENT PROCESS STARTS---");
        System.out.println("Creating unique identifier for the "+order.getName());
        System.out.println("Adding stickers about care for the box");
        System.out.println("Box shipped");
        System.out.println("---SHIPMENT PROCESS ENDS---");
        System.out.println();
    }

    @Override
    public void applyDiscount() {
        double discount = 0.20;
        System.out.println("Applying 20% student discount");
        order.setPrice(order.getPrice() - (int) (order.getPrice()*discount));
    }
}
